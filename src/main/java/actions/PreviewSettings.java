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
public final class PreviewSettings extends GeneratedMessageV3 implements PreviewSettingsOrBuilder {
        private static final long serialVersionUID = 0;
        public static final int INVOCATION_NAME_FIELD_NUMBER = 1;
        private volatile Object invocationName_;
        public static final int LOCALE_FIELD_NUMBER = 2;
        private volatile Object locale_;
        private byte memoizedIsInitialized;
        private static final PreviewSettings DEFAULT_INSTANCE = new PreviewSettings();
        private static final Parser<PreviewSettings> PARSER = new AbstractParser<PreviewSettings>() { // from class: plugin.actions.Plugin.PreviewSettings.1
            @Override // com.google.protobuf.Parser
            public PreviewSettings parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new PreviewSettings(input, extensionRegistry);
            }
        };
        
        private PreviewSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private PreviewSettings() {
            this.memoizedIsInitialized = (byte) -1;
            this.invocationName_ = "";
            this.locale_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PreviewSettings(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.invocationName_ = s;
                                break;
                            case 18:
                                String s2 = input.readStringRequireUtf8();
                                this.locale_ = s2;
                                break;
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
            return Plugin.internal_static_plugin_actions_PreviewSettings_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_PreviewSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(PreviewSettings.class, Builder.class);
        }

        @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
        public String getInvocationName() {
            Object ref = this.invocationName_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            this.invocationName_ = s;
            return s;
        }

        @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
        public ByteString getInvocationNameBytes() {
            Object ref = this.invocationName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.invocationName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
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

        @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
        public ByteString getLocaleBytes() {
            Object ref = this.locale_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.locale_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream output) throws IOException {
            if (!getInvocationNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.invocationName_);
            }
            if (!getLocaleBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.locale_);
            }
            this.unknownFields.writeTo(output);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0;
            if (!getInvocationNameBytes().isEmpty()) {
                size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.invocationName_);
            }
            if (!getLocaleBytes().isEmpty()) {
                size2 += GeneratedMessageV3.computeStringSize(2, this.locale_);
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
            if (!(obj instanceof PreviewSettings)) {
                return super.equals(obj);
            }
            PreviewSettings other = (PreviewSettings) obj;
            boolean result = 1 != 0 && getInvocationName().equals(other.getInvocationName());
            boolean result2 = result && getLocale().equals(other.getLocale());
            boolean result3 = result2 && this.unknownFields.equals(other.unknownFields);
            return result3;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            int hash2 = (29 * ((53 * ((37 * ((53 * ((37 * hash) + 1)) + getInvocationName().hashCode())) + 2)) + getLocale().hashCode())) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static PreviewSettings parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PreviewSettings parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PreviewSettings parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PreviewSettings parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PreviewSettings parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static PreviewSettings parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static PreviewSettings parseFrom(InputStream input) throws IOException {
            return (PreviewSettings) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PreviewSettings parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PreviewSettings) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static PreviewSettings parseDelimitedFrom(InputStream input) throws IOException {
            return (PreviewSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static PreviewSettings parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PreviewSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static PreviewSettings parseFrom(CodedInputStream input) throws IOException {
            return (PreviewSettings) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static PreviewSettings parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PreviewSettings) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(PreviewSettings prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$PreviewSettings$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PreviewSettingsOrBuilder {
            private Object invocationName_;
            private Object locale_;

            @Override
            public String toString() {
                return "Builder{" +
                        "invocationName_=" + invocationName_ +
                        ", locale_=" + locale_ +
                        '}';
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_PreviewSettings_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_PreviewSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(PreviewSettings.class, Builder.class);
            }

            private Builder() {
                this.invocationName_ = "";
                this.locale_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.invocationName_ = "";
                this.locale_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (PreviewSettings.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.invocationName_ = "";
                this.locale_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_PreviewSettings_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PreviewSettings getDefaultInstanceForType() {
                return PreviewSettings.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PreviewSettings build() {
                PreviewSettings result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PreviewSettings buildPartial() {
                PreviewSettings result = new PreviewSettings(this);
                result.invocationName_ = this.invocationName_;
                result.locale_ = this.locale_;
                onBuilt();
                return result;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
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
                if (other instanceof PreviewSettings) {
                    return mergeFrom((PreviewSettings) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(PreviewSettings other) {
                if (other == PreviewSettings.getDefaultInstance()) {
                    return this;
                }
                if (!other.getInvocationName().isEmpty()) {
                    this.invocationName_ = other.invocationName_;
                    onChanged();
                }
                if (!other.getLocale().isEmpty()) {
                    this.locale_ = other.locale_;
                    onChanged();
                }
                mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                PreviewSettings parsedMessage = null;
                try {
                    try {
                        parsedMessage = (PreviewSettings) PreviewSettings.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (PreviewSettings) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
            public String getInvocationName() {
                Object ref = this.invocationName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    this.invocationName_ = s;
                    return s;
                }
                return (String) ref;
            }

            @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
            public ByteString getInvocationNameBytes() {
                Object ref = this.invocationName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.invocationName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setInvocationName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.invocationName_ = value;
                onChanged();
                return this;
            }

            public Builder clearInvocationName() {
                this.invocationName_ = PreviewSettings.getDefaultInstance().getInvocationName();
                onChanged();
                return this;
            }

            public Builder setInvocationNameBytes(ByteString value) {
                if (value != null) {
                    PreviewSettings.checkByteStringIsUtf8(value);
                    this.invocationName_ = value;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
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

            @Override // plugin.actions.Plugin.PreviewSettingsOrBuilder
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
                this.locale_ = PreviewSettings.getDefaultInstance().getLocale();
                onChanged();
                return this;
            }

            public Builder setLocaleBytes(ByteString value) {
                if (value != null) {
                    PreviewSettings.checkByteStringIsUtf8(value);
                    this.locale_ = value;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder) super.setUnknownFieldsProto3(unknownFields);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFields) {
                return (Builder) super.mergeUnknownFields(unknownFields);
            }
        }

        public static PreviewSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PreviewSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PreviewSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PreviewSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

   
    }
    