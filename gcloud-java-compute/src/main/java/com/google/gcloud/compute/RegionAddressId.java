/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gcloud.compute;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.MoreObjects;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Identity for a Google Compute Engine region address.
 */
public final class RegionAddressId extends RegionResourceId implements AddressId {

  private static final String REGEX = RegionResourceId.REGEX + "addresses/([^/]+)";
  private static final Pattern PATTERN = Pattern.compile(REGEX);
  private static final long serialVersionUID = 8170980880371085238L;

  private final String address;

  private RegionAddressId(String project, String region, String address) {
    super(project, region);
    this.address = checkNotNull(address);
  }

  @Override
  public Type type() {
    return Type.REGION;
  }

  @Override
  public String address() {
    return address;
  }

  @Override
  public String selfLink() {
    return super.selfLink() + "/addresses/" + address;
  }

  @Override
  MoreObjects.ToStringHelper toStringHelper() {
    return super.toStringHelper().add("address", address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseHashCode(), address);
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof RegionAddressId
        && baseEquals((RegionAddressId) obj)
        && Objects.equals(address, ((RegionAddressId) obj).address);
  }

  @Override
  RegionAddressId setProjectId(String projectId) {
    if (project() != null) {
      return this;
    }
    return RegionAddressId.of(projectId, region(), address);
  }

  /**
   * Returns a region address identity given the region identity and the address name. The address
   * name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression {@code [a-z]([-a-z0-9]*[a-z0-9])?} which means
   * the first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   *
   * @see <a href="https://www.ietf.org/rfc/rfc1035.txt">RFC1035</a>
   */
  public static RegionAddressId of(RegionId regionId, String address) {
    return new RegionAddressId(regionId.project(), regionId.region(), address);
  }

  /**
   * Returns a region address identity given the region and address names. The address name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression {@code [a-z]([-a-z0-9]*[a-z0-9])?} which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   *
   * @see <a href="https://www.ietf.org/rfc/rfc1035.txt">RFC1035</a>
   */
  public static RegionAddressId of(String region, String address) {
    return new RegionAddressId(null, region, address);
  }

  /**
   * Returns a region address identity given project, region and address names. The address name
   * must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression {@code [a-z]([-a-z0-9]*[a-z0-9])?} which means
   * the first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   *
   * @see <a href="https://www.ietf.org/rfc/rfc1035.txt">RFC1035</a>
   */
  public static RegionAddressId of(String project, String region, String address) {
    return new RegionAddressId(project, region, address);
  }

  /**
   * Returns {@code true} if the provided string matches the expected format of a region address
   * URL. Returns {@code false} otherwise.
   */
  static boolean matchesUrl(String url) {
    return PATTERN.matcher(url).matches();
  }

  static RegionAddressId fromUrl(String url) {
    Matcher matcher = PATTERN.matcher(url);
    if (!matcher.matches()) {
      throw new IllegalArgumentException(url + " is not a valid region address URL");
    }
    return RegionAddressId.of(matcher.group(1), matcher.group(2), matcher.group(3));
  }
}
