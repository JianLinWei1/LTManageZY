// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: version/version.message.proto

package com.ljzn.grpc.version;

public final class VersionMessageOuterClass {
  private VersionMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VisitorSystem_cq_VersionMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VisitorSystem_cq_VersionMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035version/version.message.proto\022\020Visitor" +
      "System_cq\"A\n\016VersionMessage\022\014\n\004name\030\001 \001(" +
      "\t\022\017\n\007version\030\002 \001(\003\022\020\n\010belongId\030\003 \001(\005B#\n\025" +
      "com.ljzn.grpc.versionP\001\242\002\007VERSIONb\006proto" +
      "3"
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
    internal_static_VisitorSystem_cq_VersionMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VisitorSystem_cq_VersionMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VisitorSystem_cq_VersionMessage_descriptor,
        new java.lang.String[] { "Name", "Version", "BelongId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
