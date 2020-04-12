// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request.proto

package lucky.xjz.rpc.tcpclient;

public final class RequestProto {
  private RequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:message.RequestMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string rpc_version = 1;</code>
     */
    java.lang.String getRpcVersion();
    /**
     * <code>string rpc_version = 1;</code>
     */
    com.google.protobuf.ByteString
        getRpcVersionBytes();

    /**
     * <code>string id = 2;</code>
     */
    java.lang.String getId();
    /**
     * <code>string id = 2;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>string method_name = 3;</code>
     */
    java.lang.String getMethodName();
    /**
     * <code>string method_name = 3;</code>
     */
    com.google.protobuf.ByteString
        getMethodNameBytes();

    /**
     * <code>repeated bytes params = 4;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getParamsList();
    /**
     * <code>repeated bytes params = 4;</code>
     */
    int getParamsCount();
    /**
     * <code>repeated bytes params = 4;</code>
     */
    com.google.protobuf.ByteString getParams(int index);
  }
  /**
   * Protobuf type {@code message.RequestMessage}
   */
  public  static final class RequestMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:message.RequestMessage)
      RequestMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RequestMessage.newBuilder() to construct.
    private RequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestMessage() {
      rpcVersion_ = "";
      id_ = "";
      methodName_ = "";
      params_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RequestMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RequestMessage(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              rpcVersion_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              methodName_ = s;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                params_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000001;
              }
              params_.add(input.readBytes());
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          params_ = java.util.Collections.unmodifiableList(params_); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RequestProto.internal_static_message_RequestMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RequestProto.internal_static_message_RequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestProto.RequestMessage.class, RequestProto.RequestMessage.Builder.class);
    }

    public static final int RPC_VERSION_FIELD_NUMBER = 1;
    private volatile java.lang.Object rpcVersion_;
    /**
     * <code>string rpc_version = 1;</code>
     */
    public java.lang.String getRpcVersion() {
      java.lang.Object ref = rpcVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rpcVersion_ = s;
        return s;
      }
    }
    /**
     * <code>string rpc_version = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRpcVersionBytes() {
      java.lang.Object ref = rpcVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rpcVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object id_;
    /**
     * <code>string id = 2;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>string id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METHOD_NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object methodName_;
    /**
     * <code>string method_name = 3;</code>
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        methodName_ = s;
        return s;
      }
    }
    /**
     * <code>string method_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMS_FIELD_NUMBER = 4;
    private java.util.List<com.google.protobuf.ByteString> params_;
    /**
     * <code>repeated bytes params = 4;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getParamsList() {
      return params_;
    }
    /**
     * <code>repeated bytes params = 4;</code>
     */
    public int getParamsCount() {
      return params_.size();
    }
    /**
     * <code>repeated bytes params = 4;</code>
     */
    public com.google.protobuf.ByteString getParams(int index) {
      return params_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getRpcVersionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rpcVersion_);
      }
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
      }
      if (!getMethodNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, methodName_);
      }
      for (int i = 0; i < params_.size(); i++) {
        output.writeBytes(4, params_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRpcVersionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rpcVersion_);
      }
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
      }
      if (!getMethodNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, methodName_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < params_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(params_.get(i));
        }
        size += dataSize;
        size += 1 * getParamsList().size();
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
      if (!(obj instanceof RequestProto.RequestMessage)) {
        return super.equals(obj);
      }
      RequestProto.RequestMessage other = (RequestProto.RequestMessage) obj;

      if (!getRpcVersion()
          .equals(other.getRpcVersion())) return false;
      if (!getId()
          .equals(other.getId())) return false;
      if (!getMethodName()
          .equals(other.getMethodName())) return false;
      if (!getParamsList()
          .equals(other.getParamsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RPC_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getRpcVersion().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + METHOD_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getMethodName().hashCode();
      if (getParamsCount() > 0) {
        hash = (37 * hash) + PARAMS_FIELD_NUMBER;
        hash = (53 * hash) + getParamsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestProto.RequestMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestProto.RequestMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestProto.RequestMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestProto.RequestMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestProto.RequestMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestProto.RequestMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestProto.RequestMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestProto.RequestMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestProto.RequestMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestProto.RequestMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestProto.RequestMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestProto.RequestMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RequestProto.RequestMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code message.RequestMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:message.RequestMessage)
        RequestProto.RequestMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RequestProto.internal_static_message_RequestMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RequestProto.internal_static_message_RequestMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestProto.RequestMessage.class, RequestProto.RequestMessage.Builder.class);
      }

      // Construct using lucky.xjz.rpc.tcpclient.RequestProto.RequestMessage.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        rpcVersion_ = "";

        id_ = "";

        methodName_ = "";

        params_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RequestProto.internal_static_message_RequestMessage_descriptor;
      }

      @java.lang.Override
      public RequestProto.RequestMessage getDefaultInstanceForType() {
        return RequestProto.RequestMessage.getDefaultInstance();
      }

      @java.lang.Override
      public RequestProto.RequestMessage build() {
        RequestProto.RequestMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public RequestProto.RequestMessage buildPartial() {
        RequestProto.RequestMessage result = new RequestProto.RequestMessage(this);
        int from_bitField0_ = bitField0_;
        result.rpcVersion_ = rpcVersion_;
        result.id_ = id_;
        result.methodName_ = methodName_;
        if (((bitField0_ & 0x00000001) != 0)) {
          params_ = java.util.Collections.unmodifiableList(params_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.params_ = params_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RequestProto.RequestMessage) {
          return mergeFrom((RequestProto.RequestMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestProto.RequestMessage other) {
        if (other == RequestProto.RequestMessage.getDefaultInstance()) return this;
        if (!other.getRpcVersion().isEmpty()) {
          rpcVersion_ = other.rpcVersion_;
          onChanged();
        }
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getMethodName().isEmpty()) {
          methodName_ = other.methodName_;
          onChanged();
        }
        if (!other.params_.isEmpty()) {
          if (params_.isEmpty()) {
            params_ = other.params_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamsIsMutable();
            params_.addAll(other.params_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RequestProto.RequestMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestProto.RequestMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object rpcVersion_ = "";
      /**
       * <code>string rpc_version = 1;</code>
       */
      public java.lang.String getRpcVersion() {
        java.lang.Object ref = rpcVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          rpcVersion_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string rpc_version = 1;</code>
       */
      public com.google.protobuf.ByteString
          getRpcVersionBytes() {
        java.lang.Object ref = rpcVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          rpcVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string rpc_version = 1;</code>
       */
      public Builder setRpcVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        rpcVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string rpc_version = 1;</code>
       */
      public Builder clearRpcVersion() {
        
        rpcVersion_ = getDefaultInstance().getRpcVersion();
        onChanged();
        return this;
      }
      /**
       * <code>string rpc_version = 1;</code>
       */
      public Builder setRpcVersionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        rpcVersion_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>string id = 2;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string id = 2;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string id = 2;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>string id = 2;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object methodName_ = "";
      /**
       * <code>string method_name = 3;</code>
       */
      public java.lang.String getMethodName() {
        java.lang.Object ref = methodName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          methodName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string method_name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMethodNameBytes() {
        java.lang.Object ref = methodName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          methodName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string method_name = 3;</code>
       */
      public Builder setMethodName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        methodName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string method_name = 3;</code>
       */
      public Builder clearMethodName() {
        
        methodName_ = getDefaultInstance().getMethodName();
        onChanged();
        return this;
      }
      /**
       * <code>string method_name = 3;</code>
       */
      public Builder setMethodNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        methodName_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> params_ = java.util.Collections.emptyList();
      private void ensureParamsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          params_ = new java.util.ArrayList<com.google.protobuf.ByteString>(params_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated bytes params = 4;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getParamsList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(params_) : params_;
      }
      /**
       * <code>repeated bytes params = 4;</code>
       */
      public int getParamsCount() {
        return params_.size();
      }
      /**
       * <code>repeated bytes params = 4;</code>
       */
      public com.google.protobuf.ByteString getParams(int index) {
        return params_.get(index);
      }
      /**
       * <code>repeated bytes params = 4;</code>
       */
      public Builder setParams(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureParamsIsMutable();
        params_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes params = 4;</code>
       */
      public Builder addParams(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureParamsIsMutable();
        params_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes params = 4;</code>
       */
      public Builder addAllParams(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureParamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, params_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes params = 4;</code>
       */
      public Builder clearParams() {
        params_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:message.RequestMessage)
    }

    // @@protoc_insertion_point(class_scope:message.RequestMessage)
    private static final RequestProto.RequestMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestProto.RequestMessage();
    }

    public static RequestProto.RequestMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestMessage>
        PARSER = new com.google.protobuf.AbstractParser<RequestMessage>() {
      @java.lang.Override
      public RequestMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public RequestProto.RequestMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_RequestMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_message_RequestMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rrequest.proto\022\007message\"V\n\016RequestMessa" +
      "ge\022\023\n\013rpc_version\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022\023\n\013m" +
      "ethod_name\030\003 \001(\t\022\016\n\006params\030\004 \003(\014B\"\n\022core" +
      ".message.protoB\014RequestProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_message_RequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_message_RequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_message_RequestMessage_descriptor,
        new java.lang.String[] { "RpcVersion", "Id", "MethodName", "Params", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
