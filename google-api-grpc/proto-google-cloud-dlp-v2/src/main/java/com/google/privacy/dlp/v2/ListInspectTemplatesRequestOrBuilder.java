// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ListInspectTemplatesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListInspectTemplatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to `ListInspectTemplates`.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional page token to continue retrieval. Comes from previous call
   * to `ListInspectTemplates`.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Optional size of the page, can be limited by server. If zero server returns
   * a page of max size 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();
}
