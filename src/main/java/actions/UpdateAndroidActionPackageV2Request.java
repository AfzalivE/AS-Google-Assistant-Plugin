package actions;


import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.StructProto;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Value;
import com.google.protobuf.ValueOrBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2Request.class */
public final class UpdateAndroidActionPackageV2Request extends GeneratedMessageV3 implements UpdateAndroidActionPackageV2RequestOrBuilder {
    private static final long serialVersionUID = 0;
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    public static final int ACTIONS_XML_CONTENTS_FIELD_NUMBER = 2;
    private ByteString actionsXmlContents_;
    public static final int XML_CONTENT_TYPE_FIELD_NUMBER = 5;
    private int xmlContentType_;
    public static final int PREVIEW_SETTINGS_FIELD_NUMBER = 3;
    private PreviewSettings previewSettings_;
    public static final int LOCALIZED_RESOURCES_FIELD_NUMBER = 4;
    private List<LocalizedResource> localizedResources_;
    private byte memoizedIsInitialized;
    private static final UpdateAndroidActionPackageV2Request DEFAULT_INSTANCE = new UpdateAndroidActionPackageV2Request();
    private static final Parser<UpdateAndroidActionPackageV2Request> PARSER = new AbstractParser<UpdateAndroidActionPackageV2Request>() { // from class: plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.1
        @Override // com.google.protobuf.Parser
        public UpdateAndroidActionPackageV2Request parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new UpdateAndroidActionPackageV2Request(input, extensionRegistry);
        }
    };

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2Request$LocalizedResourceOrBuilder.class */
    public interface LocalizedResourceOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        int getResourceTypeValue();

        LocalizedResource.ResourceType getResourceType();

        String getLocale();

        ByteString getLocaleBytes();

        boolean hasValue();

        Value getValue();

        ValueOrBuilder getValueOrBuilder();
    }

    private UpdateAndroidActionPackageV2Request(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private UpdateAndroidActionPackageV2Request() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.actionsXmlContents_ = ByteString.EMPTY;
        this.xmlContentType_ = 0;
        this.localizedResources_ = Collections.emptyList();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private UpdateAndroidActionPackageV2Request(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
        int mutable_bitField0_ = 0;
        UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                try {
                    try {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                String s = input.readStringRequireUtf8();
                                this.name_ = s;
                                break;
                            case 18:
                                this.actionsXmlContents_ = input.readBytes();
                                break;
                            case 26:
                                PreviewSettings.Builder subBuilder = null;
                                subBuilder = this.previewSettings_ != null ? this.previewSettings_.toBuilder() : subBuilder;
                                this.previewSettings_ = (PreviewSettings) input.readMessage(PreviewSettings.parser(), extensionRegistry);
                                if (subBuilder == null) {
                                    break;
                                } else {
                                    subBuilder.mergeFrom(this.previewSettings_);
                                    this.previewSettings_ = subBuilder.buildPartial();
                                    break;
                                }
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                if ((mutable_bitField0_ & 16) != 16) {
                                    this.localizedResources_ = new ArrayList();
                                    mutable_bitField0_ |= 16;
                                }
                                this.localizedResources_.add((LocalizedResource) input.readMessage(LocalizedResource.parser(), extensionRegistry));
                                break;
                            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                                int rawValue = input.readEnum();
                                this.xmlContentType_ = rawValue;
                                break;
                            default:
                                if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            }
            if ((mutable_bitField0_ & 16) == 16) {
                this.localizedResources_ = Collections.unmodifiableList(this.localizedResources_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        } catch (Throwable th) {
            if ((mutable_bitField0_ & 16) == 16) {
                this.localizedResources_ = Collections.unmodifiableList(this.localizedResources_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
            throw th;
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAndroidActionPackageV2Request.class, Builder.class);
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2Request$XmlContentType.class */
    public enum XmlContentType implements ProtocolMessageEnum {
        XML_CONTENT_TYPE_UNSPECIFIED(0),
        ACTIONS(1),
        SHORTCUTS(2),
        UNRECOGNIZED(-1);

        public static final int XML_CONTENT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int ACTIONS_VALUE = 1;
        public static final int SHORTCUTS_VALUE = 2;
        private static final Internal.EnumLiteMap<XmlContentType> internalValueMap = new Internal.EnumLiteMap<XmlContentType>() { // from class: plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.XmlContentType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public XmlContentType findValueByNumber(int number) {
                return XmlContentType.forNumber(number);
            }
        };
        private static final XmlContentType[] VALUES = values();
        private final int value;

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static XmlContentType valueOf(int value) {
            return forNumber(value);
        }

        public static XmlContentType forNumber(int value) {
            switch (value) {
                case 0:
                    return XML_CONTENT_TYPE_UNSPECIFIED;
                case 1:
                    return ACTIONS;
                case 2:
                    return SHORTCUTS;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<XmlContentType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return UpdateAndroidActionPackageV2Request.getDescriptor().getEnumTypes().get(0);
        }

        public static XmlContentType valueOf(Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        XmlContentType(int value) {
            this.value = value;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2Request$LocalizedResource.class */
    public static final class LocalizedResource extends GeneratedMessageV3 implements LocalizedResourceOrBuilder {
        private static final long serialVersionUID = 0;
        public static final int NAME_FIELD_NUMBER = 1;
        private volatile Object name_;
        public static final int RESOURCE_TYPE_FIELD_NUMBER = 2;
        private int resourceType_;
        public static final int LOCALE_FIELD_NUMBER = 3;
        private volatile Object locale_;
        public static final int VALUE_FIELD_NUMBER = 4;
        private Value value_;
        private byte memoizedIsInitialized;
        private static final LocalizedResource DEFAULT_INSTANCE = new LocalizedResource();
        private static final Parser<LocalizedResource> PARSER = new AbstractParser<LocalizedResource>() { // from class: plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResource.1
            @Override // com.google.protobuf.Parser
            public LocalizedResource parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new LocalizedResource(input, extensionRegistry);
            }
        };

        private LocalizedResource(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private LocalizedResource() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.resourceType_ = 0;
            this.locale_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private LocalizedResource(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    try {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                String s = input.readStringRequireUtf8();
                                this.name_ = s;
                                break;
                            case 16:
                                int rawValue = input.readEnum();
                                this.resourceType_ = rawValue;
                                break;
                            case 26:
                                String s2 = input.readStringRequireUtf8();
                                this.locale_ = s2;
                                break;
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                Value.Builder subBuilder = null;
                                subBuilder = this.value_ != null ? this.value_.toBuilder() : subBuilder;
                                this.value_ = (Value) input.readMessage(Value.parser(), extensionRegistry);
                                if (subBuilder == null) {
                                    break;
                                } else {
                                    subBuilder.mergeFrom(this.value_);
                                    this.value_ = subBuilder.buildPartial();
                                    break;
                                }
                            default:
                                if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                }
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_fieldAccessorTable.ensureFieldAccessorsInitialized(LocalizedResource.class, Builder.class);
        }

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2Request$LocalizedResource$ResourceType.class */
        public enum ResourceType implements ProtocolMessageEnum {
            UNSPECIFIED(0),
            STRING(1),
            STRING_ARRAY(2),
            UNRECOGNIZED(-1);

            public static final int UNSPECIFIED_VALUE = 0;
            public static final int STRING_VALUE = 1;
            public static final int STRING_ARRAY_VALUE = 2;
            private static final Internal.EnumLiteMap<ResourceType> internalValueMap = new Internal.EnumLiteMap<ResourceType>() { // from class: plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResource.ResourceType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResourceType findValueByNumber(int number) {
                    return ResourceType.forNumber(number);
                }
            };
            private static final ResourceType[] VALUES = values();
            private final int value;

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static ResourceType valueOf(int value) {
                return forNumber(value);
            }

            public static ResourceType forNumber(int value) {
                switch (value) {
                    case 0:
                        return UNSPECIFIED;
                    case 1:
                        return STRING;
                    case 2:
                        return STRING_ARRAY;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<ResourceType> internalGetValueMap() {
                return internalValueMap;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return LocalizedResource.getDescriptor().getEnumTypes().get(0);
            }

            public static ResourceType valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            ResourceType(int value) {
                this.value = value;
            }
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            this.name_ = s;
            return s;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public int getResourceTypeValue() {
            return this.resourceType_;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public ResourceType getResourceType() {
            ResourceType result = ResourceType.valueOf(this.resourceType_);
            return result == null ? ResourceType.UNRECOGNIZED : result;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public String getLocale() {
            Object ref = this.locale_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            this.locale_ = s;
            return s;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public ByteString getLocaleBytes() {
            Object ref = this.locale_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.locale_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public boolean hasValue() {
            return this.value_ != null;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public Value getValue() {
            return this.value_ == null ? Value.getDefaultInstance() : this.value_;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
        public ValueOrBuilder getValueOrBuilder() {
            return getValue();
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream output) throws IOException {
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.name_);
            }
            if (this.resourceType_ != ResourceType.UNSPECIFIED.getNumber()) {
                output.writeEnum(2, this.resourceType_);
            }
            if (!getLocaleBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.locale_);
            }
            if (this.value_ != null) {
                output.writeMessage(4, getValue());
            }
            this.unknownFields.writeTo(output);
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0;
            if (!getNameBytes().isEmpty()) {
                size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (this.resourceType_ != ResourceType.UNSPECIFIED.getNumber()) {
                size2 += CodedOutputStream.computeEnumSize(2, this.resourceType_);
            }
            if (!getLocaleBytes().isEmpty()) {
                size2 += GeneratedMessageV3.computeStringSize(3, this.locale_);
            }
            if (this.value_ != null) {
                size2 += CodedOutputStream.computeMessageSize(4, getValue());
            }
            int size3 = size2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size3;
            return size3;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalizedResource)) {
                return super.equals(obj);
            }
            LocalizedResource other = (LocalizedResource) obj;
            boolean result = 1 != 0 && getName().equals(other.getName());
            boolean result2 = result && this.resourceType_ == other.resourceType_;
            boolean result3 = result2 && getLocale().equals(other.getLocale());
            boolean result4 = result3 && hasValue() == other.hasValue();
            if (hasValue()) {
                result4 = result4 && getValue().equals(other.getValue());
            }
            boolean result5 = result4 && this.unknownFields.equals(other.unknownFields);
            return result5;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            int hash2 = (53 * ((37 * ((53 * ((37 * ((53 * ((37 * hash) + 1)) + getName().hashCode())) + 2)) + this.resourceType_)) + 3)) + getLocale().hashCode();
            if (hasValue()) {
                hash2 = (53 * ((37 * hash2) + 4)) + getValue().hashCode();
            }
            int hash3 = (29 * hash2) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash3;
            return hash3;
        }

        public static LocalizedResource parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static LocalizedResource parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static LocalizedResource parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static LocalizedResource parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static LocalizedResource parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static LocalizedResource parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static LocalizedResource parseFrom(InputStream input) throws IOException {
            return (LocalizedResource) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static LocalizedResource parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LocalizedResource) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static LocalizedResource parseDelimitedFrom(InputStream input) throws IOException {
            return (LocalizedResource) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static LocalizedResource parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LocalizedResource) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static LocalizedResource parseFrom(CodedInputStream input) throws IOException {
            return (LocalizedResource) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static LocalizedResource parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LocalizedResource) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(LocalizedResource prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2Request$LocalizedResource$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocalizedResourceOrBuilder {
            private Object name_;
            private int resourceType_;
            private Object locale_;
            private Value value_;
            private SingleFieldBuilderV3<Value, Value.Builder, ValueOrBuilder> valueBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_fieldAccessorTable.ensureFieldAccessorsInitialized(LocalizedResource.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.resourceType_ = 0;
                this.locale_ = "";
                this.value_ = null;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.resourceType_ = 0;
                this.locale_ = "";
                this.value_ = null;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (LocalizedResource.alwaysUseFieldBuilders) {
                }
            }

            @Override
            // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.resourceType_ = 0;
                this.locale_ = "";
                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                } else {
                    this.value_ = null;
                    this.valueBuilder_ = null;
                }
                return this;
            }

            @Override
            // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LocalizedResource getDefaultInstanceForType() {
                return LocalizedResource.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocalizedResource build() {
                LocalizedResource result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocalizedResource buildPartial() {
                LocalizedResource result = new LocalizedResource(this);
                result.name_ = this.name_;
                result.resourceType_ = this.resourceType_;
                result.locale_ = this.locale_;
                if (this.valueBuilder_ == null) {
                    result.value_ = this.value_;
                } else {
                    result.value_ = this.valueBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @Override
            // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.setField(field, value);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            @Override
            // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message other) {
                if (other instanceof LocalizedResource) {
                    return mergeFrom((LocalizedResource) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(LocalizedResource other) {
                if (other == LocalizedResource.getDefaultInstance()) {
                    return this;
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.resourceType_ != 0) {
                    setResourceTypeValue(other.getResourceTypeValue());
                }
                if (!other.getLocale().isEmpty()) {
                    this.locale_ = other.locale_;
                    onChanged();
                }
                if (other.hasValue()) {
                    mergeValue(other.getValue());
                }
                mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override
            // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                LocalizedResource parsedMessage = null;
                try {
                    try {
                        parsedMessage = (LocalizedResource) LocalizedResource.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (LocalizedResource) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = LocalizedResource.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value != null) {
                    LocalizedResource.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public int getResourceTypeValue() {
                return this.resourceType_;
            }

            public Builder setResourceTypeValue(int value) {
                this.resourceType_ = value;
                onChanged();
                return this;
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public ResourceType getResourceType() {
                ResourceType result = ResourceType.valueOf(this.resourceType_);
                return result == null ? ResourceType.UNRECOGNIZED : result;
            }

            public Builder setResourceType(ResourceType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.resourceType_ = value.getNumber();
                onChanged();
                return this;
            }

            public Builder clearResourceType() {
                this.resourceType_ = 0;
                onChanged();
                return this;
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public String getLocale() {
                Object ref = this.locale_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    this.locale_ = s;
                    return s;
                }
                return (String) ref;
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public ByteString getLocaleBytes() {
                Object ref = this.locale_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.locale_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setLocale(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.locale_ = value;
                onChanged();
                return this;
            }

            public Builder clearLocale() {
                this.locale_ = LocalizedResource.getDefaultInstance().getLocale();
                onChanged();
                return this;
            }

            public Builder setLocaleBytes(ByteString value) {
                if (value != null) {
                    LocalizedResource.checkByteStringIsUtf8(value);
                    this.locale_ = value;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public boolean hasValue() {
                return (this.valueBuilder_ == null && this.value_ == null) ? false : true;
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public Value getValue() {
                if (this.valueBuilder_ == null) {
                    return this.value_ == null ? Value.getDefaultInstance() : this.value_;
                }
                return this.valueBuilder_.getMessage();
            }

            public Builder setValue(Value value) {
                if (this.valueBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.value_ = value;
                    onChanged();
                } else {
                    this.valueBuilder_.setMessage(value);
                }
                return this;
            }

            public Builder setValue(Value.Builder builderForValue) {
                if (this.valueBuilder_ == null) {
                    this.value_ = builderForValue.build();
                    onChanged();
                } else {
                    this.valueBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }

            public Builder mergeValue(Value value) {
                if (this.valueBuilder_ == null) {
                    if (this.value_ != null) {
                        this.value_ = Value.newBuilder(this.value_).mergeFrom(value).buildPartial();
                    } else {
                        this.value_ = value;
                    }
                    onChanged();
                } else {
                    this.valueBuilder_.mergeFrom(value);
                }
                return this;
            }

            public Builder clearValue() {
                if (this.valueBuilder_ == null) {
                    this.value_ = null;
                    onChanged();
                } else {
                    this.value_ = null;
                    this.valueBuilder_ = null;
                }
                return this;
            }

            public Value.Builder getValueBuilder() {
                onChanged();
                return getValueFieldBuilder().getBuilder();
            }

            @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2Request.LocalizedResourceOrBuilder
            public ValueOrBuilder getValueOrBuilder() {
                if (this.valueBuilder_ != null) {
                    return this.valueBuilder_.getMessageOrBuilder();
                }
                return this.value_ == null ? Value.getDefaultInstance() : this.value_;
            }

            private SingleFieldBuilderV3<Value, Value.Builder, ValueOrBuilder> getValueFieldBuilder() {
                if (this.valueBuilder_ == null) {
                    this.valueBuilder_ = new SingleFieldBuilderV3<>(getValue(), getParentForChildren(), isClean());
                    this.value_ = null;
                }
                return this.valueBuilder_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder) super.setUnknownFieldsProto3(unknownFields);
            }

            @Override
            // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder) super.mergeUnknownFields(unknownFields);
            }
        }

        public static LocalizedResource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LocalizedResource> parser() {
            return PARSER;
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocalizedResource> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LocalizedResource getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public String getName() {
        Object ref = this.name_;
        if (ref instanceof String) {
            return (String) ref;
        }
        ByteString bs = (ByteString) ref;
        String s = bs.toStringUtf8();
        this.name_ = s;
        return s;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public ByteString getNameBytes() {
        Object ref = this.name_;
        if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String) ref);
            this.name_ = b;
            return b;
        }
        return (ByteString) ref;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public ByteString getActionsXmlContents() {
        return this.actionsXmlContents_;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public int getXmlContentTypeValue() {
        return this.xmlContentType_;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public XmlContentType getXmlContentType() {
        XmlContentType result = XmlContentType.valueOf(this.xmlContentType_);
        return result == null ? XmlContentType.UNRECOGNIZED : result;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public boolean hasPreviewSettings() {
        return this.previewSettings_ != null;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public PreviewSettings getPreviewSettings() {
        return this.previewSettings_ == null ? PreviewSettings.getDefaultInstance() : this.previewSettings_;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public PreviewSettingsOrBuilder getPreviewSettingsOrBuilder() {
        return getPreviewSettings();
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public List<LocalizedResource> getLocalizedResourcesList() {
        return this.localizedResources_;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public List<? extends LocalizedResourceOrBuilder> getLocalizedResourcesOrBuilderList() {
        return this.localizedResources_;
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public int getLocalizedResourcesCount() {
        return this.localizedResources_.size();
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public LocalizedResource getLocalizedResources(int index) {
        return this.localizedResources_.get(index);
    }

    @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
    public LocalizedResourceOrBuilder getLocalizedResourcesOrBuilder(int index) {
        return this.localizedResources_.get(index);
    }

    @Override
    // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte isInitialized = this.memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override
    // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream output) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(output, 1, this.name_);
        }
        if (!this.actionsXmlContents_.isEmpty()) {
            output.writeBytes(2, this.actionsXmlContents_);
        }
        if (this.previewSettings_ != null) {
            output.writeMessage(3, getPreviewSettings());
        }
        for (int i = 0; i < this.localizedResources_.size(); i++) {
            output.writeMessage(4, this.localizedResources_.get(i));
        }
        if (this.xmlContentType_ != XmlContentType.XML_CONTENT_TYPE_UNSPECIFIED.getNumber()) {
            output.writeEnum(5, this.xmlContentType_);
        }
        this.unknownFields.writeTo(output);
    }

    @Override
    // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int size = this.memoizedSize;
        if (size != -1) {
            return size;
        }
        int size2 = 0;
        if (!getNameBytes().isEmpty()) {
            size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
        }
        if (!this.actionsXmlContents_.isEmpty()) {
            size2 += CodedOutputStream.computeBytesSize(2, this.actionsXmlContents_);
        }
        if (this.previewSettings_ != null) {
            size2 += CodedOutputStream.computeMessageSize(3, getPreviewSettings());
        }
        for (int i = 0; i < this.localizedResources_.size(); i++) {
            size2 += CodedOutputStream.computeMessageSize(4, this.localizedResources_.get(i));
        }
        if (this.xmlContentType_ != XmlContentType.XML_CONTENT_TYPE_UNSPECIFIED.getNumber()) {
            size2 += CodedOutputStream.computeEnumSize(5, this.xmlContentType_);
        }
        int size3 = size2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = size3;
        return size3;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateAndroidActionPackageV2Request)) {
            return super.equals(obj);
        }
        UpdateAndroidActionPackageV2Request other = (UpdateAndroidActionPackageV2Request) obj;
        boolean result = 1 != 0 && getName().equals(other.getName());
        boolean result2 = result && getActionsXmlContents().equals(other.getActionsXmlContents());
        boolean result3 = result2 && this.xmlContentType_ == other.xmlContentType_;
        boolean result4 = result3 && hasPreviewSettings() == other.hasPreviewSettings();
        if (hasPreviewSettings()) {
            result4 = result4 && getPreviewSettings().equals(other.getPreviewSettings());
        }
        boolean result5 = result4 && getLocalizedResourcesList().equals(other.getLocalizedResourcesList());
        boolean result6 = result5 && this.unknownFields.equals(other.unknownFields);
        return result6;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hash = (19 * 41) + getDescriptor().hashCode();
        int hash2 = (53 * ((37 * ((53 * ((37 * ((53 * ((37 * hash) + 1)) + getName().hashCode())) + 2)) + getActionsXmlContents().hashCode())) + 5)) + this.xmlContentType_;
        if (hasPreviewSettings()) {
            hash2 = (53 * ((37 * hash2) + 3)) + getPreviewSettings().hashCode();
        }
        if (getLocalizedResourcesCount() > 0) {
            hash2 = (53 * ((37 * hash2) + 4)) + getLocalizedResourcesList().hashCode();
        }
        int hash3 = (29 * hash2) + this.unknownFields.hashCode();
        this.memoizedHashCode = hash3;
        return hash3;
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(InputStream input) throws IOException {
        return (UpdateAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (UpdateAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static UpdateAndroidActionPackageV2Request parseDelimitedFrom(InputStream input) throws IOException {
        return (UpdateAndroidActionPackageV2Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static UpdateAndroidActionPackageV2Request parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (UpdateAndroidActionPackageV2Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(CodedInputStream input) throws IOException {
        return (UpdateAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static UpdateAndroidActionPackageV2Request parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (UpdateAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(UpdateAndroidActionPackageV2Request prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$UpdateAndroidActionPackageV2Request$Builder.class */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateAndroidActionPackageV2RequestOrBuilder {
        private int bitField0_;
        private Object name_;
        private ByteString actionsXmlContents_;
        private int xmlContentType_;
        private PreviewSettings previewSettings_;
        private SingleFieldBuilderV3<PreviewSettings, PreviewSettings.Builder, PreviewSettingsOrBuilder> previewSettingsBuilder_;
        private List<LocalizedResource> localizedResources_;
        private RepeatedFieldBuilderV3<LocalizedResource, LocalizedResource.Builder, LocalizedResourceOrBuilder> localizedResourcesBuilder_;

        public static final Descriptors.Descriptor getDescriptor() {
            return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateAndroidActionPackageV2Request.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.actionsXmlContents_ = ByteString.EMPTY;
            this.xmlContentType_ = 0;
            this.previewSettings_ = null;
            this.localizedResources_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(BuilderParent parent) {
            super(parent);
            this.name_ = "";
            this.actionsXmlContents_ = ByteString.EMPTY;
            this.xmlContentType_ = 0;
            this.previewSettings_ = null;
            this.localizedResources_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (UpdateAndroidActionPackageV2Request.alwaysUseFieldBuilders) {
                getLocalizedResourcesFieldBuilder();
            }
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            this.actionsXmlContents_ = ByteString.EMPTY;
            this.xmlContentType_ = 0;
            if (this.previewSettingsBuilder_ == null) {
                this.previewSettings_ = null;
            } else {
                this.previewSettings_ = null;
                this.previewSettingsBuilder_ = null;
            }
            if (this.localizedResourcesBuilder_ == null) {
                this.localizedResources_ = Collections.emptyList();
                this.bitField0_ &= -17;
            } else {
                this.localizedResourcesBuilder_.clear();
            }
            return this;
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Plugin.internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateAndroidActionPackageV2Request getDefaultInstanceForType() {
            return UpdateAndroidActionPackageV2Request.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UpdateAndroidActionPackageV2Request build() {
            UpdateAndroidActionPackageV2Request result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException((Message) result);
            }
            return result;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UpdateAndroidActionPackageV2Request buildPartial() {
            UpdateAndroidActionPackageV2Request result = new UpdateAndroidActionPackageV2Request(this);
            int i = this.bitField0_;
            result.name_ = this.name_;
            result.actionsXmlContents_ = this.actionsXmlContents_;
            result.xmlContentType_ = this.xmlContentType_;
            if (this.previewSettingsBuilder_ == null) {
                result.previewSettings_ = this.previewSettings_;
            } else {
                result.previewSettings_ = this.previewSettingsBuilder_.build();
            }
            if (this.localizedResourcesBuilder_ != null) {
                result.localizedResources_ = this.localizedResourcesBuilder_.build();
            } else {
                if ((this.bitField0_ & 16) == 16) {
                    this.localizedResources_ = Collections.unmodifiableList(this.localizedResources_);
                    this.bitField0_ &= -17;
                }
                result.localizedResources_ = this.localizedResources_;
            }
            result.bitField0_ = 0;
            onBuilt();
            return result;
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clone() {
            return (Builder) super.clone();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.setField(field, value);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message other) {
            if (other instanceof UpdateAndroidActionPackageV2Request) {
                return mergeFrom((UpdateAndroidActionPackageV2Request) other);
            }
            super.mergeFrom(other);
            return this;
        }

        public Builder mergeFrom(UpdateAndroidActionPackageV2Request other) {
            if (other == UpdateAndroidActionPackageV2Request.getDefaultInstance()) {
                return this;
            }
            if (!other.getName().isEmpty()) {
                this.name_ = other.name_;
                onChanged();
            }
            if (other.getActionsXmlContents() != ByteString.EMPTY) {
                setActionsXmlContents(other.getActionsXmlContents());
            }
            if (other.xmlContentType_ != 0) {
                setXmlContentTypeValue(other.getXmlContentTypeValue());
            }
            if (other.hasPreviewSettings()) {
                mergePreviewSettings(other.getPreviewSettings());
            }
            if (this.localizedResourcesBuilder_ == null) {
                if (!other.localizedResources_.isEmpty()) {
                    if (this.localizedResources_.isEmpty()) {
                        this.localizedResources_ = other.localizedResources_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureLocalizedResourcesIsMutable();
                        this.localizedResources_.addAll(other.localizedResources_);
                    }
                    onChanged();
                }
            } else if (!other.localizedResources_.isEmpty()) {
                if (!this.localizedResourcesBuilder_.isEmpty()) {
                    this.localizedResourcesBuilder_.addAllMessages(other.localizedResources_);
                } else {
                    this.localizedResourcesBuilder_.dispose();
                    this.localizedResourcesBuilder_ = null;
                    this.localizedResources_ = other.localizedResources_;
                    this.bitField0_ &= -17;
                    this.localizedResourcesBuilder_ = UpdateAndroidActionPackageV2Request.alwaysUseFieldBuilders ? getLocalizedResourcesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        @Override
        // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            UpdateAndroidActionPackageV2Request parsedMessage = null;
            try {
                try {
                    parsedMessage = (UpdateAndroidActionPackageV2Request) UpdateAndroidActionPackageV2Request.PARSER.parsePartialFrom(input, extensionRegistry);
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (UpdateAndroidActionPackageV2Request) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
            } catch (Throwable th) {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
                throw th;
            }
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public String getName() {
            Object ref = this.name_;
            if (!(ref instanceof String)) {
                ByteString bs = (ByteString) ref;
                String s = bs.toStringUtf8();
                this.name_ = s;
                return s;
            }
            return (String) ref;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public Builder setName(String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.name_ = value;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = UpdateAndroidActionPackageV2Request.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            if (value != null) {
                UpdateAndroidActionPackageV2Request.checkByteStringIsUtf8(value);
                this.name_ = value;
                onChanged();
                return this;
            }
            throw new NullPointerException();
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public ByteString getActionsXmlContents() {
            return this.actionsXmlContents_;
        }

        public Builder setActionsXmlContents(ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.actionsXmlContents_ = value;
            onChanged();
            return this;
        }

        public Builder clearActionsXmlContents() {
            this.actionsXmlContents_ = UpdateAndroidActionPackageV2Request.getDefaultInstance().getActionsXmlContents();
            onChanged();
            return this;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public int getXmlContentTypeValue() {
            return this.xmlContentType_;
        }

        public Builder setXmlContentTypeValue(int value) {
            this.xmlContentType_ = value;
            onChanged();
            return this;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public XmlContentType getXmlContentType() {
            XmlContentType result = XmlContentType.valueOf(this.xmlContentType_);
            return result == null ? XmlContentType.UNRECOGNIZED : result;
        }

        public Builder setXmlContentType(XmlContentType value) {
            if (value == null) {
                throw new NullPointerException();
            }
            this.xmlContentType_ = value.getNumber();
            onChanged();
            return this;
        }

        public Builder clearXmlContentType() {
            this.xmlContentType_ = 0;
            onChanged();
            return this;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public boolean hasPreviewSettings() {
            return (this.previewSettingsBuilder_ == null && this.previewSettings_ == null) ? false : true;
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public PreviewSettings getPreviewSettings() {
            if (this.previewSettingsBuilder_ == null) {
                return this.previewSettings_ == null ? PreviewSettings.getDefaultInstance() : this.previewSettings_;
            }
            return this.previewSettingsBuilder_.getMessage();
        }

        public Builder setPreviewSettings(PreviewSettings value) {
            if (this.previewSettingsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.previewSettings_ = value;
                onChanged();
            } else {
                this.previewSettingsBuilder_.setMessage(value);
            }
            return this;
        }

        public Builder setPreviewSettings(PreviewSettings.Builder builderForValue) {
            if (this.previewSettingsBuilder_ == null) {
                this.previewSettings_ = builderForValue.build();
                onChanged();
            } else {
                this.previewSettingsBuilder_.setMessage(builderForValue.build());
            }
            return this;
        }

        public Builder mergePreviewSettings(PreviewSettings value) {
            if (this.previewSettingsBuilder_ == null) {
                if (this.previewSettings_ != null) {
                    this.previewSettings_ = PreviewSettings.newBuilder(this.previewSettings_).mergeFrom(value).buildPartial();
                } else {
                    this.previewSettings_ = value;
                }
                onChanged();
            } else {
                this.previewSettingsBuilder_.mergeFrom(value);
            }
            return this;
        }

        public Builder clearPreviewSettings() {
            if (this.previewSettingsBuilder_ == null) {
                this.previewSettings_ = null;
                onChanged();
            } else {
                this.previewSettings_ = null;
                this.previewSettingsBuilder_ = null;
            }
            return this;
        }

        public PreviewSettings.Builder getPreviewSettingsBuilder() {
            onChanged();
            return getPreviewSettingsFieldBuilder().getBuilder();
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public PreviewSettingsOrBuilder getPreviewSettingsOrBuilder() {
            if (this.previewSettingsBuilder_ != null) {
                return this.previewSettingsBuilder_.getMessageOrBuilder();
            }
            return this.previewSettings_ == null ? PreviewSettings.getDefaultInstance() : this.previewSettings_;
        }

        private SingleFieldBuilderV3<PreviewSettings, PreviewSettings.Builder, PreviewSettingsOrBuilder> getPreviewSettingsFieldBuilder() {
            if (this.previewSettingsBuilder_ == null) {
                this.previewSettingsBuilder_ = new SingleFieldBuilderV3<>(getPreviewSettings(), getParentForChildren(), isClean());
                this.previewSettings_ = null;
            }
            return this.previewSettingsBuilder_;
        }

        private void ensureLocalizedResourcesIsMutable() {
            if ((this.bitField0_ & 16) != 16) {
                this.localizedResources_ = new ArrayList(this.localizedResources_);
                this.bitField0_ |= 16;
            }
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public List<LocalizedResource> getLocalizedResourcesList() {
            if (this.localizedResourcesBuilder_ == null) {
                return Collections.unmodifiableList(this.localizedResources_);
            }
            return this.localizedResourcesBuilder_.getMessageList();
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public int getLocalizedResourcesCount() {
            if (this.localizedResourcesBuilder_ == null) {
                return this.localizedResources_.size();
            }
            return this.localizedResourcesBuilder_.getCount();
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public LocalizedResource getLocalizedResources(int index) {
            if (this.localizedResourcesBuilder_ == null) {
                return this.localizedResources_.get(index);
            }
            return this.localizedResourcesBuilder_.getMessage(index);
        }

        public Builder setLocalizedResources(int index, LocalizedResource value) {
            if (this.localizedResourcesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureLocalizedResourcesIsMutable();
                this.localizedResources_.set(index, value);
                onChanged();
            } else {
                this.localizedResourcesBuilder_.setMessage(index, value);
            }
            return this;
        }

        public Builder setLocalizedResources(int index, LocalizedResource.Builder builderForValue) {
            if (this.localizedResourcesBuilder_ == null) {
                ensureLocalizedResourcesIsMutable();
                this.localizedResources_.set(index, builderForValue.build());
                onChanged();
            } else {
                this.localizedResourcesBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addLocalizedResources(LocalizedResource value) {
            if (this.localizedResourcesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureLocalizedResourcesIsMutable();
                this.localizedResources_.add(value);
                onChanged();
            } else {
                this.localizedResourcesBuilder_.addMessage(value);
            }
            return this;
        }

        public Builder addLocalizedResources(int index, LocalizedResource value) {
            if (this.localizedResourcesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureLocalizedResourcesIsMutable();
                this.localizedResources_.add(index, value);
                onChanged();
            } else {
                this.localizedResourcesBuilder_.addMessage(index, value);
            }
            return this;
        }

        public Builder addLocalizedResources(LocalizedResource.Builder builderForValue) {
            if (this.localizedResourcesBuilder_ == null) {
                ensureLocalizedResourcesIsMutable();
                this.localizedResources_.add(builderForValue.build());
                onChanged();
            } else {
                this.localizedResourcesBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        public Builder addLocalizedResources(int index, LocalizedResource.Builder builderForValue) {
            if (this.localizedResourcesBuilder_ == null) {
                ensureLocalizedResourcesIsMutable();
                this.localizedResources_.add(index, builderForValue.build());
                onChanged();
            } else {
                this.localizedResourcesBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        public Builder addAllLocalizedResources(Iterable<? extends LocalizedResource> values) {
            if (this.localizedResourcesBuilder_ == null) {
                ensureLocalizedResourcesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) values, (List) this.localizedResources_);
                onChanged();
            } else {
                this.localizedResourcesBuilder_.addAllMessages(values);
            }
            return this;
        }

        public Builder clearLocalizedResources() {
            if (this.localizedResourcesBuilder_ == null) {
                this.localizedResources_ = Collections.emptyList();
                this.bitField0_ &= -17;
                onChanged();
            } else {
                this.localizedResourcesBuilder_.clear();
            }
            return this;
        }

        public Builder removeLocalizedResources(int index) {
            if (this.localizedResourcesBuilder_ == null) {
                ensureLocalizedResourcesIsMutable();
                this.localizedResources_.remove(index);
                onChanged();
            } else {
                this.localizedResourcesBuilder_.remove(index);
            }
            return this;
        }

        public LocalizedResource.Builder getLocalizedResourcesBuilder(int index) {
            return getLocalizedResourcesFieldBuilder().getBuilder(index);
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public LocalizedResourceOrBuilder getLocalizedResourcesOrBuilder(int index) {
            if (this.localizedResourcesBuilder_ == null) {
                return this.localizedResources_.get(index);
            }
            return this.localizedResourcesBuilder_.getMessageOrBuilder(index);
        }

        @Override // plugin.actions.Plugin.UpdateAndroidActionPackageV2RequestOrBuilder
        public List<? extends LocalizedResourceOrBuilder> getLocalizedResourcesOrBuilderList() {
            if (this.localizedResourcesBuilder_ != null) {
                return this.localizedResourcesBuilder_.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.localizedResources_);
        }

        public LocalizedResource.Builder addLocalizedResourcesBuilder() {
            return getLocalizedResourcesFieldBuilder().addBuilder(LocalizedResource.getDefaultInstance());
        }

        public LocalizedResource.Builder addLocalizedResourcesBuilder(int index) {
            return getLocalizedResourcesFieldBuilder().addBuilder(index, LocalizedResource.getDefaultInstance());
        }

        public List<LocalizedResource.Builder> getLocalizedResourcesBuilderList() {
            return getLocalizedResourcesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<LocalizedResource, LocalizedResource.Builder, LocalizedResourceOrBuilder> getLocalizedResourcesFieldBuilder() {
            if (this.localizedResourcesBuilder_ == null) {
                this.localizedResourcesBuilder_ = new RepeatedFieldBuilderV3<>(this.localizedResources_, (this.bitField0_ & 16) == 16, getParentForChildren(), isClean());
                this.localizedResources_ = null;
            }
            return this.localizedResourcesBuilder_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder) super.setUnknownFieldsProto3(unknownFields);
        }

        @Override
        // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
            return (Builder) super.mergeUnknownFields(unknownFields);
        }
    }

    public static UpdateAndroidActionPackageV2Request getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<UpdateAndroidActionPackageV2Request> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<UpdateAndroidActionPackageV2Request> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public UpdateAndroidActionPackageV2Request getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
