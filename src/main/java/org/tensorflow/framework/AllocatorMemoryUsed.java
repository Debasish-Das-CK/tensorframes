// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/step_stats.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.AllocatorMemoryUsed}
 */
public  final class AllocatorMemoryUsed extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tensorflow.AllocatorMemoryUsed)
    AllocatorMemoryUsedOrBuilder {
  // Use AllocatorMemoryUsed.newBuilder() to construct.
  private AllocatorMemoryUsed(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AllocatorMemoryUsed() {
    allocatorName_ = "";
    totalBytes_ = 0L;
    peakBytes_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AllocatorMemoryUsed(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            allocatorName_ = s;
            break;
          }
          case 16: {

            totalBytes_ = input.readInt64();
            break;
          }
          case 24: {

            peakBytes_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.AllocatorMemoryUsed.class, org.tensorflow.framework.AllocatorMemoryUsed.Builder.class);
  }

  public static final int ALLOCATOR_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object allocatorName_;
  /**
   * <code>optional string allocator_name = 1;</code>
   */
  public java.lang.String getAllocatorName() {
    java.lang.Object ref = allocatorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      allocatorName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string allocator_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAllocatorNameBytes() {
    java.lang.Object ref = allocatorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      allocatorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_BYTES_FIELD_NUMBER = 2;
  private long totalBytes_;
  /**
   * <code>optional int64 total_bytes = 2;</code>
   */
  public long getTotalBytes() {
    return totalBytes_;
  }

  public static final int PEAK_BYTES_FIELD_NUMBER = 3;
  private long peakBytes_;
  /**
   * <code>optional int64 peak_bytes = 3;</code>
   */
  public long getPeakBytes() {
    return peakBytes_;
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
    if (!getAllocatorNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, allocatorName_);
    }
    if (totalBytes_ != 0L) {
      output.writeInt64(2, totalBytes_);
    }
    if (peakBytes_ != 0L) {
      output.writeInt64(3, peakBytes_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAllocatorNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, allocatorName_);
    }
    if (totalBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalBytes_);
    }
    if (peakBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, peakBytes_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.tensorflow.framework.AllocatorMemoryUsed parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.AllocatorMemoryUsed prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.AllocatorMemoryUsed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.AllocatorMemoryUsed)
      org.tensorflow.framework.AllocatorMemoryUsedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.AllocatorMemoryUsed.class, org.tensorflow.framework.AllocatorMemoryUsed.Builder.class);
    }

    // Construct using org.tensorflow.framework.AllocatorMemoryUsed.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      allocatorName_ = "";

      totalBytes_ = 0L;

      peakBytes_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.StepStatsProtos.internal_static_tensorflow_AllocatorMemoryUsed_descriptor;
    }

    public org.tensorflow.framework.AllocatorMemoryUsed getDefaultInstanceForType() {
      return org.tensorflow.framework.AllocatorMemoryUsed.getDefaultInstance();
    }

    public org.tensorflow.framework.AllocatorMemoryUsed build() {
      org.tensorflow.framework.AllocatorMemoryUsed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.AllocatorMemoryUsed buildPartial() {
      org.tensorflow.framework.AllocatorMemoryUsed result = new org.tensorflow.framework.AllocatorMemoryUsed(this);
      result.allocatorName_ = allocatorName_;
      result.totalBytes_ = totalBytes_;
      result.peakBytes_ = peakBytes_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.AllocatorMemoryUsed) {
        return mergeFrom((org.tensorflow.framework.AllocatorMemoryUsed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.AllocatorMemoryUsed other) {
      if (other == org.tensorflow.framework.AllocatorMemoryUsed.getDefaultInstance()) return this;
      if (!other.getAllocatorName().isEmpty()) {
        allocatorName_ = other.allocatorName_;
        onChanged();
      }
      if (other.getTotalBytes() != 0L) {
        setTotalBytes(other.getTotalBytes());
      }
      if (other.getPeakBytes() != 0L) {
        setPeakBytes(other.getPeakBytes());
      }
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
      org.tensorflow.framework.AllocatorMemoryUsed parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.AllocatorMemoryUsed) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object allocatorName_ = "";
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public java.lang.String getAllocatorName() {
      java.lang.Object ref = allocatorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        allocatorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAllocatorNameBytes() {
      java.lang.Object ref = allocatorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        allocatorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public Builder setAllocatorName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      allocatorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public Builder clearAllocatorName() {
      
      allocatorName_ = getDefaultInstance().getAllocatorName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string allocator_name = 1;</code>
     */
    public Builder setAllocatorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      allocatorName_ = value;
      onChanged();
      return this;
    }

    private long totalBytes_ ;
    /**
     * <code>optional int64 total_bytes = 2;</code>
     */
    public long getTotalBytes() {
      return totalBytes_;
    }
    /**
     * <code>optional int64 total_bytes = 2;</code>
     */
    public Builder setTotalBytes(long value) {
      
      totalBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 total_bytes = 2;</code>
     */
    public Builder clearTotalBytes() {
      
      totalBytes_ = 0L;
      onChanged();
      return this;
    }

    private long peakBytes_ ;
    /**
     * <code>optional int64 peak_bytes = 3;</code>
     */
    public long getPeakBytes() {
      return peakBytes_;
    }
    /**
     * <code>optional int64 peak_bytes = 3;</code>
     */
    public Builder setPeakBytes(long value) {
      
      peakBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 peak_bytes = 3;</code>
     */
    public Builder clearPeakBytes() {
      
      peakBytes_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.AllocatorMemoryUsed)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.AllocatorMemoryUsed)
  private static final org.tensorflow.framework.AllocatorMemoryUsed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.AllocatorMemoryUsed();
  }

  public static org.tensorflow.framework.AllocatorMemoryUsed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllocatorMemoryUsed>
      PARSER = new com.google.protobuf.AbstractParser<AllocatorMemoryUsed>() {
    public AllocatorMemoryUsed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new AllocatorMemoryUsed(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<AllocatorMemoryUsed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllocatorMemoryUsed> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.AllocatorMemoryUsed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

