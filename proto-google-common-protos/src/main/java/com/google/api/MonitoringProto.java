// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitoring.proto

package com.google.api;

public final class MonitoringProto {
  private MonitoringProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Monitoring_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Monitoring_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Monitoring_MonitoringDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033google/api/monitoring.proto\022\ngoogle.ap" +
      "i\"\354\001\n\nMonitoring\022K\n\025producer_destination" +
      "s\030\001 \003(\0132,.google.api.Monitoring.Monitori" +
      "ngDestination\022K\n\025consumer_destinations\030\002" +
      " \003(\0132,.google.api.Monitoring.MonitoringD" +
      "estination\032D\n\025MonitoringDestination\022\032\n\022m" +
      "onitored_resource\030\001 \001(\t\022\017\n\007metrics\030\002 \003(\t" +
      "Bq\n\016com.google.apiB\017MonitoringProtoP\001ZEg" +
      "oogle.golang.org/genproto/googleapis/api" +
      "/serviceconfig;serviceconfig\242\002\004GAPIb\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_api_Monitoring_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Monitoring_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Monitoring_descriptor,
        new String[] { "ProducerDestinations", "ConsumerDestinations", });
    internal_static_google_api_Monitoring_MonitoringDestination_descriptor =
      internal_static_google_api_Monitoring_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Monitoring_MonitoringDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Monitoring_MonitoringDestination_descriptor,
        new String[] { "MonitoredResource", "Metrics", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
