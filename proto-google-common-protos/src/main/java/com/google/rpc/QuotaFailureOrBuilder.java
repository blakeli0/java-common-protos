// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface QuotaFailureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.QuotaFailure)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  java.util.List<QuotaFailure.Violation>
      getViolationsList();
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  QuotaFailure.Violation getViolations(int index);
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  int getViolationsCount();
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  java.util.List<? extends QuotaFailure.ViolationOrBuilder>
      getViolationsOrBuilderList();
  /**
   * <pre>
   * Describes all quota violations.
   * </pre>
   *
   * <code>repeated .google.rpc.QuotaFailure.Violation violations = 1;</code>
   */
  QuotaFailure.ViolationOrBuilder getViolationsOrBuilder(
      int index);
}
