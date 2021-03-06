// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p2beta1;

public interface TextAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p2beta1.TextAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * Confidence for the track of detected text. It is calculated as the highest
   * over all frames where OCR detected text appears.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  float getConfidence();

  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextFrame frames = 3;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextFrame> 
      getFramesList();
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextFrame frames = 3;</code>
   */
  com.google.cloud.videointelligence.v1p2beta1.TextFrame getFrames(int index);
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextFrame frames = 3;</code>
   */
  int getFramesCount();
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextFrame frames = 3;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.TextFrameOrBuilder> 
      getFramesOrBuilderList();
  /**
   * <pre>
   * Information related to the frames where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextFrame frames = 3;</code>
   */
  com.google.cloud.videointelligence.v1p2beta1.TextFrameOrBuilder getFramesOrBuilder(
      int index);

  /**
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 4;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1p2beta1.TextSegment> 
      getSegmentsList();
  /**
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 4;</code>
   */
  com.google.cloud.videointelligence.v1p2beta1.TextSegment getSegments(int index);
  /**
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 4;</code>
   */
  int getSegmentsCount();
  /**
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 4;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder> 
      getSegmentsOrBuilderList();
  /**
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1p2beta1.TextSegment segments = 4;</code>
   */
  com.google.cloud.videointelligence.v1p2beta1.TextSegmentOrBuilder getSegmentsOrBuilder(
      int index);
}
