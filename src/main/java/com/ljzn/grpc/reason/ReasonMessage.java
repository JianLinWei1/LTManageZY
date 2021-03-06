// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reason/reason.message.proto

package com.ljzn.grpc.reason;

/**
 * Protobuf type {@code VisitorSystem_cq.ReasonMessage}
 */
public  final class ReasonMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VisitorSystem_cq.ReasonMessage)
    ReasonMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReasonMessage.newBuilder() to construct.
  private ReasonMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReasonMessage() {
    reasonId_ = 0;
    reasonName_ = "";
    belongId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReasonMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            reasonId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            reasonName_ = s;
            break;
          }
          case 24: {

            belongId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ljzn.grpc.reason.ReasonMessageOuterClass.internal_static_VisitorSystem_cq_ReasonMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ljzn.grpc.reason.ReasonMessageOuterClass.internal_static_VisitorSystem_cq_ReasonMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ljzn.grpc.reason.ReasonMessage.class, com.ljzn.grpc.reason.ReasonMessage.Builder.class);
  }

  public static final int REASONID_FIELD_NUMBER = 1;
  private int reasonId_;
  /**
   * <pre>
   *uuid
   * </pre>
   *
   * <code>int32 reasonId = 1;</code>
   */
  public int getReasonId() {
    return reasonId_;
  }

  public static final int REASONNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object reasonName_;
  /**
   * <code>string reasonName = 2;</code>
   */
  public java.lang.String getReasonName() {
    java.lang.Object ref = reasonName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reasonName_ = s;
      return s;
    }
  }
  /**
   * <code>string reasonName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getReasonNameBytes() {
    java.lang.Object ref = reasonName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reasonName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BELONGID_FIELD_NUMBER = 3;
  private int belongId_;
  /**
   * <code>int32 belongId = 3;</code>
   */
  public int getBelongId() {
    return belongId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (reasonId_ != 0) {
      output.writeInt32(1, reasonId_);
    }
    if (!getReasonNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reasonName_);
    }
    if (belongId_ != 0) {
      output.writeInt32(3, belongId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reasonId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, reasonId_);
    }
    if (!getReasonNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reasonName_);
    }
    if (belongId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, belongId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ljzn.grpc.reason.ReasonMessage)) {
      return super.equals(obj);
    }
    com.ljzn.grpc.reason.ReasonMessage other = (com.ljzn.grpc.reason.ReasonMessage) obj;

    boolean result = true;
    result = result && (getReasonId()
        == other.getReasonId());
    result = result && getReasonName()
        .equals(other.getReasonName());
    result = result && (getBelongId()
        == other.getBelongId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REASONID_FIELD_NUMBER;
    hash = (53 * hash) + getReasonId();
    hash = (37 * hash) + REASONNAME_FIELD_NUMBER;
    hash = (53 * hash) + getReasonName().hashCode();
    hash = (37 * hash) + BELONGID_FIELD_NUMBER;
    hash = (53 * hash) + getBelongId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.reason.ReasonMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ljzn.grpc.reason.ReasonMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code VisitorSystem_cq.ReasonMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VisitorSystem_cq.ReasonMessage)
      com.ljzn.grpc.reason.ReasonMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ljzn.grpc.reason.ReasonMessageOuterClass.internal_static_VisitorSystem_cq_ReasonMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljzn.grpc.reason.ReasonMessageOuterClass.internal_static_VisitorSystem_cq_ReasonMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljzn.grpc.reason.ReasonMessage.class, com.ljzn.grpc.reason.ReasonMessage.Builder.class);
    }

    // Construct using com.ljzn.grpc.reason.ReasonMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      reasonId_ = 0;

      reasonName_ = "";

      belongId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ljzn.grpc.reason.ReasonMessageOuterClass.internal_static_VisitorSystem_cq_ReasonMessage_descriptor;
    }

    public com.ljzn.grpc.reason.ReasonMessage getDefaultInstanceForType() {
      return com.ljzn.grpc.reason.ReasonMessage.getDefaultInstance();
    }

    public com.ljzn.grpc.reason.ReasonMessage build() {
      com.ljzn.grpc.reason.ReasonMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ljzn.grpc.reason.ReasonMessage buildPartial() {
      com.ljzn.grpc.reason.ReasonMessage result = new com.ljzn.grpc.reason.ReasonMessage(this);
      result.reasonId_ = reasonId_;
      result.reasonName_ = reasonName_;
      result.belongId_ = belongId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ljzn.grpc.reason.ReasonMessage) {
        return mergeFrom((com.ljzn.grpc.reason.ReasonMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ljzn.grpc.reason.ReasonMessage other) {
      if (other == com.ljzn.grpc.reason.ReasonMessage.getDefaultInstance()) return this;
      if (other.getReasonId() != 0) {
        setReasonId(other.getReasonId());
      }
      if (!other.getReasonName().isEmpty()) {
        reasonName_ = other.reasonName_;
        onChanged();
      }
      if (other.getBelongId() != 0) {
        setBelongId(other.getBelongId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ljzn.grpc.reason.ReasonMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ljzn.grpc.reason.ReasonMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int reasonId_ ;
    /**
     * <pre>
     *uuid
     * </pre>
     *
     * <code>int32 reasonId = 1;</code>
     */
    public int getReasonId() {
      return reasonId_;
    }
    /**
     * <pre>
     *uuid
     * </pre>
     *
     * <code>int32 reasonId = 1;</code>
     */
    public Builder setReasonId(int value) {
      
      reasonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *uuid
     * </pre>
     *
     * <code>int32 reasonId = 1;</code>
     */
    public Builder clearReasonId() {
      
      reasonId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object reasonName_ = "";
    /**
     * <code>string reasonName = 2;</code>
     */
    public java.lang.String getReasonName() {
      java.lang.Object ref = reasonName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reasonName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reasonName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getReasonNameBytes() {
      java.lang.Object ref = reasonName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reasonName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reasonName = 2;</code>
     */
    public Builder setReasonName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reasonName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reasonName = 2;</code>
     */
    public Builder clearReasonName() {
      
      reasonName_ = getDefaultInstance().getReasonName();
      onChanged();
      return this;
    }
    /**
     * <code>string reasonName = 2;</code>
     */
    public Builder setReasonNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reasonName_ = value;
      onChanged();
      return this;
    }

    private int belongId_ ;
    /**
     * <code>int32 belongId = 3;</code>
     */
    public int getBelongId() {
      return belongId_;
    }
    /**
     * <code>int32 belongId = 3;</code>
     */
    public Builder setBelongId(int value) {
      
      belongId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 belongId = 3;</code>
     */
    public Builder clearBelongId() {
      
      belongId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:VisitorSystem_cq.ReasonMessage)
  }

  // @@protoc_insertion_point(class_scope:VisitorSystem_cq.ReasonMessage)
  private static final com.ljzn.grpc.reason.ReasonMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ljzn.grpc.reason.ReasonMessage();
  }

  public static com.ljzn.grpc.reason.ReasonMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReasonMessage>
      PARSER = new com.google.protobuf.AbstractParser<ReasonMessage>() {
    public ReasonMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReasonMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReasonMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReasonMessage> getParserForType() {
    return PARSER;
  }

  public com.ljzn.grpc.reason.ReasonMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

