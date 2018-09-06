// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: visitor/visitor.service.proto

package com.ljzn.grpc.visitor;

/**
 * Protobuf type {@code VisitorSystem_cq.VisitorUploadRequest}
 */
public  final class VisitorUploadRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VisitorSystem_cq.VisitorUploadRequest)
    VisitorUploadRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VisitorUploadRequest.newBuilder() to construct.
  private VisitorUploadRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VisitorUploadRequest() {
    clientId_ = "";
    clientSecret_ = "";
    belongId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VisitorUploadRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            clientId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clientSecret_ = s;
            break;
          }
          case 26: {
            com.ljzn.grpc.visitor.VisitorMessage.Builder subBuilder = null;
            if (visitor_ != null) {
              subBuilder = visitor_.toBuilder();
            }
            visitor_ = input.readMessage(com.ljzn.grpc.visitor.VisitorMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(visitor_);
              visitor_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

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
    return com.ljzn.grpc.visitor.VisitorService.internal_static_VisitorSystem_cq_VisitorUploadRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ljzn.grpc.visitor.VisitorService.internal_static_VisitorSystem_cq_VisitorUploadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ljzn.grpc.visitor.VisitorUploadRequest.class, com.ljzn.grpc.visitor.VisitorUploadRequest.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object clientId_;
  /**
   * <code>string client_id = 1;</code>
   */
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <code>string client_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_SECRET_FIELD_NUMBER = 2;
  private volatile java.lang.Object clientSecret_;
  /**
   * <pre>
   *设备编号的加盐MD5值，盐值由客户端与服务器端约定
   * </pre>
   *
   * <code>string client_secret = 2;</code>
   */
  public java.lang.String getClientSecret() {
    java.lang.Object ref = clientSecret_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientSecret_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *设备编号的加盐MD5值，盐值由客户端与服务器端约定
   * </pre>
   *
   * <code>string client_secret = 2;</code>
   */
  public com.google.protobuf.ByteString
      getClientSecretBytes() {
    java.lang.Object ref = clientSecret_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientSecret_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VISITOR_FIELD_NUMBER = 3;
  private com.ljzn.grpc.visitor.VisitorMessage visitor_;
  /**
   * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
   */
  public boolean hasVisitor() {
    return visitor_ != null;
  }
  /**
   * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
   */
  public com.ljzn.grpc.visitor.VisitorMessage getVisitor() {
    return visitor_ == null ? com.ljzn.grpc.visitor.VisitorMessage.getDefaultInstance() : visitor_;
  }
  /**
   * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
   */
  public com.ljzn.grpc.visitor.VisitorMessageOrBuilder getVisitorOrBuilder() {
    return getVisitor();
  }

  public static final int BELONGID_FIELD_NUMBER = 4;
  private int belongId_;
  /**
   * <code>int32 belongId = 4;</code>
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
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (!getClientSecretBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientSecret_);
    }
    if (visitor_ != null) {
      output.writeMessage(3, getVisitor());
    }
    if (belongId_ != 0) {
      output.writeInt32(4, belongId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (!getClientSecretBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientSecret_);
    }
    if (visitor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVisitor());
    }
    if (belongId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, belongId_);
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
    if (!(obj instanceof com.ljzn.grpc.visitor.VisitorUploadRequest)) {
      return super.equals(obj);
    }
    com.ljzn.grpc.visitor.VisitorUploadRequest other = (com.ljzn.grpc.visitor.VisitorUploadRequest) obj;

    boolean result = true;
    result = result && getClientId()
        .equals(other.getClientId());
    result = result && getClientSecret()
        .equals(other.getClientSecret());
    result = result && (hasVisitor() == other.hasVisitor());
    if (hasVisitor()) {
      result = result && getVisitor()
          .equals(other.getVisitor());
    }
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + CLIENT_SECRET_FIELD_NUMBER;
    hash = (53 * hash) + getClientSecret().hashCode();
    if (hasVisitor()) {
      hash = (37 * hash) + VISITOR_FIELD_NUMBER;
      hash = (53 * hash) + getVisitor().hashCode();
    }
    hash = (37 * hash) + BELONGID_FIELD_NUMBER;
    hash = (53 * hash) + getBelongId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ljzn.grpc.visitor.VisitorUploadRequest parseFrom(
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
  public static Builder newBuilder(com.ljzn.grpc.visitor.VisitorUploadRequest prototype) {
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
   * Protobuf type {@code VisitorSystem_cq.VisitorUploadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VisitorSystem_cq.VisitorUploadRequest)
      com.ljzn.grpc.visitor.VisitorUploadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ljzn.grpc.visitor.VisitorService.internal_static_VisitorSystem_cq_VisitorUploadRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ljzn.grpc.visitor.VisitorService.internal_static_VisitorSystem_cq_VisitorUploadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ljzn.grpc.visitor.VisitorUploadRequest.class, com.ljzn.grpc.visitor.VisitorUploadRequest.Builder.class);
    }

    // Construct using com.ljzn.grpc.visitor.VisitorUploadRequest.newBuilder()
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
      clientId_ = "";

      clientSecret_ = "";

      if (visitorBuilder_ == null) {
        visitor_ = null;
      } else {
        visitor_ = null;
        visitorBuilder_ = null;
      }
      belongId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ljzn.grpc.visitor.VisitorService.internal_static_VisitorSystem_cq_VisitorUploadRequest_descriptor;
    }

    public com.ljzn.grpc.visitor.VisitorUploadRequest getDefaultInstanceForType() {
      return com.ljzn.grpc.visitor.VisitorUploadRequest.getDefaultInstance();
    }

    public com.ljzn.grpc.visitor.VisitorUploadRequest build() {
      com.ljzn.grpc.visitor.VisitorUploadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ljzn.grpc.visitor.VisitorUploadRequest buildPartial() {
      com.ljzn.grpc.visitor.VisitorUploadRequest result = new com.ljzn.grpc.visitor.VisitorUploadRequest(this);
      result.clientId_ = clientId_;
      result.clientSecret_ = clientSecret_;
      if (visitorBuilder_ == null) {
        result.visitor_ = visitor_;
      } else {
        result.visitor_ = visitorBuilder_.build();
      }
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
      if (other instanceof com.ljzn.grpc.visitor.VisitorUploadRequest) {
        return mergeFrom((com.ljzn.grpc.visitor.VisitorUploadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ljzn.grpc.visitor.VisitorUploadRequest other) {
      if (other == com.ljzn.grpc.visitor.VisitorUploadRequest.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (!other.getClientSecret().isEmpty()) {
        clientSecret_ = other.clientSecret_;
        onChanged();
      }
      if (other.hasVisitor()) {
        mergeVisitor(other.getVisitor());
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
      com.ljzn.grpc.visitor.VisitorUploadRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ljzn.grpc.visitor.VisitorUploadRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <code>string client_id = 1;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_id = 1;</code>
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1;</code>
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <code>string client_id = 1;</code>
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clientSecret_ = "";
    /**
     * <pre>
     *设备编号的加盐MD5值，盐值由客户端与服务器端约定
     * </pre>
     *
     * <code>string client_secret = 2;</code>
     */
    public java.lang.String getClientSecret() {
      java.lang.Object ref = clientSecret_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientSecret_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *设备编号的加盐MD5值，盐值由客户端与服务器端约定
     * </pre>
     *
     * <code>string client_secret = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClientSecretBytes() {
      java.lang.Object ref = clientSecret_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientSecret_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *设备编号的加盐MD5值，盐值由客户端与服务器端约定
     * </pre>
     *
     * <code>string client_secret = 2;</code>
     */
    public Builder setClientSecret(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientSecret_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *设备编号的加盐MD5值，盐值由客户端与服务器端约定
     * </pre>
     *
     * <code>string client_secret = 2;</code>
     */
    public Builder clearClientSecret() {
      
      clientSecret_ = getDefaultInstance().getClientSecret();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *设备编号的加盐MD5值，盐值由客户端与服务器端约定
     * </pre>
     *
     * <code>string client_secret = 2;</code>
     */
    public Builder setClientSecretBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientSecret_ = value;
      onChanged();
      return this;
    }

    private com.ljzn.grpc.visitor.VisitorMessage visitor_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ljzn.grpc.visitor.VisitorMessage, com.ljzn.grpc.visitor.VisitorMessage.Builder, com.ljzn.grpc.visitor.VisitorMessageOrBuilder> visitorBuilder_;
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public boolean hasVisitor() {
      return visitorBuilder_ != null || visitor_ != null;
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public com.ljzn.grpc.visitor.VisitorMessage getVisitor() {
      if (visitorBuilder_ == null) {
        return visitor_ == null ? com.ljzn.grpc.visitor.VisitorMessage.getDefaultInstance() : visitor_;
      } else {
        return visitorBuilder_.getMessage();
      }
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public Builder setVisitor(com.ljzn.grpc.visitor.VisitorMessage value) {
      if (visitorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        visitor_ = value;
        onChanged();
      } else {
        visitorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public Builder setVisitor(
        com.ljzn.grpc.visitor.VisitorMessage.Builder builderForValue) {
      if (visitorBuilder_ == null) {
        visitor_ = builderForValue.build();
        onChanged();
      } else {
        visitorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public Builder mergeVisitor(com.ljzn.grpc.visitor.VisitorMessage value) {
      if (visitorBuilder_ == null) {
        if (visitor_ != null) {
          visitor_ =
            com.ljzn.grpc.visitor.VisitorMessage.newBuilder(visitor_).mergeFrom(value).buildPartial();
        } else {
          visitor_ = value;
        }
        onChanged();
      } else {
        visitorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public Builder clearVisitor() {
      if (visitorBuilder_ == null) {
        visitor_ = null;
        onChanged();
      } else {
        visitor_ = null;
        visitorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public com.ljzn.grpc.visitor.VisitorMessage.Builder getVisitorBuilder() {
      
      onChanged();
      return getVisitorFieldBuilder().getBuilder();
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    public com.ljzn.grpc.visitor.VisitorMessageOrBuilder getVisitorOrBuilder() {
      if (visitorBuilder_ != null) {
        return visitorBuilder_.getMessageOrBuilder();
      } else {
        return visitor_ == null ?
            com.ljzn.grpc.visitor.VisitorMessage.getDefaultInstance() : visitor_;
      }
    }
    /**
     * <code>.VisitorSystem_cq.VisitorMessage visitor = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ljzn.grpc.visitor.VisitorMessage, com.ljzn.grpc.visitor.VisitorMessage.Builder, com.ljzn.grpc.visitor.VisitorMessageOrBuilder> 
        getVisitorFieldBuilder() {
      if (visitorBuilder_ == null) {
        visitorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ljzn.grpc.visitor.VisitorMessage, com.ljzn.grpc.visitor.VisitorMessage.Builder, com.ljzn.grpc.visitor.VisitorMessageOrBuilder>(
                getVisitor(),
                getParentForChildren(),
                isClean());
        visitor_ = null;
      }
      return visitorBuilder_;
    }

    private int belongId_ ;
    /**
     * <code>int32 belongId = 4;</code>
     */
    public int getBelongId() {
      return belongId_;
    }
    /**
     * <code>int32 belongId = 4;</code>
     */
    public Builder setBelongId(int value) {
      
      belongId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 belongId = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:VisitorSystem_cq.VisitorUploadRequest)
  }

  // @@protoc_insertion_point(class_scope:VisitorSystem_cq.VisitorUploadRequest)
  private static final com.ljzn.grpc.visitor.VisitorUploadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ljzn.grpc.visitor.VisitorUploadRequest();
  }

  public static com.ljzn.grpc.visitor.VisitorUploadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VisitorUploadRequest>
      PARSER = new com.google.protobuf.AbstractParser<VisitorUploadRequest>() {
    public VisitorUploadRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VisitorUploadRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VisitorUploadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VisitorUploadRequest> getParserForType() {
    return PARSER;
  }

  public com.ljzn.grpc.visitor.VisitorUploadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
