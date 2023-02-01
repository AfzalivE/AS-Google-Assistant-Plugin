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

/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin.class */
public final class Plugin {
    static final Descriptors.Descriptor internal_static_plugin_actions_PreviewSettings_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_PreviewSettings_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_ValidationError_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_ValidationError_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_ValidationResult_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_ValidationResult_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_AndroidActionPackageResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_AndroidActionPackageResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_GetAndroidActionPackageV2Request_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_GetAndroidActionPackageV2Request_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_DeleteAndroidActionPackageRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_DeleteAndroidActionPackageRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_DevExMetricsClientEventType_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_DevExMetricsClientEventType_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_AcceptAssistantPluginToSRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_AcceptAssistantPluginToSRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_plugin_actions_AcceptAssistantPluginToSResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_plugin_actions_AcceptAssistantPluginToSResponse_fieldAccessorTable;
    static Descriptors.FileDescriptor descriptor;

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AcceptAssistantPluginToSRequestOrBuilder.class */
    public interface AcceptAssistantPluginToSRequestOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AcceptAssistantPluginToSResponseOrBuilder.class */
    public interface AcceptAssistantPluginToSResponseOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponseOrBuilder.class */
    public interface AndroidActionPackageResponseOrBuilder extends MessageOrBuilder {
        String getAssistantLink();

        ByteString getAssistantLinkBytes();

        List<AndroidActionPackageResponse.SupportedIntent> getSupportedIntentsList();

        AndroidActionPackageResponse.SupportedIntent getSupportedIntents(int i);

        int getSupportedIntentsCount();

        List<? extends AndroidActionPackageResponse.SupportedIntentOrBuilder> getSupportedIntentsOrBuilderList();

        AndroidActionPackageResponse.SupportedIntentOrBuilder getSupportedIntentsOrBuilder(int i);

        boolean hasPreviewSettings();

        PreviewSettings getPreviewSettings();

        PreviewSettingsOrBuilder getPreviewSettingsOrBuilder();

        List<ValidationResult> getValidationResultsList();

        ValidationResult getValidationResults(int i);

        int getValidationResultsCount();

        List<? extends ValidationResultOrBuilder> getValidationResultsOrBuilderList();

        ValidationResultOrBuilder getValidationResultsOrBuilder(int i);
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$DeleteAndroidActionPackageRequestOrBuilder.class */
    public interface DeleteAndroidActionPackageRequestOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$DevExMetricsClientEventTypeOrBuilder.class */
    public interface DevExMetricsClientEventTypeOrBuilder extends MessageOrBuilder {
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$GetAndroidActionPackageV2RequestOrBuilder.class */
    public interface GetAndroidActionPackageV2RequestOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$LogAndroidActionPackageDevelopmentEventRequestOrBuilder.class */
    public interface LogAndroidActionPackageDevelopmentEventRequestOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        boolean getIsInternalUser();

        int getClientEventTypeValue();

        DevExMetricsClientEventType.Id getClientEventType();
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationErrorOrBuilder.class */
    public interface ValidationErrorOrBuilder extends MessageOrBuilder {
        int getSeverityValue();

        ValidationError.Severity getSeverity();

        int getTypeValue();

        ValidationError.Type getType();

        List<String> getPathsList();

        int getPathsCount();

        String getPaths(int i);

        ByteString getPathsBytes(int i);

        String getErrorMessage();

        ByteString getErrorMessageBytes();
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationResultOrBuilder.class */
    public interface ValidationResultOrBuilder extends MessageOrBuilder {
        List<ValidationError> getValidationErrorsList();

        ValidationError getValidationErrors(int i);

        int getValidationErrorsCount();

        List<? extends ValidationErrorOrBuilder> getValidationErrorsOrBuilderList();

        ValidationErrorOrBuilder getValidationErrorsOrBuilder(int i);
    }

    private Plugin() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite) registry);
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$PreviewSettings.class */

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationError.class */
    public static final class ValidationError extends GeneratedMessageV3 implements ValidationErrorOrBuilder {
        private static final long serialVersionUID = 0;
        private int bitField0_;
        public static final int SEVERITY_FIELD_NUMBER = 1;
        private int severity_;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int type_;
        public static final int PATHS_FIELD_NUMBER = 3;
        private LazyStringList paths_;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 4;
        private volatile Object errorMessage_;
        private byte memoizedIsInitialized;
        private static final ValidationError DEFAULT_INSTANCE = new ValidationError();
        private static final Parser<ValidationError> PARSER = new AbstractParser<ValidationError>() { // from class: plugin.actions.Plugin.ValidationError.1
            @Override // com.google.protobuf.Parser
            public ValidationError parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ValidationError(input, extensionRegistry);
            }
        };

        private ValidationError(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private ValidationError() {
            this.memoizedIsInitialized = (byte) -1;
            this.severity_ = 0;
            this.type_ = 0;
            this.paths_ = LazyStringArrayList.EMPTY;
            this.errorMessage_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ValidationError(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8:
                                int rawValue = input.readEnum();
                                this.severity_ = rawValue;
                                break;
                            case 16:
                                int rawValue2 = input.readEnum();
                                this.type_ = rawValue2;
                                break;
                            case 26:
                                String s = input.readStringRequireUtf8();
                                if ((mutable_bitField0_ & 4) != 4) {
                                    this.paths_ = new LazyStringArrayList();
                                    mutable_bitField0_ |= 4;
                                }
                                this.paths_.add(s);
                                break;
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                String s2 = input.readStringRequireUtf8();
                                this.errorMessage_ = s2;
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
                if ((mutable_bitField0_ & 4) == 4) {
                    this.paths_ = this.paths_.getUnmodifiableView();
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            } catch (Throwable th) {
                if ((mutable_bitField0_ & 4) == 4) {
                    this.paths_ = this.paths_.getUnmodifiableView();
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
                throw th;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Plugin.internal_static_plugin_actions_ValidationError_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_ValidationError_fieldAccessorTable.ensureFieldAccessorsInitialized(ValidationError.class, Builder.class);
        }

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationError$Severity.class */
        public enum Severity implements ProtocolMessageEnum {
            SEVERITY_UNSPECIFIED(0),
            INFO(1),
            WARNING(2),
            ERROR(3),
            CRITICAL(4),
            UNRECOGNIZED(-1);
            
            public static final int SEVERITY_UNSPECIFIED_VALUE = 0;
            public static final int INFO_VALUE = 1;
            public static final int WARNING_VALUE = 2;
            public static final int ERROR_VALUE = 3;
            public static final int CRITICAL_VALUE = 4;
            private static final Internal.EnumLiteMap<Severity> internalValueMap = new Internal.EnumLiteMap<Severity>() { // from class: plugin.actions.Plugin.ValidationError.Severity.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Severity findValueByNumber(int number) {
                    return Severity.forNumber(number);
                }
            };
            private static final Severity[] VALUES = values();
            private final int value;

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Severity valueOf(int value) {
                return forNumber(value);
            }

            public static Severity forNumber(int value) {
                switch (value) {
                    case 0:
                        return SEVERITY_UNSPECIFIED;
                    case 1:
                        return INFO;
                    case 2:
                        return WARNING;
                    case 3:
                        return ERROR;
                    case 4:
                        return CRITICAL;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Severity> internalGetValueMap() {
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
                return ValidationError.getDescriptor().getEnumTypes().get(0);
            }

            public static Severity valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            Severity(int value) {
                this.value = value;
            }
        }

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationError$Type.class */
        public enum Type implements ProtocolMessageEnum {
            TYPE_UNSPECIFIED(0),
            DUPLICATE_ENTITY(1),
            INVALID_ENTITY_NAME(2),
            INVALID_ENTITY_VALUE(3),
            INVALID_PARAMETER_NAME(4),
            INVALID_PARAMETER_VALUE(5),
            INVALID_PARAMETER_TYPE(6),
            INCONSISTENT_PARAMETER_TYPE(7),
            INVALID_TRAINING_PHRASE(8),
            SIMILAR_TRAINING_PHRASES(9),
            INVALID_ANNOTATION(10),
            EMPTY_INTENT(11),
            SIMILAR_INTENTS(12),
            TOO_MANY_ML_DISABLED_INTENTS(13),
            UNRECOGNIZED(-1);
            
            public static final int TYPE_UNSPECIFIED_VALUE = 0;
            public static final int DUPLICATE_ENTITY_VALUE = 1;
            public static final int INVALID_ENTITY_NAME_VALUE = 2;
            public static final int INVALID_ENTITY_VALUE_VALUE = 3;
            public static final int INVALID_PARAMETER_NAME_VALUE = 4;
            public static final int INVALID_PARAMETER_VALUE_VALUE = 5;
            public static final int INVALID_PARAMETER_TYPE_VALUE = 6;
            public static final int INCONSISTENT_PARAMETER_TYPE_VALUE = 7;
            public static final int INVALID_TRAINING_PHRASE_VALUE = 8;
            public static final int SIMILAR_TRAINING_PHRASES_VALUE = 9;
            public static final int INVALID_ANNOTATION_VALUE = 10;
            public static final int EMPTY_INTENT_VALUE = 11;
            public static final int SIMILAR_INTENTS_VALUE = 12;
            public static final int TOO_MANY_ML_DISABLED_INTENTS_VALUE = 13;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: plugin.actions.Plugin.ValidationError.Type.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int number) {
                    return Type.forNumber(number);
                }
            };
            private static final Type[] VALUES = values();
            private final int value;

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int value) {
                return forNumber(value);
            }

            public static Type forNumber(int value) {
                switch (value) {
                    case 0:
                        return TYPE_UNSPECIFIED;
                    case 1:
                        return DUPLICATE_ENTITY;
                    case 2:
                        return INVALID_ENTITY_NAME;
                    case 3:
                        return INVALID_ENTITY_VALUE;
                    case 4:
                        return INVALID_PARAMETER_NAME;
                    case 5:
                        return INVALID_PARAMETER_VALUE;
                    case 6:
                        return INVALID_PARAMETER_TYPE;
                    case 7:
                        return INCONSISTENT_PARAMETER_TYPE;
                    case 8:
                        return INVALID_TRAINING_PHRASE;
                    case 9:
                        return SIMILAR_TRAINING_PHRASES;
                    case 10:
                        return INVALID_ANNOTATION;
                    case 11:
                        return EMPTY_INTENT;
                    case 12:
                        return SIMILAR_INTENTS;
                    case 13:
                        return TOO_MANY_ML_DISABLED_INTENTS;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
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
                return ValidationError.getDescriptor().getEnumTypes().get(1);
            }

            public static Type valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            Type(int value) {
                this.value = value;
            }
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public int getSeverityValue() {
            return this.severity_;
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public Severity getSeverity() {
            Severity result = Severity.valueOf(this.severity_);
            return result == null ? Severity.UNRECOGNIZED : result;
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public Type getType() {
            Type result = Type.valueOf(this.type_);
            return result == null ? Type.UNRECOGNIZED : result;
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public ProtocolStringList getPathsList() {
            return this.paths_;
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public int getPathsCount() {
            return this.paths_.size();
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public String getPaths(int index) {
            return (String) this.paths_.get(index);
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public ByteString getPathsBytes(int index) {
            return this.paths_.getByteString(index);
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public String getErrorMessage() {
            Object ref = this.errorMessage_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            this.errorMessage_ = s;
            return s;
        }

        @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
        public ByteString getErrorMessageBytes() {
            Object ref = this.errorMessage_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.errorMessage_ = b;
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
            if (this.severity_ != Severity.SEVERITY_UNSPECIFIED.getNumber()) {
                output.writeEnum(1, this.severity_);
            }
            if (this.type_ != Type.TYPE_UNSPECIFIED.getNumber()) {
                output.writeEnum(2, this.type_);
            }
            for (int i = 0; i < this.paths_.size(); i++) {
                GeneratedMessageV3.writeString(output, 3, this.paths_.getRaw(i));
            }
            if (!getErrorMessageBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 4, this.errorMessage_);
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
            if (this.severity_ != Severity.SEVERITY_UNSPECIFIED.getNumber()) {
                size2 = 0 + CodedOutputStream.computeEnumSize(1, this.severity_);
            }
            if (this.type_ != Type.TYPE_UNSPECIFIED.getNumber()) {
                size2 += CodedOutputStream.computeEnumSize(2, this.type_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.paths_.size(); i++) {
                dataSize += computeStringSizeNoTag(this.paths_.getRaw(i));
            }
            int size3 = size2 + dataSize + (1 * getPathsList().size());
            if (!getErrorMessageBytes().isEmpty()) {
                size3 += GeneratedMessageV3.computeStringSize(4, this.errorMessage_);
            }
            int size4 = size3 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size4;
            return size4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ValidationError)) {
                return super.equals(obj);
            }
            ValidationError other = (ValidationError) obj;
            boolean result = 1 != 0 && this.severity_ == other.severity_;
            boolean result2 = result && this.type_ == other.type_;
            boolean result3 = result2 && getPathsList().equals(other.getPathsList());
            boolean result4 = result3 && getErrorMessage().equals(other.getErrorMessage());
            boolean result5 = result4 && this.unknownFields.equals(other.unknownFields);
            return result5;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            int hash2 = (53 * ((37 * ((53 * ((37 * hash) + 1)) + this.severity_)) + 2)) + this.type_;
            if (getPathsCount() > 0) {
                hash2 = (53 * ((37 * hash2) + 3)) + getPathsList().hashCode();
            }
            int hash3 = (29 * ((53 * ((37 * hash2) + 4)) + getErrorMessage().hashCode())) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash3;
            return hash3;
        }

        public static ValidationError parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ValidationError parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ValidationError parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ValidationError parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ValidationError parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ValidationError parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ValidationError parseFrom(InputStream input) throws IOException {
            return (ValidationError) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static ValidationError parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ValidationError) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ValidationError parseDelimitedFrom(InputStream input) throws IOException {
            return (ValidationError) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static ValidationError parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ValidationError) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ValidationError parseFrom(CodedInputStream input) throws IOException {
            return (ValidationError) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static ValidationError parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ValidationError) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ValidationError prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationError$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ValidationErrorOrBuilder {
            private int bitField0_;
            private int severity_;
            private int type_;
            private LazyStringList paths_;
            private Object errorMessage_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_ValidationError_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_ValidationError_fieldAccessorTable.ensureFieldAccessorsInitialized(ValidationError.class, Builder.class);
            }

            private Builder() {
                this.severity_ = 0;
                this.type_ = 0;
                this.paths_ = LazyStringArrayList.EMPTY;
                this.errorMessage_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.severity_ = 0;
                this.type_ = 0;
                this.paths_ = LazyStringArrayList.EMPTY;
                this.errorMessage_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ValidationError.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.severity_ = 0;
                this.type_ = 0;
                this.paths_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                this.errorMessage_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_ValidationError_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ValidationError getDefaultInstanceForType() {
                return ValidationError.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ValidationError build() {
                ValidationError result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ValidationError buildPartial() {
                ValidationError result = new ValidationError(this);
                int i = this.bitField0_;
                result.severity_ = this.severity_;
                result.type_ = this.type_;
                if ((this.bitField0_ & 4) == 4) {
                    this.paths_ = this.paths_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                result.paths_ = this.paths_;
                result.errorMessage_ = this.errorMessage_;
                result.bitField0_ = 0;
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
                if (other instanceof ValidationError) {
                    return mergeFrom((ValidationError) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ValidationError other) {
                if (other == ValidationError.getDefaultInstance()) {
                    return this;
                }
                if (other.severity_ != 0) {
                    setSeverityValue(other.getSeverityValue());
                }
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                if (!other.paths_.isEmpty()) {
                    if (this.paths_.isEmpty()) {
                        this.paths_ = other.paths_;
                        this.bitField0_ &= -5;
                    } else {
                        ensurePathsIsMutable();
                        this.paths_.addAll(other.paths_);
                    }
                    onChanged();
                }
                if (!other.getErrorMessage().isEmpty()) {
                    this.errorMessage_ = other.errorMessage_;
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
                ValidationError parsedMessage = null;
                try {
                    try {
                        parsedMessage = (ValidationError) ValidationError.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (ValidationError) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public int getSeverityValue() {
                return this.severity_;
            }

            public Builder setSeverityValue(int value) {
                this.severity_ = value;
                onChanged();
                return this;
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public Severity getSeverity() {
                Severity result = Severity.valueOf(this.severity_);
                return result == null ? Severity.UNRECOGNIZED : result;
            }

            public Builder setSeverity(Severity value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.severity_ = value.getNumber();
                onChanged();
                return this;
            }

            public Builder clearSeverity() {
                this.severity_ = 0;
                onChanged();
                return this;
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            public Builder setTypeValue(int value) {
                this.type_ = value;
                onChanged();
                return this;
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public Type getType() {
                Type result = Type.valueOf(this.type_);
                return result == null ? Type.UNRECOGNIZED : result;
            }

            public Builder setType(Type value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.type_ = value.getNumber();
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            private void ensurePathsIsMutable() {
                if ((this.bitField0_ & 4) != 4) {
                    this.paths_ = new LazyStringArrayList(this.paths_);
                    this.bitField0_ |= 4;
                }
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public ProtocolStringList getPathsList() {
                return this.paths_.getUnmodifiableView();
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public int getPathsCount() {
                return this.paths_.size();
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public String getPaths(int index) {
                return (String) this.paths_.get(index);
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public ByteString getPathsBytes(int index) {
                return this.paths_.getByteString(index);
            }

            public Builder setPaths(int index, String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePathsIsMutable();
                this.paths_.set(index, value);
                onChanged();
                return this;
            }

            public Builder addPaths(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePathsIsMutable();
                this.paths_.add(value);
                onChanged();
                return this;
            }

            public Builder addAllPaths(Iterable<String> values) {
                ensurePathsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) values, (List) this.paths_);
                onChanged();
                return this;
            }

            public Builder clearPaths() {
                this.paths_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder addPathsBytes(ByteString value) {
                if (value != null) {
                    ValidationError.checkByteStringIsUtf8(value);
                    ensurePathsIsMutable();
                    this.paths_.add(value);
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public String getErrorMessage() {
                Object ref = this.errorMessage_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    this.errorMessage_ = s;
                    return s;
                }
                return (String) ref;
            }

            @Override // plugin.actions.Plugin.ValidationErrorOrBuilder
            public ByteString getErrorMessageBytes() {
                Object ref = this.errorMessage_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.errorMessage_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setErrorMessage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.errorMessage_ = value;
                onChanged();
                return this;
            }

            public Builder clearErrorMessage() {
                this.errorMessage_ = ValidationError.getDefaultInstance().getErrorMessage();
                onChanged();
                return this;
            }

            public Builder setErrorMessageBytes(ByteString value) {
                if (value != null) {
                    ValidationError.checkByteStringIsUtf8(value);
                    this.errorMessage_ = value;
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

        public static ValidationError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ValidationError> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ValidationError> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ValidationError getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationResult.class */
    public static final class ValidationResult extends GeneratedMessageV3 implements ValidationResultOrBuilder {
        private static final long serialVersionUID = 0;
        public static final int VALIDATION_ERRORS_FIELD_NUMBER = 1;
        private List<ValidationError> validationErrors_;
        private byte memoizedIsInitialized;
        private static final ValidationResult DEFAULT_INSTANCE = new ValidationResult();
        private static final Parser<ValidationResult> PARSER = new AbstractParser<ValidationResult>() { // from class: plugin.actions.Plugin.ValidationResult.1
            @Override // com.google.protobuf.Parser
            public ValidationResult parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new ValidationResult(input, extensionRegistry);
            }
        };

        private ValidationResult(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private ValidationResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.validationErrors_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ValidationResult(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                    if ((mutable_bitField0_ & 1) != 1) {
                                        this.validationErrors_ = new ArrayList();
                                        mutable_bitField0_ |= 1;
                                    }
                                    this.validationErrors_.add((ValidationError) input.readMessage(ValidationError.parser(), extensionRegistry));
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
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                }
                if ((mutable_bitField0_ & 1) == 1) {
                    this.validationErrors_ = Collections.unmodifiableList(this.validationErrors_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            } catch (Throwable th) {
                if ((mutable_bitField0_ & 1) == 1) {
                    this.validationErrors_ = Collections.unmodifiableList(this.validationErrors_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
                throw th;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Plugin.internal_static_plugin_actions_ValidationResult_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_ValidationResult_fieldAccessorTable.ensureFieldAccessorsInitialized(ValidationResult.class, Builder.class);
        }

        @Override // plugin.actions.Plugin.ValidationResultOrBuilder
        public List<ValidationError> getValidationErrorsList() {
            return this.validationErrors_;
        }

        @Override // plugin.actions.Plugin.ValidationResultOrBuilder
        public List<? extends ValidationErrorOrBuilder> getValidationErrorsOrBuilderList() {
            return this.validationErrors_;
        }

        @Override // plugin.actions.Plugin.ValidationResultOrBuilder
        public int getValidationErrorsCount() {
            return this.validationErrors_.size();
        }

        @Override // plugin.actions.Plugin.ValidationResultOrBuilder
        public ValidationError getValidationErrors(int index) {
            return this.validationErrors_.get(index);
        }

        @Override // plugin.actions.Plugin.ValidationResultOrBuilder
        public ValidationErrorOrBuilder getValidationErrorsOrBuilder(int index) {
            return this.validationErrors_.get(index);
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
            for (int i = 0; i < this.validationErrors_.size(); i++) {
                output.writeMessage(1, this.validationErrors_.get(i));
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
            for (int i = 0; i < this.validationErrors_.size(); i++) {
                size2 += CodedOutputStream.computeMessageSize(1, this.validationErrors_.get(i));
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
            if (!(obj instanceof ValidationResult)) {
                return super.equals(obj);
            }
            ValidationResult other = (ValidationResult) obj;
            boolean result = 1 != 0 && getValidationErrorsList().equals(other.getValidationErrorsList());
            boolean result2 = result && this.unknownFields.equals(other.unknownFields);
            return result2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            if (getValidationErrorsCount() > 0) {
                hash = (53 * ((37 * hash) + 1)) + getValidationErrorsList().hashCode();
            }
            int hash2 = (29 * hash) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static ValidationResult parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ValidationResult parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ValidationResult parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ValidationResult parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ValidationResult parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static ValidationResult parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static ValidationResult parseFrom(InputStream input) throws IOException {
            return (ValidationResult) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static ValidationResult parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ValidationResult) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static ValidationResult parseDelimitedFrom(InputStream input) throws IOException {
            return (ValidationResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static ValidationResult parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ValidationResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static ValidationResult parseFrom(CodedInputStream input) throws IOException {
            return (ValidationResult) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static ValidationResult parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ValidationResult) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ValidationResult prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$ValidationResult$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ValidationResultOrBuilder {
            private int bitField0_;
            private List<ValidationError> validationErrors_;
            private RepeatedFieldBuilderV3<ValidationError, ValidationError.Builder, ValidationErrorOrBuilder> validationErrorsBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_ValidationResult_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_ValidationResult_fieldAccessorTable.ensureFieldAccessorsInitialized(ValidationResult.class, Builder.class);
            }

            private Builder() {
                this.validationErrors_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.validationErrors_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (ValidationResult.alwaysUseFieldBuilders) {
                    getValidationErrorsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                if (this.validationErrorsBuilder_ == null) {
                    this.validationErrors_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.validationErrorsBuilder_.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_ValidationResult_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ValidationResult getDefaultInstanceForType() {
                return ValidationResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ValidationResult build() {
                ValidationResult result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ValidationResult buildPartial() {
                ValidationResult result = new ValidationResult(this);
                int i = this.bitField0_;
                if (this.validationErrorsBuilder_ != null) {
                    result.validationErrors_ = this.validationErrorsBuilder_.build();
                } else {
                    if ((this.bitField0_ & 1) == 1) {
                        this.validationErrors_ = Collections.unmodifiableList(this.validationErrors_);
                        this.bitField0_ &= -2;
                    }
                    result.validationErrors_ = this.validationErrors_;
                }
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
                if (other instanceof ValidationResult) {
                    return mergeFrom((ValidationResult) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(ValidationResult other) {
                if (other == ValidationResult.getDefaultInstance()) {
                    return this;
                }
                if (this.validationErrorsBuilder_ == null) {
                    if (!other.validationErrors_.isEmpty()) {
                        if (this.validationErrors_.isEmpty()) {
                            this.validationErrors_ = other.validationErrors_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureValidationErrorsIsMutable();
                            this.validationErrors_.addAll(other.validationErrors_);
                        }
                        onChanged();
                    }
                } else if (!other.validationErrors_.isEmpty()) {
                    if (!this.validationErrorsBuilder_.isEmpty()) {
                        this.validationErrorsBuilder_.addAllMessages(other.validationErrors_);
                    } else {
                        this.validationErrorsBuilder_.dispose();
                        this.validationErrorsBuilder_ = null;
                        this.validationErrors_ = other.validationErrors_;
                        this.bitField0_ &= -2;
                        this.validationErrorsBuilder_ = ValidationResult.alwaysUseFieldBuilders ? getValidationErrorsFieldBuilder() : null;
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

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                ValidationResult parsedMessage = null;
                try {
                    try {
                        parsedMessage = (ValidationResult) ValidationResult.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (ValidationResult) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            private void ensureValidationErrorsIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.validationErrors_ = new ArrayList(this.validationErrors_);
                    this.bitField0_ |= 1;
                }
            }

            @Override // plugin.actions.Plugin.ValidationResultOrBuilder
            public List<ValidationError> getValidationErrorsList() {
                if (this.validationErrorsBuilder_ == null) {
                    return Collections.unmodifiableList(this.validationErrors_);
                }
                return this.validationErrorsBuilder_.getMessageList();
            }

            @Override // plugin.actions.Plugin.ValidationResultOrBuilder
            public int getValidationErrorsCount() {
                if (this.validationErrorsBuilder_ == null) {
                    return this.validationErrors_.size();
                }
                return this.validationErrorsBuilder_.getCount();
            }

            @Override // plugin.actions.Plugin.ValidationResultOrBuilder
            public ValidationError getValidationErrors(int index) {
                if (this.validationErrorsBuilder_ == null) {
                    return this.validationErrors_.get(index);
                }
                return this.validationErrorsBuilder_.getMessage(index);
            }

            public Builder setValidationErrors(int index, ValidationError value) {
                if (this.validationErrorsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureValidationErrorsIsMutable();
                    this.validationErrors_.set(index, value);
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setValidationErrors(int index, ValidationError.Builder builderForValue) {
                if (this.validationErrorsBuilder_ == null) {
                    ensureValidationErrorsIsMutable();
                    this.validationErrors_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addValidationErrors(ValidationError value) {
                if (this.validationErrorsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureValidationErrorsIsMutable();
                    this.validationErrors_.add(value);
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addValidationErrors(int index, ValidationError value) {
                if (this.validationErrorsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureValidationErrorsIsMutable();
                    this.validationErrors_.add(index, value);
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addValidationErrors(ValidationError.Builder builderForValue) {
                if (this.validationErrorsBuilder_ == null) {
                    ensureValidationErrorsIsMutable();
                    this.validationErrors_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addValidationErrors(int index, ValidationError.Builder builderForValue) {
                if (this.validationErrorsBuilder_ == null) {
                    ensureValidationErrorsIsMutable();
                    this.validationErrors_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllValidationErrors(Iterable<? extends ValidationError> values) {
                if (this.validationErrorsBuilder_ == null) {
                    ensureValidationErrorsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) values, (List) this.validationErrors_);
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearValidationErrors() {
                if (this.validationErrorsBuilder_ == null) {
                    this.validationErrors_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.clear();
                }
                return this;
            }

            public Builder removeValidationErrors(int index) {
                if (this.validationErrorsBuilder_ == null) {
                    ensureValidationErrorsIsMutable();
                    this.validationErrors_.remove(index);
                    onChanged();
                } else {
                    this.validationErrorsBuilder_.remove(index);
                }
                return this;
            }

            public ValidationError.Builder getValidationErrorsBuilder(int index) {
                return getValidationErrorsFieldBuilder().getBuilder(index);
            }

            @Override // plugin.actions.Plugin.ValidationResultOrBuilder
            public ValidationErrorOrBuilder getValidationErrorsOrBuilder(int index) {
                if (this.validationErrorsBuilder_ == null) {
                    return this.validationErrors_.get(index);
                }
                return this.validationErrorsBuilder_.getMessageOrBuilder(index);
            }

            @Override // plugin.actions.Plugin.ValidationResultOrBuilder
            public List<? extends ValidationErrorOrBuilder> getValidationErrorsOrBuilderList() {
                if (this.validationErrorsBuilder_ != null) {
                    return this.validationErrorsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.validationErrors_);
            }

            public ValidationError.Builder addValidationErrorsBuilder() {
                return getValidationErrorsFieldBuilder().addBuilder(ValidationError.getDefaultInstance());
            }

            public ValidationError.Builder addValidationErrorsBuilder(int index) {
                return getValidationErrorsFieldBuilder().addBuilder(index, ValidationError.getDefaultInstance());
            }

            public List<ValidationError.Builder> getValidationErrorsBuilderList() {
                return getValidationErrorsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<ValidationError, ValidationError.Builder, ValidationErrorOrBuilder> getValidationErrorsFieldBuilder() {
                if (this.validationErrorsBuilder_ == null) {
                    this.validationErrorsBuilder_ = new RepeatedFieldBuilderV3<>(this.validationErrors_, (this.bitField0_ & 1) == 1, getParentForChildren(), isClean());
                    this.validationErrors_ = null;
                }
                return this.validationErrorsBuilder_;
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

        public static ValidationResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ValidationResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ValidationResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ValidationResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }
    
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse.class */
    public static final class AndroidActionPackageResponse extends GeneratedMessageV3 implements AndroidActionPackageResponseOrBuilder {
        private static final long serialVersionUID = 0;
        private int bitField0_;
        public static final int ASSISTANT_LINK_FIELD_NUMBER = 1;
        private volatile Object assistantLink_;
        public static final int SUPPORTED_INTENTS_FIELD_NUMBER = 2;
        private List<SupportedIntent> supportedIntents_;
        public static final int PREVIEW_SETTINGS_FIELD_NUMBER = 3;
        private PreviewSettings previewSettings_;
        public static final int VALIDATION_RESULTS_FIELD_NUMBER = 4;
        private List<ValidationResult> validationResults_;
        private byte memoizedIsInitialized;
        private static final AndroidActionPackageResponse DEFAULT_INSTANCE = new AndroidActionPackageResponse();
        private static final Parser<AndroidActionPackageResponse> PARSER = new AbstractParser<AndroidActionPackageResponse>() { // from class: plugin.actions.Plugin.AndroidActionPackageResponse.1
            @Override // com.google.protobuf.Parser
            public AndroidActionPackageResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new AndroidActionPackageResponse(input, extensionRegistry);
            }
        };

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntentOrBuilder.class */
        public interface SupportedIntentOrBuilder extends MessageOrBuilder {
            String getName();

            ByteString getNameBytes();

            List<SupportedIntent.SupportedParameter> getSupportedParametersList();

            SupportedIntent.SupportedParameter getSupportedParameters(int i);

            int getSupportedParametersCount();

            List<? extends SupportedIntent.SupportedParameterOrBuilder> getSupportedParametersOrBuilderList();

            SupportedIntent.SupportedParameterOrBuilder getSupportedParametersOrBuilder(int i);

            boolean hasSupportedIntentCapabilities();

            SupportedIntent.SupportedIntentCapabilities getSupportedIntentCapabilities();

            SupportedIntent.SupportedIntentCapabilitiesOrBuilder getSupportedIntentCapabilitiesOrBuilder();
        }

        private AndroidActionPackageResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private AndroidActionPackageResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.assistantLink_ = "";
            this.supportedIntents_ = Collections.emptyList();
            this.validationResults_ = Collections.emptyList();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AndroidActionPackageResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10:
                                String s = input.readStringRequireUtf8();
                                this.assistantLink_ = s;
                                break;
                            case 18:
                                if ((mutable_bitField0_ & 2) != 2) {
                                    this.supportedIntents_ = new ArrayList();
                                    mutable_bitField0_ |= 2;
                                }
                                this.supportedIntents_.add((SupportedIntent) input.readMessage(SupportedIntent.parser(), extensionRegistry));
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
                                if ((mutable_bitField0_ & 8) != 8) {
                                    this.validationResults_ = new ArrayList();
                                    mutable_bitField0_ |= 8;
                                }
                                this.validationResults_.add((ValidationResult) input.readMessage(ValidationResult.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 2) == 2) {
                    this.supportedIntents_ = Collections.unmodifiableList(this.supportedIntents_);
                }
                if ((mutable_bitField0_ & 8) == 8) {
                    this.validationResults_ = Collections.unmodifiableList(this.validationResults_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            } catch (Throwable th) {
                if ((mutable_bitField0_ & 2) == 2) {
                    this.supportedIntents_ = Collections.unmodifiableList(this.supportedIntents_);
                }
                if ((mutable_bitField0_ & 8) == 8) {
                    this.validationResults_ = Collections.unmodifiableList(this.validationResults_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
                throw th;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AndroidActionPackageResponse.class, Builder.class);
        }

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent.class */
        public static final class SupportedIntent extends GeneratedMessageV3 implements SupportedIntentOrBuilder {
            private static final long serialVersionUID = 0;
            private int bitField0_;
            public static final int NAME_FIELD_NUMBER = 1;
            private volatile Object name_;
            public static final int SUPPORTED_PARAMETERS_FIELD_NUMBER = 2;
            private List<SupportedParameter> supportedParameters_;
            public static final int SUPPORTED_INTENT_CAPABILITIES_FIELD_NUMBER = 3;
            private SupportedIntentCapabilities supportedIntentCapabilities_;
            private byte memoizedIsInitialized;
            private static final SupportedIntent DEFAULT_INSTANCE = new SupportedIntent();
            private static final Parser<SupportedIntent> PARSER = new AbstractParser<SupportedIntent>() { // from class: plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.1
                @Override // com.google.protobuf.Parser
                public SupportedIntent parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SupportedIntent(input, extensionRegistry);
                }
            };

            /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedIntentCapabilitiesOrBuilder.class */
            public interface SupportedIntentCapabilitiesOrBuilder extends MessageOrBuilder {
                boolean getHasWebInventory();
            }

            /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedParameterOrBuilder.class */
            public interface SupportedParameterOrBuilder extends MessageOrBuilder {
                String getName();

                ByteString getNameBytes();

                List<String> getExampleValuesList();

                int getExampleValuesCount();

                String getExampleValues(int i);

                ByteString getExampleValuesBytes(int i);
            }

            private SupportedIntent(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            private SupportedIntent() {
                this.memoizedIsInitialized = (byte) -1;
                this.name_ = "";
                this.supportedParameters_ = Collections.emptyList();
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private SupportedIntent(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                        if ((mutable_bitField0_ & 2) != 2) {
                                            this.supportedParameters_ = new ArrayList();
                                            mutable_bitField0_ |= 2;
                                        }
                                        this.supportedParameters_.add((SupportedParameter) input.readMessage(SupportedParameter.parser(), extensionRegistry));
                                        break;
                                    case 26:
                                        SupportedIntentCapabilities.Builder subBuilder = null;
                                        subBuilder = this.supportedIntentCapabilities_ != null ? this.supportedIntentCapabilities_.toBuilder() : subBuilder;
                                        this.supportedIntentCapabilities_ = (SupportedIntentCapabilities) input.readMessage(SupportedIntentCapabilities.parser(), extensionRegistry);
                                        if (subBuilder == null) {
                                            break;
                                        } else {
                                            subBuilder.mergeFrom(this.supportedIntentCapabilities_);
                                            this.supportedIntentCapabilities_ = subBuilder.buildPartial();
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
                            } catch (IOException e) {
                                throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        }
                    }
                    if ((mutable_bitField0_ & 2) == 2) {
                        this.supportedParameters_ = Collections.unmodifiableList(this.supportedParameters_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                } catch (Throwable th) {
                    if ((mutable_bitField0_ & 2) == 2) {
                        this.supportedParameters_ = Collections.unmodifiableList(this.supportedParameters_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedIntent.class, Builder.class);
            }

            /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedParameter.class */
            public static final class SupportedParameter extends GeneratedMessageV3 implements SupportedParameterOrBuilder {
                private static final long serialVersionUID = 0;
                private int bitField0_;
                public static final int NAME_FIELD_NUMBER = 1;
                private volatile Object name_;
                public static final int EXAMPLE_VALUES_FIELD_NUMBER = 2;
                private LazyStringList exampleValues_;
                private byte memoizedIsInitialized;
                private static final SupportedParameter DEFAULT_INSTANCE = new SupportedParameter();
                private static final Parser<SupportedParameter> PARSER = new AbstractParser<SupportedParameter>() { // from class: plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameter.1
                    @Override // com.google.protobuf.Parser
                    public SupportedParameter parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new SupportedParameter(input, extensionRegistry);
                    }
                };

                private SupportedParameter(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                private SupportedParameter() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.name_ = "";
                    this.exampleValues_ = LazyStringArrayList.EMPTY;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private SupportedParameter(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                        String s2 = input.readStringRequireUtf8();
                                        if ((mutable_bitField0_ & 2) != 2) {
                                            this.exampleValues_ = new LazyStringArrayList();
                                            mutable_bitField0_ |= 2;
                                        }
                                        this.exampleValues_.add(s2);
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
                        if ((mutable_bitField0_ & 2) == 2) {
                            this.exampleValues_ = this.exampleValues_.getUnmodifiableView();
                        }
                        this.unknownFields = unknownFields.build();
                        makeExtensionsImmutable();
                    } catch (Throwable th) {
                        if ((mutable_bitField0_ & 2) == 2) {
                            this.exampleValues_ = this.exampleValues_.getUnmodifiableView();
                        }
                        this.unknownFields = unknownFields.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedParameter.class, Builder.class);
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
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

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                public ByteString getNameBytes() {
                    Object ref = this.name_;
                    if (ref instanceof String) {
                        ByteString b = ByteString.copyFromUtf8((String) ref);
                        this.name_ = b;
                        return b;
                    }
                    return (ByteString) ref;
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                public ProtocolStringList getExampleValuesList() {
                    return this.exampleValues_;
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                public int getExampleValuesCount() {
                    return this.exampleValues_.size();
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                public String getExampleValues(int index) {
                    return (String) this.exampleValues_.get(index);
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                public ByteString getExampleValuesBytes(int index) {
                    return this.exampleValues_.getByteString(index);
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
                    if (!getNameBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(output, 1, this.name_);
                    }
                    for (int i = 0; i < this.exampleValues_.size(); i++) {
                        GeneratedMessageV3.writeString(output, 2, this.exampleValues_.getRaw(i));
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
                    if (!getNameBytes().isEmpty()) {
                        size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                    }
                    int dataSize = 0;
                    for (int i = 0; i < this.exampleValues_.size(); i++) {
                        dataSize += computeStringSizeNoTag(this.exampleValues_.getRaw(i));
                    }
                    int size3 = size2 + dataSize + (1 * getExampleValuesList().size()) + this.unknownFields.getSerializedSize();
                    this.memoizedSize = size3;
                    return size3;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof SupportedParameter)) {
                        return super.equals(obj);
                    }
                    SupportedParameter other = (SupportedParameter) obj;
                    boolean result = 1 != 0 && getName().equals(other.getName());
                    boolean result2 = result && getExampleValuesList().equals(other.getExampleValuesList());
                    boolean result3 = result2 && this.unknownFields.equals(other.unknownFields);
                    return result3;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hash = (19 * 41) + getDescriptor().hashCode();
                    int hash2 = (53 * ((37 * hash) + 1)) + getName().hashCode();
                    if (getExampleValuesCount() > 0) {
                        hash2 = (53 * ((37 * hash2) + 2)) + getExampleValuesList().hashCode();
                    }
                    int hash3 = (29 * hash2) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash3;
                    return hash3;
                }

                public static SupportedParameter parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data);
                }

                public static SupportedParameter parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data, extensionRegistry);
                }

                public static SupportedParameter parseFrom(ByteString data) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data);
                }

                public static SupportedParameter parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data, extensionRegistry);
                }

                public static SupportedParameter parseFrom(byte[] data) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data);
                }

                public static SupportedParameter parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data, extensionRegistry);
                }

                public static SupportedParameter parseFrom(InputStream input) throws IOException {
                    return (SupportedParameter) GeneratedMessageV3.parseWithIOException(PARSER, input);
                }

                public static SupportedParameter parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (SupportedParameter) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
                }

                public static SupportedParameter parseDelimitedFrom(InputStream input) throws IOException {
                    return (SupportedParameter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
                }

                public static SupportedParameter parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (SupportedParameter) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
                }

                public static SupportedParameter parseFrom(CodedInputStream input) throws IOException {
                    return (SupportedParameter) GeneratedMessageV3.parseWithIOException(PARSER, input);
                }

                public static SupportedParameter parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (SupportedParameter) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(SupportedParameter prototype) {
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

                /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedParameter$Builder.class */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedParameterOrBuilder {
                    private int bitField0_;
                    private Object name_;
                    private LazyStringList exampleValues_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_descriptor;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    protected FieldAccessorTable internalGetFieldAccessorTable() {
                        return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedParameter.class, Builder.class);
                    }

                    private Builder() {
                        this.name_ = "";
                        this.exampleValues_ = LazyStringArrayList.EMPTY;
                        maybeForceBuilderInitialization();
                    }

                    private Builder(BuilderParent parent) {
                        super(parent);
                        this.name_ = "";
                        this.exampleValues_ = LazyStringArrayList.EMPTY;
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        if (SupportedParameter.alwaysUseFieldBuilders) {
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.name_ = "";
                        this.exampleValues_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -3;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_descriptor;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    public SupportedParameter getDefaultInstanceForType() {
                        return SupportedParameter.getDefaultInstance();
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public SupportedParameter build() {
                        SupportedParameter result = buildPartial();
                        if (!result.isInitialized()) {
                            throw newUninitializedMessageException((Message) result);
                        }
                        return result;
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public SupportedParameter buildPartial() {
                        SupportedParameter result = new SupportedParameter(this);
                        int i = this.bitField0_;
                        result.name_ = this.name_;
                        if ((this.bitField0_ & 2) == 2) {
                            this.exampleValues_ = this.exampleValues_.getUnmodifiableView();
                            this.bitField0_ &= -3;
                        }
                        result.exampleValues_ = this.exampleValues_;
                        result.bitField0_ = 0;
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
                        if (other instanceof SupportedParameter) {
                            return mergeFrom((SupportedParameter) other);
                        }
                        super.mergeFrom(other);
                        return this;
                    }

                    public Builder mergeFrom(SupportedParameter other) {
                        if (other == SupportedParameter.getDefaultInstance()) {
                            return this;
                        }
                        if (!other.getName().isEmpty()) {
                            this.name_ = other.name_;
                            onChanged();
                        }
                        if (!other.exampleValues_.isEmpty()) {
                            if (this.exampleValues_.isEmpty()) {
                                this.exampleValues_ = other.exampleValues_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExampleValuesIsMutable();
                                this.exampleValues_.addAll(other.exampleValues_);
                            }
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
                        SupportedParameter parsedMessage = null;
                        try {
                            try {
                                parsedMessage = (SupportedParameter) SupportedParameter.PARSER.parsePartialFrom(input, extensionRegistry);
                                if (parsedMessage != null) {
                                    mergeFrom(parsedMessage);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                parsedMessage = (SupportedParameter) e.getUnfinishedMessage();
                                throw e.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            if (parsedMessage != null) {
                                mergeFrom(parsedMessage);
                            }
                            throw th;
                        }
                    }

                    @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
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

                    @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
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
                        this.name_ = SupportedParameter.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString value) {
                        if (value != null) {
                            SupportedParameter.checkByteStringIsUtf8(value);
                            this.name_ = value;
                            onChanged();
                            return this;
                        }
                        throw new NullPointerException();
                    }

                    private void ensureExampleValuesIsMutable() {
                        if ((this.bitField0_ & 2) != 2) {
                            this.exampleValues_ = new LazyStringArrayList(this.exampleValues_);
                            this.bitField0_ |= 2;
                        }
                    }

                    @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                    public ProtocolStringList getExampleValuesList() {
                        return this.exampleValues_.getUnmodifiableView();
                    }

                    @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                    public int getExampleValuesCount() {
                        return this.exampleValues_.size();
                    }

                    @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                    public String getExampleValues(int index) {
                        return (String) this.exampleValues_.get(index);
                    }

                    @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedParameterOrBuilder
                    public ByteString getExampleValuesBytes(int index) {
                        return this.exampleValues_.getByteString(index);
                    }

                    public Builder setExampleValues(int index, String value) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureExampleValuesIsMutable();
                        this.exampleValues_.set(index, value);
                        onChanged();
                        return this;
                    }

                    public Builder addExampleValues(String value) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureExampleValuesIsMutable();
                        this.exampleValues_.add(value);
                        onChanged();
                        return this;
                    }

                    public Builder addAllExampleValues(Iterable<String> values) {
                        ensureExampleValuesIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) values, (List) this.exampleValues_);
                        onChanged();
                        return this;
                    }

                    public Builder clearExampleValues() {
                        this.exampleValues_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -3;
                        onChanged();
                        return this;
                    }

                    public Builder addExampleValuesBytes(ByteString value) {
                        if (value != null) {
                            SupportedParameter.checkByteStringIsUtf8(value);
                            ensureExampleValuesIsMutable();
                            this.exampleValues_.add(value);
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

                public static SupportedParameter getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<SupportedParameter> parser() {
                    return PARSER;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser<SupportedParameter> getParserForType() {
                    return PARSER;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SupportedParameter getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedIntentCapabilities.class */
            public static final class SupportedIntentCapabilities extends GeneratedMessageV3 implements SupportedIntentCapabilitiesOrBuilder {
                private static final long serialVersionUID = 0;
                public static final int HAS_WEB_INVENTORY_FIELD_NUMBER = 1;
                private boolean hasWebInventory_;
                private byte memoizedIsInitialized;
                private static final SupportedIntentCapabilities DEFAULT_INSTANCE = new SupportedIntentCapabilities();
                private static final Parser<SupportedIntentCapabilities> PARSER = new AbstractParser<SupportedIntentCapabilities>() { // from class: plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedIntentCapabilities.1
                    @Override // com.google.protobuf.Parser
                    public SupportedIntentCapabilities parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                        return new SupportedIntentCapabilities(input, extensionRegistry);
                    }
                };

                private SupportedIntentCapabilities(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = (byte) -1;
                }

                private SupportedIntentCapabilities() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.hasWebInventory_ = false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private SupportedIntentCapabilities(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                    case 8:
                                        this.hasWebInventory_ = input.readBool();
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
                    return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedIntentCapabilities.class, Builder.class);
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedIntentCapabilitiesOrBuilder
                public boolean getHasWebInventory() {
                    return this.hasWebInventory_;
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
                    if (this.hasWebInventory_) {
                        output.writeBool(1, this.hasWebInventory_);
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
                    if (this.hasWebInventory_) {
                        size2 = 0 + CodedOutputStream.computeBoolSize(1, this.hasWebInventory_);
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
                    if (!(obj instanceof SupportedIntentCapabilities)) {
                        return super.equals(obj);
                    }
                    SupportedIntentCapabilities other = (SupportedIntentCapabilities) obj;
                    boolean result = 1 != 0 && getHasWebInventory() == other.getHasWebInventory();
                    boolean result2 = result && this.unknownFields.equals(other.unknownFields);
                    return result2;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hash = (19 * 41) + getDescriptor().hashCode();
                    int hash2 = (29 * ((53 * ((37 * hash) + 1)) + Internal.hashBoolean(getHasWebInventory()))) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hash2;
                    return hash2;
                }

                public static SupportedIntentCapabilities parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data);
                }

                public static SupportedIntentCapabilities parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data, extensionRegistry);
                }

                public static SupportedIntentCapabilities parseFrom(ByteString data) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data);
                }

                public static SupportedIntentCapabilities parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data, extensionRegistry);
                }

                public static SupportedIntentCapabilities parseFrom(byte[] data) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data);
                }

                public static SupportedIntentCapabilities parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(data, extensionRegistry);
                }

                public static SupportedIntentCapabilities parseFrom(InputStream input) throws IOException {
                    return (SupportedIntentCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, input);
                }

                public static SupportedIntentCapabilities parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (SupportedIntentCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
                }

                public static SupportedIntentCapabilities parseDelimitedFrom(InputStream input) throws IOException {
                    return (SupportedIntentCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
                }

                public static SupportedIntentCapabilities parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (SupportedIntentCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
                }

                public static SupportedIntentCapabilities parseFrom(CodedInputStream input) throws IOException {
                    return (SupportedIntentCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, input);
                }

                public static SupportedIntentCapabilities parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (SupportedIntentCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(SupportedIntentCapabilities prototype) {
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

                /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$SupportedIntentCapabilities$Builder.class */
                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedIntentCapabilitiesOrBuilder {
                    private boolean hasWebInventory_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_descriptor;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    protected FieldAccessorTable internalGetFieldAccessorTable() {
                        return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedIntentCapabilities.class, Builder.class);
                    }

                    private Builder() {
                        maybeForceBuilderInitialization();
                    }

                    private Builder(BuilderParent parent) {
                        super(parent);
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        if (SupportedIntentCapabilities.alwaysUseFieldBuilders) {
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.hasWebInventory_ = false;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_descriptor;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    public SupportedIntentCapabilities getDefaultInstanceForType() {
                        return SupportedIntentCapabilities.getDefaultInstance();
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public SupportedIntentCapabilities build() {
                        SupportedIntentCapabilities result = buildPartial();
                        if (!result.isInitialized()) {
                            throw newUninitializedMessageException((Message) result);
                        }
                        return result;
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    public SupportedIntentCapabilities buildPartial() {
                        SupportedIntentCapabilities result = new SupportedIntentCapabilities(this);
                        result.hasWebInventory_ = this.hasWebInventory_;
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
                        if (other instanceof SupportedIntentCapabilities) {
                            return mergeFrom((SupportedIntentCapabilities) other);
                        }
                        super.mergeFrom(other);
                        return this;
                    }

                    public Builder mergeFrom(SupportedIntentCapabilities other) {
                        if (other == SupportedIntentCapabilities.getDefaultInstance()) {
                            return this;
                        }
                        if (other.getHasWebInventory()) {
                            setHasWebInventory(other.getHasWebInventory());
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
                        SupportedIntentCapabilities parsedMessage = null;
                        try {
                            try {
                                parsedMessage = (SupportedIntentCapabilities) SupportedIntentCapabilities.PARSER.parsePartialFrom(input, extensionRegistry);
                                if (parsedMessage != null) {
                                    mergeFrom(parsedMessage);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                parsedMessage = (SupportedIntentCapabilities) e.getUnfinishedMessage();
                                throw e.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            if (parsedMessage != null) {
                                mergeFrom(parsedMessage);
                            }
                            throw th;
                        }
                    }

                    @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntent.SupportedIntentCapabilitiesOrBuilder
                    public boolean getHasWebInventory() {
                        return this.hasWebInventory_;
                    }

                    public Builder setHasWebInventory(boolean value) {
                        this.hasWebInventory_ = value;
                        onChanged();
                        return this;
                    }

                    public Builder clearHasWebInventory() {
                        this.hasWebInventory_ = false;
                        onChanged();
                        return this;
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

                public static SupportedIntentCapabilities getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<SupportedIntentCapabilities> parser() {
                    return PARSER;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser<SupportedIntentCapabilities> getParserForType() {
                    return PARSER;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SupportedIntentCapabilities getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
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

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public List<SupportedParameter> getSupportedParametersList() {
                return this.supportedParameters_;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public List<? extends SupportedParameterOrBuilder> getSupportedParametersOrBuilderList() {
                return this.supportedParameters_;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public int getSupportedParametersCount() {
                return this.supportedParameters_.size();
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public SupportedParameter getSupportedParameters(int index) {
                return this.supportedParameters_.get(index);
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public SupportedParameterOrBuilder getSupportedParametersOrBuilder(int index) {
                return this.supportedParameters_.get(index);
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public boolean hasSupportedIntentCapabilities() {
                return this.supportedIntentCapabilities_ != null;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public SupportedIntentCapabilities getSupportedIntentCapabilities() {
                return this.supportedIntentCapabilities_ == null ? SupportedIntentCapabilities.getDefaultInstance() : this.supportedIntentCapabilities_;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
            public SupportedIntentCapabilitiesOrBuilder getSupportedIntentCapabilitiesOrBuilder() {
                return getSupportedIntentCapabilities();
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
                if (!getNameBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(output, 1, this.name_);
                }
                for (int i = 0; i < this.supportedParameters_.size(); i++) {
                    output.writeMessage(2, this.supportedParameters_.get(i));
                }
                if (this.supportedIntentCapabilities_ != null) {
                    output.writeMessage(3, getSupportedIntentCapabilities());
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
                if (!getNameBytes().isEmpty()) {
                    size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                }
                for (int i = 0; i < this.supportedParameters_.size(); i++) {
                    size2 += CodedOutputStream.computeMessageSize(2, this.supportedParameters_.get(i));
                }
                if (this.supportedIntentCapabilities_ != null) {
                    size2 += CodedOutputStream.computeMessageSize(3, getSupportedIntentCapabilities());
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
                if (!(obj instanceof SupportedIntent)) {
                    return super.equals(obj);
                }
                SupportedIntent other = (SupportedIntent) obj;
                boolean result = 1 != 0 && getName().equals(other.getName());
                boolean result2 = result && getSupportedParametersList().equals(other.getSupportedParametersList());
                boolean result3 = result2 && hasSupportedIntentCapabilities() == other.hasSupportedIntentCapabilities();
                if (hasSupportedIntentCapabilities()) {
                    result3 = result3 && getSupportedIntentCapabilities().equals(other.getSupportedIntentCapabilities());
                }
                boolean result4 = result3 && this.unknownFields.equals(other.unknownFields);
                return result4;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hash = (19 * 41) + getDescriptor().hashCode();
                int hash2 = (53 * ((37 * hash) + 1)) + getName().hashCode();
                if (getSupportedParametersCount() > 0) {
                    hash2 = (53 * ((37 * hash2) + 2)) + getSupportedParametersList().hashCode();
                }
                if (hasSupportedIntentCapabilities()) {
                    hash2 = (53 * ((37 * hash2) + 3)) + getSupportedIntentCapabilities().hashCode();
                }
                int hash3 = (29 * hash2) + this.unknownFields.hashCode();
                this.memoizedHashCode = hash3;
                return hash3;
            }

            public static SupportedIntent parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static SupportedIntent parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static SupportedIntent parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static SupportedIntent parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static SupportedIntent parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }

            public static SupportedIntent parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }

            public static SupportedIntent parseFrom(InputStream input) throws IOException {
                return (SupportedIntent) GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static SupportedIntent parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (SupportedIntent) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            public static SupportedIntent parseDelimitedFrom(InputStream input) throws IOException {
                return (SupportedIntent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
            }

            public static SupportedIntent parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (SupportedIntent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }

            public static SupportedIntent parseFrom(CodedInputStream input) throws IOException {
                return (SupportedIntent) GeneratedMessageV3.parseWithIOException(PARSER, input);
            }

            public static SupportedIntent parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (SupportedIntent) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(SupportedIntent prototype) {
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

            /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$SupportedIntent$Builder.class */
            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedIntentOrBuilder {
                private int bitField0_;
                private Object name_;
                private List<SupportedParameter> supportedParameters_;
                private RepeatedFieldBuilderV3<SupportedParameter, SupportedParameter.Builder, SupportedParameterOrBuilder> supportedParametersBuilder_;
                private SupportedIntentCapabilities supportedIntentCapabilities_;
                private SingleFieldBuilderV3<SupportedIntentCapabilities, SupportedIntentCapabilities.Builder, SupportedIntentCapabilitiesOrBuilder> supportedIntentCapabilitiesBuilder_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                protected FieldAccessorTable internalGetFieldAccessorTable() {
                    return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedIntent.class, Builder.class);
                }

                private Builder() {
                    this.name_ = "";
                    this.supportedParameters_ = Collections.emptyList();
                    this.supportedIntentCapabilities_ = null;
                    maybeForceBuilderInitialization();
                }

                private Builder(BuilderParent parent) {
                    super(parent);
                    this.name_ = "";
                    this.supportedParameters_ = Collections.emptyList();
                    this.supportedIntentCapabilities_ = null;
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (SupportedIntent.alwaysUseFieldBuilders) {
                        getSupportedParametersFieldBuilder();
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.name_ = "";
                    if (this.supportedParametersBuilder_ == null) {
                        this.supportedParameters_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        this.supportedParametersBuilder_.clear();
                    }
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        this.supportedIntentCapabilities_ = null;
                    } else {
                        this.supportedIntentCapabilities_ = null;
                        this.supportedIntentCapabilitiesBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SupportedIntent getDefaultInstanceForType() {
                    return SupportedIntent.getDefaultInstance();
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SupportedIntent build() {
                    SupportedIntent result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException((Message) result);
                    }
                    return result;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SupportedIntent buildPartial() {
                    SupportedIntent result = new SupportedIntent(this);
                    int i = this.bitField0_;
                    result.name_ = this.name_;
                    if (this.supportedParametersBuilder_ != null) {
                        result.supportedParameters_ = this.supportedParametersBuilder_.build();
                    } else {
                        if ((this.bitField0_ & 2) == 2) {
                            this.supportedParameters_ = Collections.unmodifiableList(this.supportedParameters_);
                            this.bitField0_ &= -3;
                        }
                        result.supportedParameters_ = this.supportedParameters_;
                    }
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        result.supportedIntentCapabilities_ = this.supportedIntentCapabilities_;
                    } else {
                        result.supportedIntentCapabilities_ = this.supportedIntentCapabilitiesBuilder_.build();
                    }
                    result.bitField0_ = 0;
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
                    if (other instanceof SupportedIntent) {
                        return mergeFrom((SupportedIntent) other);
                    }
                    super.mergeFrom(other);
                    return this;
                }

                public Builder mergeFrom(SupportedIntent other) {
                    if (other == SupportedIntent.getDefaultInstance()) {
                        return this;
                    }
                    if (!other.getName().isEmpty()) {
                        this.name_ = other.name_;
                        onChanged();
                    }
                    if (this.supportedParametersBuilder_ == null) {
                        if (!other.supportedParameters_.isEmpty()) {
                            if (this.supportedParameters_.isEmpty()) {
                                this.supportedParameters_ = other.supportedParameters_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureSupportedParametersIsMutable();
                                this.supportedParameters_.addAll(other.supportedParameters_);
                            }
                            onChanged();
                        }
                    } else if (!other.supportedParameters_.isEmpty()) {
                        if (!this.supportedParametersBuilder_.isEmpty()) {
                            this.supportedParametersBuilder_.addAllMessages(other.supportedParameters_);
                        } else {
                            this.supportedParametersBuilder_.dispose();
                            this.supportedParametersBuilder_ = null;
                            this.supportedParameters_ = other.supportedParameters_;
                            this.bitField0_ &= -3;
                            this.supportedParametersBuilder_ = SupportedIntent.alwaysUseFieldBuilders ? getSupportedParametersFieldBuilder() : null;
                        }
                    }
                    if (other.hasSupportedIntentCapabilities()) {
                        mergeSupportedIntentCapabilities(other.getSupportedIntentCapabilities());
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
                    SupportedIntent parsedMessage = null;
                    try {
                        try {
                            parsedMessage = (SupportedIntent) SupportedIntent.PARSER.parsePartialFrom(input, extensionRegistry);
                            if (parsedMessage != null) {
                                mergeFrom(parsedMessage);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            parsedMessage = (SupportedIntent) e.getUnfinishedMessage();
                            throw e.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        throw th;
                    }
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
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

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
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
                    this.name_ = SupportedIntent.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString value) {
                    if (value != null) {
                        SupportedIntent.checkByteStringIsUtf8(value);
                        this.name_ = value;
                        onChanged();
                        return this;
                    }
                    throw new NullPointerException();
                }

                private void ensureSupportedParametersIsMutable() {
                    if ((this.bitField0_ & 2) != 2) {
                        this.supportedParameters_ = new ArrayList(this.supportedParameters_);
                        this.bitField0_ |= 2;
                    }
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public List<SupportedParameter> getSupportedParametersList() {
                    if (this.supportedParametersBuilder_ == null) {
                        return Collections.unmodifiableList(this.supportedParameters_);
                    }
                    return this.supportedParametersBuilder_.getMessageList();
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public int getSupportedParametersCount() {
                    if (this.supportedParametersBuilder_ == null) {
                        return this.supportedParameters_.size();
                    }
                    return this.supportedParametersBuilder_.getCount();
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public SupportedParameter getSupportedParameters(int index) {
                    if (this.supportedParametersBuilder_ == null) {
                        return this.supportedParameters_.get(index);
                    }
                    return this.supportedParametersBuilder_.getMessage(index);
                }

                public Builder setSupportedParameters(int index, SupportedParameter value) {
                    if (this.supportedParametersBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureSupportedParametersIsMutable();
                        this.supportedParameters_.set(index, value);
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.setMessage(index, value);
                    }
                    return this;
                }

                public Builder setSupportedParameters(int index, SupportedParameter.Builder builderForValue) {
                    if (this.supportedParametersBuilder_ == null) {
                        ensureSupportedParametersIsMutable();
                        this.supportedParameters_.set(index, builderForValue.build());
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.setMessage(index, builderForValue.build());
                    }
                    return this;
                }

                public Builder addSupportedParameters(SupportedParameter value) {
                    if (this.supportedParametersBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureSupportedParametersIsMutable();
                        this.supportedParameters_.add(value);
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.addMessage(value);
                    }
                    return this;
                }

                public Builder addSupportedParameters(int index, SupportedParameter value) {
                    if (this.supportedParametersBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        ensureSupportedParametersIsMutable();
                        this.supportedParameters_.add(index, value);
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.addMessage(index, value);
                    }
                    return this;
                }

                public Builder addSupportedParameters(SupportedParameter.Builder builderForValue) {
                    if (this.supportedParametersBuilder_ == null) {
                        ensureSupportedParametersIsMutable();
                        this.supportedParameters_.add(builderForValue.build());
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.addMessage(builderForValue.build());
                    }
                    return this;
                }

                public Builder addSupportedParameters(int index, SupportedParameter.Builder builderForValue) {
                    if (this.supportedParametersBuilder_ == null) {
                        ensureSupportedParametersIsMutable();
                        this.supportedParameters_.add(index, builderForValue.build());
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.addMessage(index, builderForValue.build());
                    }
                    return this;
                }

                public Builder addAllSupportedParameters(Iterable<? extends SupportedParameter> values) {
                    if (this.supportedParametersBuilder_ == null) {
                        ensureSupportedParametersIsMutable();
                        AbstractMessageLite.Builder.addAll((Iterable) values, (List) this.supportedParameters_);
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.addAllMessages(values);
                    }
                    return this;
                }

                public Builder clearSupportedParameters() {
                    if (this.supportedParametersBuilder_ == null) {
                        this.supportedParameters_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.clear();
                    }
                    return this;
                }

                public Builder removeSupportedParameters(int index) {
                    if (this.supportedParametersBuilder_ == null) {
                        ensureSupportedParametersIsMutable();
                        this.supportedParameters_.remove(index);
                        onChanged();
                    } else {
                        this.supportedParametersBuilder_.remove(index);
                    }
                    return this;
                }

                public SupportedParameter.Builder getSupportedParametersBuilder(int index) {
                    return getSupportedParametersFieldBuilder().getBuilder(index);
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public SupportedParameterOrBuilder getSupportedParametersOrBuilder(int index) {
                    if (this.supportedParametersBuilder_ == null) {
                        return this.supportedParameters_.get(index);
                    }
                    return this.supportedParametersBuilder_.getMessageOrBuilder(index);
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public List<? extends SupportedParameterOrBuilder> getSupportedParametersOrBuilderList() {
                    if (this.supportedParametersBuilder_ != null) {
                        return this.supportedParametersBuilder_.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.supportedParameters_);
                }

                public SupportedParameter.Builder addSupportedParametersBuilder() {
                    return getSupportedParametersFieldBuilder().addBuilder(SupportedParameter.getDefaultInstance());
                }

                public SupportedParameter.Builder addSupportedParametersBuilder(int index) {
                    return getSupportedParametersFieldBuilder().addBuilder(index, SupportedParameter.getDefaultInstance());
                }

                public List<SupportedParameter.Builder> getSupportedParametersBuilderList() {
                    return getSupportedParametersFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<SupportedParameter, SupportedParameter.Builder, SupportedParameterOrBuilder> getSupportedParametersFieldBuilder() {
                    if (this.supportedParametersBuilder_ == null) {
                        this.supportedParametersBuilder_ = new RepeatedFieldBuilderV3<>(this.supportedParameters_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                        this.supportedParameters_ = null;
                    }
                    return this.supportedParametersBuilder_;
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public boolean hasSupportedIntentCapabilities() {
                    return (this.supportedIntentCapabilitiesBuilder_ == null && this.supportedIntentCapabilities_ == null) ? false : true;
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public SupportedIntentCapabilities getSupportedIntentCapabilities() {
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        return this.supportedIntentCapabilities_ == null ? SupportedIntentCapabilities.getDefaultInstance() : this.supportedIntentCapabilities_;
                    }
                    return this.supportedIntentCapabilitiesBuilder_.getMessage();
                }

                public Builder setSupportedIntentCapabilities(SupportedIntentCapabilities value) {
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        this.supportedIntentCapabilities_ = value;
                        onChanged();
                    } else {
                        this.supportedIntentCapabilitiesBuilder_.setMessage(value);
                    }
                    return this;
                }

                public Builder setSupportedIntentCapabilities(SupportedIntentCapabilities.Builder builderForValue) {
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        this.supportedIntentCapabilities_ = builderForValue.build();
                        onChanged();
                    } else {
                        this.supportedIntentCapabilitiesBuilder_.setMessage(builderForValue.build());
                    }
                    return this;
                }

                public Builder mergeSupportedIntentCapabilities(SupportedIntentCapabilities value) {
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        if (this.supportedIntentCapabilities_ != null) {
                            this.supportedIntentCapabilities_ = SupportedIntentCapabilities.newBuilder(this.supportedIntentCapabilities_).mergeFrom(value).buildPartial();
                        } else {
                            this.supportedIntentCapabilities_ = value;
                        }
                        onChanged();
                    } else {
                        this.supportedIntentCapabilitiesBuilder_.mergeFrom(value);
                    }
                    return this;
                }

                public Builder clearSupportedIntentCapabilities() {
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        this.supportedIntentCapabilities_ = null;
                        onChanged();
                    } else {
                        this.supportedIntentCapabilities_ = null;
                        this.supportedIntentCapabilitiesBuilder_ = null;
                    }
                    return this;
                }

                public SupportedIntentCapabilities.Builder getSupportedIntentCapabilitiesBuilder() {
                    onChanged();
                    return getSupportedIntentCapabilitiesFieldBuilder().getBuilder();
                }

                @Override // plugin.actions.Plugin.AndroidActionPackageResponse.SupportedIntentOrBuilder
                public SupportedIntentCapabilitiesOrBuilder getSupportedIntentCapabilitiesOrBuilder() {
                    if (this.supportedIntentCapabilitiesBuilder_ != null) {
                        return this.supportedIntentCapabilitiesBuilder_.getMessageOrBuilder();
                    }
                    return this.supportedIntentCapabilities_ == null ? SupportedIntentCapabilities.getDefaultInstance() : this.supportedIntentCapabilities_;
                }

                private SingleFieldBuilderV3<SupportedIntentCapabilities, SupportedIntentCapabilities.Builder, SupportedIntentCapabilitiesOrBuilder> getSupportedIntentCapabilitiesFieldBuilder() {
                    if (this.supportedIntentCapabilitiesBuilder_ == null) {
                        this.supportedIntentCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getSupportedIntentCapabilities(), getParentForChildren(), isClean());
                        this.supportedIntentCapabilities_ = null;
                    }
                    return this.supportedIntentCapabilitiesBuilder_;
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

            public static SupportedIntent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<SupportedIntent> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SupportedIntent> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SupportedIntent getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public String getAssistantLink() {
            Object ref = this.assistantLink_;
            if (ref instanceof String) {
                return (String) ref;
            }
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            this.assistantLink_ = s;
            return s;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public ByteString getAssistantLinkBytes() {
            Object ref = this.assistantLink_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.assistantLink_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public List<SupportedIntent> getSupportedIntentsList() {
            return this.supportedIntents_;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public List<? extends SupportedIntentOrBuilder> getSupportedIntentsOrBuilderList() {
            return this.supportedIntents_;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public int getSupportedIntentsCount() {
            return this.supportedIntents_.size();
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public SupportedIntent getSupportedIntents(int index) {
            return this.supportedIntents_.get(index);
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public SupportedIntentOrBuilder getSupportedIntentsOrBuilder(int index) {
            return this.supportedIntents_.get(index);
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public boolean hasPreviewSettings() {
            return this.previewSettings_ != null;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public PreviewSettings getPreviewSettings() {
            return this.previewSettings_ == null ? PreviewSettings.getDefaultInstance() : this.previewSettings_;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public PreviewSettingsOrBuilder getPreviewSettingsOrBuilder() {
            return getPreviewSettings();
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public List<ValidationResult> getValidationResultsList() {
            return this.validationResults_;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public List<? extends ValidationResultOrBuilder> getValidationResultsOrBuilderList() {
            return this.validationResults_;
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public int getValidationResultsCount() {
            return this.validationResults_.size();
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public ValidationResult getValidationResults(int index) {
            return this.validationResults_.get(index);
        }

        @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
        public ValidationResultOrBuilder getValidationResultsOrBuilder(int index) {
            return this.validationResults_.get(index);
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
            if (!getAssistantLinkBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.assistantLink_);
            }
            for (int i = 0; i < this.supportedIntents_.size(); i++) {
                output.writeMessage(2, this.supportedIntents_.get(i));
            }
            if (this.previewSettings_ != null) {
                output.writeMessage(3, getPreviewSettings());
            }
            for (int i2 = 0; i2 < this.validationResults_.size(); i2++) {
                output.writeMessage(4, this.validationResults_.get(i2));
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
            if (!getAssistantLinkBytes().isEmpty()) {
                size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.assistantLink_);
            }
            for (int i = 0; i < this.supportedIntents_.size(); i++) {
                size2 += CodedOutputStream.computeMessageSize(2, this.supportedIntents_.get(i));
            }
            if (this.previewSettings_ != null) {
                size2 += CodedOutputStream.computeMessageSize(3, getPreviewSettings());
            }
            for (int i2 = 0; i2 < this.validationResults_.size(); i2++) {
                size2 += CodedOutputStream.computeMessageSize(4, this.validationResults_.get(i2));
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
            if (!(obj instanceof AndroidActionPackageResponse)) {
                return super.equals(obj);
            }
            AndroidActionPackageResponse other = (AndroidActionPackageResponse) obj;
            boolean result = 1 != 0 && getAssistantLink().equals(other.getAssistantLink());
            boolean result2 = result && getSupportedIntentsList().equals(other.getSupportedIntentsList());
            boolean result3 = result2 && hasPreviewSettings() == other.hasPreviewSettings();
            if (hasPreviewSettings()) {
                result3 = result3 && getPreviewSettings().equals(other.getPreviewSettings());
            }
            boolean result4 = result3 && getValidationResultsList().equals(other.getValidationResultsList());
            boolean result5 = result4 && this.unknownFields.equals(other.unknownFields);
            return result5;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            int hash2 = (53 * ((37 * hash) + 1)) + getAssistantLink().hashCode();
            if (getSupportedIntentsCount() > 0) {
                hash2 = (53 * ((37 * hash2) + 2)) + getSupportedIntentsList().hashCode();
            }
            if (hasPreviewSettings()) {
                hash2 = (53 * ((37 * hash2) + 3)) + getPreviewSettings().hashCode();
            }
            if (getValidationResultsCount() > 0) {
                hash2 = (53 * ((37 * hash2) + 4)) + getValidationResultsList().hashCode();
            }
            int hash3 = (29 * hash2) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash3;
            return hash3;
        }

        public static AndroidActionPackageResponse parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AndroidActionPackageResponse parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AndroidActionPackageResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AndroidActionPackageResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AndroidActionPackageResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AndroidActionPackageResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AndroidActionPackageResponse parseFrom(InputStream input) throws IOException {
            return (AndroidActionPackageResponse) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AndroidActionPackageResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AndroidActionPackageResponse) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AndroidActionPackageResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (AndroidActionPackageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AndroidActionPackageResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AndroidActionPackageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AndroidActionPackageResponse parseFrom(CodedInputStream input) throws IOException {
            return (AndroidActionPackageResponse) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AndroidActionPackageResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AndroidActionPackageResponse) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AndroidActionPackageResponse prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AndroidActionPackageResponse$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AndroidActionPackageResponseOrBuilder {
            private int bitField0_;
            private Object assistantLink_;
            private List<SupportedIntent> supportedIntents_;
            private RepeatedFieldBuilderV3<SupportedIntent, SupportedIntent.Builder, SupportedIntentOrBuilder> supportedIntentsBuilder_;
            private PreviewSettings previewSettings_;
            private SingleFieldBuilderV3<PreviewSettings, PreviewSettings.Builder, PreviewSettingsOrBuilder> previewSettingsBuilder_;
            private List<ValidationResult> validationResults_;
            private RepeatedFieldBuilderV3<ValidationResult, ValidationResult.Builder, ValidationResultOrBuilder> validationResultsBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AndroidActionPackageResponse.class, Builder.class);
            }

            private Builder() {
                this.assistantLink_ = "";
                this.supportedIntents_ = Collections.emptyList();
                this.previewSettings_ = null;
                this.validationResults_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.assistantLink_ = "";
                this.supportedIntents_ = Collections.emptyList();
                this.previewSettings_ = null;
                this.validationResults_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (AndroidActionPackageResponse.alwaysUseFieldBuilders) {
                    getSupportedIntentsFieldBuilder();
                    getValidationResultsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.assistantLink_ = "";
                if (this.supportedIntentsBuilder_ == null) {
                    this.supportedIntents_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.supportedIntentsBuilder_.clear();
                }
                if (this.previewSettingsBuilder_ == null) {
                    this.previewSettings_ = null;
                } else {
                    this.previewSettings_ = null;
                    this.previewSettingsBuilder_ = null;
                }
                if (this.validationResultsBuilder_ == null) {
                    this.validationResults_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    this.validationResultsBuilder_.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_AndroidActionPackageResponse_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AndroidActionPackageResponse getDefaultInstanceForType() {
                return AndroidActionPackageResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AndroidActionPackageResponse build() {
                AndroidActionPackageResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AndroidActionPackageResponse buildPartial() {
                AndroidActionPackageResponse result = new AndroidActionPackageResponse(this);
                int i = this.bitField0_;
                result.assistantLink_ = this.assistantLink_;
                if (this.supportedIntentsBuilder_ != null) {
                    result.supportedIntents_ = this.supportedIntentsBuilder_.build();
                } else {
                    if ((this.bitField0_ & 2) == 2) {
                        this.supportedIntents_ = Collections.unmodifiableList(this.supportedIntents_);
                        this.bitField0_ &= -3;
                    }
                    result.supportedIntents_ = this.supportedIntents_;
                }
                if (this.previewSettingsBuilder_ == null) {
                    result.previewSettings_ = this.previewSettings_;
                } else {
                    result.previewSettings_ = this.previewSettingsBuilder_.build();
                }
                if (this.validationResultsBuilder_ != null) {
                    result.validationResults_ = this.validationResultsBuilder_.build();
                } else {
                    if ((this.bitField0_ & 8) == 8) {
                        this.validationResults_ = Collections.unmodifiableList(this.validationResults_);
                        this.bitField0_ &= -9;
                    }
                    result.validationResults_ = this.validationResults_;
                }
                result.bitField0_ = 0;
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
                if (other instanceof AndroidActionPackageResponse) {
                    return mergeFrom((AndroidActionPackageResponse) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(AndroidActionPackageResponse other) {
                if (other == AndroidActionPackageResponse.getDefaultInstance()) {
                    return this;
                }
                if (!other.getAssistantLink().isEmpty()) {
                    this.assistantLink_ = other.assistantLink_;
                    onChanged();
                }
                if (this.supportedIntentsBuilder_ == null) {
                    if (!other.supportedIntents_.isEmpty()) {
                        if (this.supportedIntents_.isEmpty()) {
                            this.supportedIntents_ = other.supportedIntents_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureSupportedIntentsIsMutable();
                            this.supportedIntents_.addAll(other.supportedIntents_);
                        }
                        onChanged();
                    }
                } else if (!other.supportedIntents_.isEmpty()) {
                    if (!this.supportedIntentsBuilder_.isEmpty()) {
                        this.supportedIntentsBuilder_.addAllMessages(other.supportedIntents_);
                    } else {
                        this.supportedIntentsBuilder_.dispose();
                        this.supportedIntentsBuilder_ = null;
                        this.supportedIntents_ = other.supportedIntents_;
                        this.bitField0_ &= -3;
                        this.supportedIntentsBuilder_ = AndroidActionPackageResponse.alwaysUseFieldBuilders ? getSupportedIntentsFieldBuilder() : null;
                    }
                }
                if (other.hasPreviewSettings()) {
                    mergePreviewSettings(other.getPreviewSettings());
                }
                if (this.validationResultsBuilder_ == null) {
                    if (!other.validationResults_.isEmpty()) {
                        if (this.validationResults_.isEmpty()) {
                            this.validationResults_ = other.validationResults_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureValidationResultsIsMutable();
                            this.validationResults_.addAll(other.validationResults_);
                        }
                        onChanged();
                    }
                } else if (!other.validationResults_.isEmpty()) {
                    if (!this.validationResultsBuilder_.isEmpty()) {
                        this.validationResultsBuilder_.addAllMessages(other.validationResults_);
                    } else {
                        this.validationResultsBuilder_.dispose();
                        this.validationResultsBuilder_ = null;
                        this.validationResults_ = other.validationResults_;
                        this.bitField0_ &= -9;
                        this.validationResultsBuilder_ = AndroidActionPackageResponse.alwaysUseFieldBuilders ? getValidationResultsFieldBuilder() : null;
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

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                AndroidActionPackageResponse parsedMessage = null;
                try {
                    try {
                        parsedMessage = (AndroidActionPackageResponse) AndroidActionPackageResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (AndroidActionPackageResponse) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public String getAssistantLink() {
                Object ref = this.assistantLink_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    this.assistantLink_ = s;
                    return s;
                }
                return (String) ref;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public ByteString getAssistantLinkBytes() {
                Object ref = this.assistantLink_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.assistantLink_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setAssistantLink(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.assistantLink_ = value;
                onChanged();
                return this;
            }

            public Builder clearAssistantLink() {
                this.assistantLink_ = AndroidActionPackageResponse.getDefaultInstance().getAssistantLink();
                onChanged();
                return this;
            }

            public Builder setAssistantLinkBytes(ByteString value) {
                if (value != null) {
                    AndroidActionPackageResponse.checkByteStringIsUtf8(value);
                    this.assistantLink_ = value;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            private void ensureSupportedIntentsIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.supportedIntents_ = new ArrayList(this.supportedIntents_);
                    this.bitField0_ |= 2;
                }
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public List<SupportedIntent> getSupportedIntentsList() {
                if (this.supportedIntentsBuilder_ == null) {
                    return Collections.unmodifiableList(this.supportedIntents_);
                }
                return this.supportedIntentsBuilder_.getMessageList();
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public int getSupportedIntentsCount() {
                if (this.supportedIntentsBuilder_ == null) {
                    return this.supportedIntents_.size();
                }
                return this.supportedIntentsBuilder_.getCount();
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public SupportedIntent getSupportedIntents(int index) {
                if (this.supportedIntentsBuilder_ == null) {
                    return this.supportedIntents_.get(index);
                }
                return this.supportedIntentsBuilder_.getMessage(index);
            }

            public Builder setSupportedIntents(int index, SupportedIntent value) {
                if (this.supportedIntentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSupportedIntentsIsMutable();
                    this.supportedIntents_.set(index, value);
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setSupportedIntents(int index, SupportedIntent.Builder builderForValue) {
                if (this.supportedIntentsBuilder_ == null) {
                    ensureSupportedIntentsIsMutable();
                    this.supportedIntents_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addSupportedIntents(SupportedIntent value) {
                if (this.supportedIntentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSupportedIntentsIsMutable();
                    this.supportedIntents_.add(value);
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addSupportedIntents(int index, SupportedIntent value) {
                if (this.supportedIntentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSupportedIntentsIsMutable();
                    this.supportedIntents_.add(index, value);
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addSupportedIntents(SupportedIntent.Builder builderForValue) {
                if (this.supportedIntentsBuilder_ == null) {
                    ensureSupportedIntentsIsMutable();
                    this.supportedIntents_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addSupportedIntents(int index, SupportedIntent.Builder builderForValue) {
                if (this.supportedIntentsBuilder_ == null) {
                    ensureSupportedIntentsIsMutable();
                    this.supportedIntents_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllSupportedIntents(Iterable<? extends SupportedIntent> values) {
                if (this.supportedIntentsBuilder_ == null) {
                    ensureSupportedIntentsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) values, (List) this.supportedIntents_);
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearSupportedIntents() {
                if (this.supportedIntentsBuilder_ == null) {
                    this.supportedIntents_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.clear();
                }
                return this;
            }

            public Builder removeSupportedIntents(int index) {
                if (this.supportedIntentsBuilder_ == null) {
                    ensureSupportedIntentsIsMutable();
                    this.supportedIntents_.remove(index);
                    onChanged();
                } else {
                    this.supportedIntentsBuilder_.remove(index);
                }
                return this;
            }

            public SupportedIntent.Builder getSupportedIntentsBuilder(int index) {
                return getSupportedIntentsFieldBuilder().getBuilder(index);
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public SupportedIntentOrBuilder getSupportedIntentsOrBuilder(int index) {
                if (this.supportedIntentsBuilder_ == null) {
                    return this.supportedIntents_.get(index);
                }
                return this.supportedIntentsBuilder_.getMessageOrBuilder(index);
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public List<? extends SupportedIntentOrBuilder> getSupportedIntentsOrBuilderList() {
                if (this.supportedIntentsBuilder_ != null) {
                    return this.supportedIntentsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.supportedIntents_);
            }

            public SupportedIntent.Builder addSupportedIntentsBuilder() {
                return getSupportedIntentsFieldBuilder().addBuilder(SupportedIntent.getDefaultInstance());
            }

            public SupportedIntent.Builder addSupportedIntentsBuilder(int index) {
                return getSupportedIntentsFieldBuilder().addBuilder(index, SupportedIntent.getDefaultInstance());
            }

            public List<SupportedIntent.Builder> getSupportedIntentsBuilderList() {
                return getSupportedIntentsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<SupportedIntent, SupportedIntent.Builder, SupportedIntentOrBuilder> getSupportedIntentsFieldBuilder() {
                if (this.supportedIntentsBuilder_ == null) {
                    this.supportedIntentsBuilder_ = new RepeatedFieldBuilderV3<>(this.supportedIntents_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.supportedIntents_ = null;
                }
                return this.supportedIntentsBuilder_;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public boolean hasPreviewSettings() {
                return (this.previewSettingsBuilder_ == null && this.previewSettings_ == null) ? false : true;
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
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

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
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

            private void ensureValidationResultsIsMutable() {
                if ((this.bitField0_ & 8) != 8) {
                    this.validationResults_ = new ArrayList(this.validationResults_);
                    this.bitField0_ |= 8;
                }
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public List<ValidationResult> getValidationResultsList() {
                if (this.validationResultsBuilder_ == null) {
                    return Collections.unmodifiableList(this.validationResults_);
                }
                return this.validationResultsBuilder_.getMessageList();
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public int getValidationResultsCount() {
                if (this.validationResultsBuilder_ == null) {
                    return this.validationResults_.size();
                }
                return this.validationResultsBuilder_.getCount();
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public ValidationResult getValidationResults(int index) {
                if (this.validationResultsBuilder_ == null) {
                    return this.validationResults_.get(index);
                }
                return this.validationResultsBuilder_.getMessage(index);
            }

            public Builder setValidationResults(int index, ValidationResult value) {
                if (this.validationResultsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureValidationResultsIsMutable();
                    this.validationResults_.set(index, value);
                    onChanged();
                } else {
                    this.validationResultsBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setValidationResults(int index, ValidationResult.Builder builderForValue) {
                if (this.validationResultsBuilder_ == null) {
                    ensureValidationResultsIsMutable();
                    this.validationResults_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.validationResultsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addValidationResults(ValidationResult value) {
                if (this.validationResultsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureValidationResultsIsMutable();
                    this.validationResults_.add(value);
                    onChanged();
                } else {
                    this.validationResultsBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addValidationResults(int index, ValidationResult value) {
                if (this.validationResultsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureValidationResultsIsMutable();
                    this.validationResults_.add(index, value);
                    onChanged();
                } else {
                    this.validationResultsBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addValidationResults(ValidationResult.Builder builderForValue) {
                if (this.validationResultsBuilder_ == null) {
                    ensureValidationResultsIsMutable();
                    this.validationResults_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.validationResultsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addValidationResults(int index, ValidationResult.Builder builderForValue) {
                if (this.validationResultsBuilder_ == null) {
                    ensureValidationResultsIsMutable();
                    this.validationResults_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.validationResultsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllValidationResults(Iterable<? extends ValidationResult> values) {
                if (this.validationResultsBuilder_ == null) {
                    ensureValidationResultsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) values, (List) this.validationResults_);
                    onChanged();
                } else {
                    this.validationResultsBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearValidationResults() {
                if (this.validationResultsBuilder_ == null) {
                    this.validationResults_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    this.validationResultsBuilder_.clear();
                }
                return this;
            }

            public Builder removeValidationResults(int index) {
                if (this.validationResultsBuilder_ == null) {
                    ensureValidationResultsIsMutable();
                    this.validationResults_.remove(index);
                    onChanged();
                } else {
                    this.validationResultsBuilder_.remove(index);
                }
                return this;
            }

            public ValidationResult.Builder getValidationResultsBuilder(int index) {
                return getValidationResultsFieldBuilder().getBuilder(index);
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public ValidationResultOrBuilder getValidationResultsOrBuilder(int index) {
                if (this.validationResultsBuilder_ == null) {
                    return this.validationResults_.get(index);
                }
                return this.validationResultsBuilder_.getMessageOrBuilder(index);
            }

            @Override // plugin.actions.Plugin.AndroidActionPackageResponseOrBuilder
            public List<? extends ValidationResultOrBuilder> getValidationResultsOrBuilderList() {
                if (this.validationResultsBuilder_ != null) {
                    return this.validationResultsBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.validationResults_);
            }

            public ValidationResult.Builder addValidationResultsBuilder() {
                return getValidationResultsFieldBuilder().addBuilder(ValidationResult.getDefaultInstance());
            }

            public ValidationResult.Builder addValidationResultsBuilder(int index) {
                return getValidationResultsFieldBuilder().addBuilder(index, ValidationResult.getDefaultInstance());
            }

            public List<ValidationResult.Builder> getValidationResultsBuilderList() {
                return getValidationResultsFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<ValidationResult, ValidationResult.Builder, ValidationResultOrBuilder> getValidationResultsFieldBuilder() {
                if (this.validationResultsBuilder_ == null) {
                    this.validationResultsBuilder_ = new RepeatedFieldBuilderV3<>(this.validationResults_, (this.bitField0_ & 8) == 8, getParentForChildren(), isClean());
                    this.validationResults_ = null;
                }
                return this.validationResultsBuilder_;
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

        public static AndroidActionPackageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AndroidActionPackageResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AndroidActionPackageResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AndroidActionPackageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$GetAndroidActionPackageV2Request.class */
    public static final class GetAndroidActionPackageV2Request extends GeneratedMessageV3 implements GetAndroidActionPackageV2RequestOrBuilder {
        private static final long serialVersionUID = 0;
        public static final int NAME_FIELD_NUMBER = 1;
        private volatile Object name_;
        private byte memoizedIsInitialized;
        private static final GetAndroidActionPackageV2Request DEFAULT_INSTANCE = new GetAndroidActionPackageV2Request();
        private static final Parser<GetAndroidActionPackageV2Request> PARSER = new AbstractParser<GetAndroidActionPackageV2Request>() { // from class: plugin.actions.Plugin.GetAndroidActionPackageV2Request.1
            @Override // com.google.protobuf.Parser
            public GetAndroidActionPackageV2Request parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GetAndroidActionPackageV2Request(input, extensionRegistry);
            }
        };

        private GetAndroidActionPackageV2Request(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private GetAndroidActionPackageV2Request() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetAndroidActionPackageV2Request(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        }
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
            return Plugin.internal_static_plugin_actions_GetAndroidActionPackageV2Request_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_GetAndroidActionPackageV2Request_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAndroidActionPackageV2Request.class, Builder.class);
        }

        @Override // plugin.actions.Plugin.GetAndroidActionPackageV2RequestOrBuilder
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

        @Override // plugin.actions.Plugin.GetAndroidActionPackageV2RequestOrBuilder
        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
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
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.name_);
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
            if (!getNameBytes().isEmpty()) {
                size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
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
            if (!(obj instanceof GetAndroidActionPackageV2Request)) {
                return super.equals(obj);
            }
            GetAndroidActionPackageV2Request other = (GetAndroidActionPackageV2Request) obj;
            boolean result = 1 != 0 && getName().equals(other.getName());
            boolean result2 = result && this.unknownFields.equals(other.unknownFields);
            return result2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            int hash2 = (29 * ((53 * ((37 * hash) + 1)) + getName().hashCode())) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static GetAndroidActionPackageV2Request parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static GetAndroidActionPackageV2Request parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetAndroidActionPackageV2Request parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static GetAndroidActionPackageV2Request parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetAndroidActionPackageV2Request parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static GetAndroidActionPackageV2Request parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetAndroidActionPackageV2Request parseFrom(InputStream input) throws IOException {
            return (GetAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static GetAndroidActionPackageV2Request parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static GetAndroidActionPackageV2Request parseDelimitedFrom(InputStream input) throws IOException {
            return (GetAndroidActionPackageV2Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static GetAndroidActionPackageV2Request parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAndroidActionPackageV2Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static GetAndroidActionPackageV2Request parseFrom(CodedInputStream input) throws IOException {
            return (GetAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static GetAndroidActionPackageV2Request parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetAndroidActionPackageV2Request) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(GetAndroidActionPackageV2Request prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$GetAndroidActionPackageV2Request$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetAndroidActionPackageV2RequestOrBuilder {
            private Object name_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_GetAndroidActionPackageV2Request_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_GetAndroidActionPackageV2Request_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAndroidActionPackageV2Request.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GetAndroidActionPackageV2Request.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.name_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_GetAndroidActionPackageV2Request_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetAndroidActionPackageV2Request getDefaultInstanceForType() {
                return GetAndroidActionPackageV2Request.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetAndroidActionPackageV2Request build() {
                GetAndroidActionPackageV2Request result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetAndroidActionPackageV2Request buildPartial() {
                GetAndroidActionPackageV2Request result = new GetAndroidActionPackageV2Request(this);
                result.name_ = this.name_;
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
                if (other instanceof GetAndroidActionPackageV2Request) {
                    return mergeFrom((GetAndroidActionPackageV2Request) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GetAndroidActionPackageV2Request other) {
                if (other == GetAndroidActionPackageV2Request.getDefaultInstance()) {
                    return this;
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
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
                GetAndroidActionPackageV2Request parsedMessage = null;
                try {
                    try {
                        parsedMessage = (GetAndroidActionPackageV2Request) GetAndroidActionPackageV2Request.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (GetAndroidActionPackageV2Request) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            @Override // plugin.actions.Plugin.GetAndroidActionPackageV2RequestOrBuilder
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

            @Override // plugin.actions.Plugin.GetAndroidActionPackageV2RequestOrBuilder
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
                this.name_ = GetAndroidActionPackageV2Request.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value != null) {
                    GetAndroidActionPackageV2Request.checkByteStringIsUtf8(value);
                    this.name_ = value;
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

        public static GetAndroidActionPackageV2Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<GetAndroidActionPackageV2Request> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetAndroidActionPackageV2Request> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetAndroidActionPackageV2Request getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$DeleteAndroidActionPackageRequest.class */
    public static final class DeleteAndroidActionPackageRequest extends GeneratedMessageV3 implements DeleteAndroidActionPackageRequestOrBuilder {
        private static final long serialVersionUID = 0;
        public static final int NAME_FIELD_NUMBER = 1;
        private volatile Object name_;
        private byte memoizedIsInitialized;
        private static final DeleteAndroidActionPackageRequest DEFAULT_INSTANCE = new DeleteAndroidActionPackageRequest();
        private static final Parser<DeleteAndroidActionPackageRequest> PARSER = new AbstractParser<DeleteAndroidActionPackageRequest>() { // from class: plugin.actions.Plugin.DeleteAndroidActionPackageRequest.1
            @Override // com.google.protobuf.Parser
            public DeleteAndroidActionPackageRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new DeleteAndroidActionPackageRequest(input, extensionRegistry);
            }
        };

        private DeleteAndroidActionPackageRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private DeleteAndroidActionPackageRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DeleteAndroidActionPackageRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        }
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
            return Plugin.internal_static_plugin_actions_DeleteAndroidActionPackageRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_DeleteAndroidActionPackageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteAndroidActionPackageRequest.class, Builder.class);
        }

        @Override // plugin.actions.Plugin.DeleteAndroidActionPackageRequestOrBuilder
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

        @Override // plugin.actions.Plugin.DeleteAndroidActionPackageRequestOrBuilder
        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
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
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.name_);
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
            if (!getNameBytes().isEmpty()) {
                size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
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
            if (!(obj instanceof DeleteAndroidActionPackageRequest)) {
                return super.equals(obj);
            }
            DeleteAndroidActionPackageRequest other = (DeleteAndroidActionPackageRequest) obj;
            boolean result = 1 != 0 && getName().equals(other.getName());
            boolean result2 = result && this.unknownFields.equals(other.unknownFields);
            return result2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            int hash2 = (29 * ((53 * ((37 * hash) + 1)) + getName().hashCode())) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static DeleteAndroidActionPackageRequest parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(InputStream input) throws IOException {
            return (DeleteAndroidActionPackageRequest) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DeleteAndroidActionPackageRequest) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static DeleteAndroidActionPackageRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (DeleteAndroidActionPackageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static DeleteAndroidActionPackageRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DeleteAndroidActionPackageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(CodedInputStream input) throws IOException {
            return (DeleteAndroidActionPackageRequest) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static DeleteAndroidActionPackageRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DeleteAndroidActionPackageRequest) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DeleteAndroidActionPackageRequest prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$DeleteAndroidActionPackageRequest$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeleteAndroidActionPackageRequestOrBuilder {
            private Object name_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_DeleteAndroidActionPackageRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_DeleteAndroidActionPackageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeleteAndroidActionPackageRequest.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (DeleteAndroidActionPackageRequest.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.name_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_DeleteAndroidActionPackageRequest_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeleteAndroidActionPackageRequest getDefaultInstanceForType() {
                return DeleteAndroidActionPackageRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteAndroidActionPackageRequest build() {
                DeleteAndroidActionPackageRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeleteAndroidActionPackageRequest buildPartial() {
                DeleteAndroidActionPackageRequest result = new DeleteAndroidActionPackageRequest(this);
                result.name_ = this.name_;
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
                if (other instanceof DeleteAndroidActionPackageRequest) {
                    return mergeFrom((DeleteAndroidActionPackageRequest) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(DeleteAndroidActionPackageRequest other) {
                if (other == DeleteAndroidActionPackageRequest.getDefaultInstance()) {
                    return this;
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
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
                DeleteAndroidActionPackageRequest parsedMessage = null;
                try {
                    try {
                        parsedMessage = (DeleteAndroidActionPackageRequest) DeleteAndroidActionPackageRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (DeleteAndroidActionPackageRequest) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            @Override // plugin.actions.Plugin.DeleteAndroidActionPackageRequestOrBuilder
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

            @Override // plugin.actions.Plugin.DeleteAndroidActionPackageRequestOrBuilder
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
                this.name_ = DeleteAndroidActionPackageRequest.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value != null) {
                    DeleteAndroidActionPackageRequest.checkByteStringIsUtf8(value);
                    this.name_ = value;
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

        public static DeleteAndroidActionPackageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DeleteAndroidActionPackageRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeleteAndroidActionPackageRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeleteAndroidActionPackageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$LogAndroidActionPackageDevelopmentEventRequest.class */
    public static final class LogAndroidActionPackageDevelopmentEventRequest extends GeneratedMessageV3 implements LogAndroidActionPackageDevelopmentEventRequestOrBuilder {
        private static final long serialVersionUID = 0;
        public static final int NAME_FIELD_NUMBER = 1;
        private volatile Object name_;
        public static final int IS_INTERNAL_USER_FIELD_NUMBER = 2;
        private boolean isInternalUser_;
        public static final int CLIENT_EVENT_TYPE_FIELD_NUMBER = 3;
        private int clientEventType_;
        private byte memoizedIsInitialized;
        private static final LogAndroidActionPackageDevelopmentEventRequest DEFAULT_INSTANCE = new LogAndroidActionPackageDevelopmentEventRequest();
        private static final Parser<LogAndroidActionPackageDevelopmentEventRequest> PARSER = new AbstractParser<LogAndroidActionPackageDevelopmentEventRequest>() { // from class: plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequest.1
            @Override // com.google.protobuf.Parser
            public LogAndroidActionPackageDevelopmentEventRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new LogAndroidActionPackageDevelopmentEventRequest(input, extensionRegistry);
            }
        };

        private LogAndroidActionPackageDevelopmentEventRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private LogAndroidActionPackageDevelopmentEventRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.isInternalUser_ = false;
            this.clientEventType_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private LogAndroidActionPackageDevelopmentEventRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.isInternalUser_ = input.readBool();
                                break;
                            case 24:
                                int rawValue = input.readEnum();
                                this.clientEventType_ = rawValue;
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
            return Plugin.internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LogAndroidActionPackageDevelopmentEventRequest.class, Builder.class);
        }

        @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
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

        @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
        public boolean getIsInternalUser() {
            return this.isInternalUser_;
        }

        @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
        public int getClientEventTypeValue() {
            return this.clientEventType_;
        }

        @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
        public DevExMetricsClientEventType.Id getClientEventType() {
            DevExMetricsClientEventType.Id result = DevExMetricsClientEventType.Id.valueOf(this.clientEventType_);
            return result == null ? DevExMetricsClientEventType.Id.UNRECOGNIZED : result;
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
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.name_);
            }
            if (this.isInternalUser_) {
                output.writeBool(2, this.isInternalUser_);
            }
            if (this.clientEventType_ != DevExMetricsClientEventType.Id.ID_UNSPECIFIED.getNumber()) {
                output.writeEnum(3, this.clientEventType_);
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
            if (!getNameBytes().isEmpty()) {
                size2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            }
            if (this.isInternalUser_) {
                size2 += CodedOutputStream.computeBoolSize(2, this.isInternalUser_);
            }
            if (this.clientEventType_ != DevExMetricsClientEventType.Id.ID_UNSPECIFIED.getNumber()) {
                size2 += CodedOutputStream.computeEnumSize(3, this.clientEventType_);
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
            if (!(obj instanceof LogAndroidActionPackageDevelopmentEventRequest)) {
                return super.equals(obj);
            }
            LogAndroidActionPackageDevelopmentEventRequest other = (LogAndroidActionPackageDevelopmentEventRequest) obj;
            boolean result = 1 != 0 && getName().equals(other.getName());
            boolean result2 = result && getIsInternalUser() == other.getIsInternalUser();
            boolean result3 = result2 && this.clientEventType_ == other.clientEventType_;
            boolean result4 = result3 && this.unknownFields.equals(other.unknownFields);
            return result4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (19 * 41) + getDescriptor().hashCode();
            int hash2 = (29 * ((53 * ((37 * ((53 * ((37 * ((53 * ((37 * hash) + 1)) + getName().hashCode())) + 2)) + Internal.hashBoolean(getIsInternalUser()))) + 3)) + this.clientEventType_)) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash2;
            return hash2;
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(InputStream input) throws IOException {
            return (LogAndroidActionPackageDevelopmentEventRequest) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LogAndroidActionPackageDevelopmentEventRequest) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (LogAndroidActionPackageDevelopmentEventRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LogAndroidActionPackageDevelopmentEventRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(CodedInputStream input) throws IOException {
            return (LogAndroidActionPackageDevelopmentEventRequest) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static LogAndroidActionPackageDevelopmentEventRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LogAndroidActionPackageDevelopmentEventRequest) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(LogAndroidActionPackageDevelopmentEventRequest prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$LogAndroidActionPackageDevelopmentEventRequest$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LogAndroidActionPackageDevelopmentEventRequestOrBuilder {
            private Object name_;
            private boolean isInternalUser_;
            private int clientEventType_;

            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(LogAndroidActionPackageDevelopmentEventRequest.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.clientEventType_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.name_ = "";
                this.clientEventType_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (LogAndroidActionPackageDevelopmentEventRequest.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.isInternalUser_ = false;
                this.clientEventType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LogAndroidActionPackageDevelopmentEventRequest getDefaultInstanceForType() {
                return LogAndroidActionPackageDevelopmentEventRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LogAndroidActionPackageDevelopmentEventRequest build() {
                LogAndroidActionPackageDevelopmentEventRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LogAndroidActionPackageDevelopmentEventRequest buildPartial() {
                LogAndroidActionPackageDevelopmentEventRequest result = new LogAndroidActionPackageDevelopmentEventRequest(this);
                result.name_ = this.name_;
                result.isInternalUser_ = this.isInternalUser_;
                result.clientEventType_ = this.clientEventType_;
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
                if (other instanceof LogAndroidActionPackageDevelopmentEventRequest) {
                    return mergeFrom((LogAndroidActionPackageDevelopmentEventRequest) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(LogAndroidActionPackageDevelopmentEventRequest other) {
                if (other == LogAndroidActionPackageDevelopmentEventRequest.getDefaultInstance()) {
                    return this;
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.getIsInternalUser()) {
                    setIsInternalUser(other.getIsInternalUser());
                }
                if (other.clientEventType_ != 0) {
                    setClientEventTypeValue(other.getClientEventTypeValue());
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
                LogAndroidActionPackageDevelopmentEventRequest parsedMessage = null;
                try {
                    try {
                        parsedMessage = (LogAndroidActionPackageDevelopmentEventRequest) LogAndroidActionPackageDevelopmentEventRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (LogAndroidActionPackageDevelopmentEventRequest) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
            }

            @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
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

            @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
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
                this.name_ = LogAndroidActionPackageDevelopmentEventRequest.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value != null) {
                    LogAndroidActionPackageDevelopmentEventRequest.checkByteStringIsUtf8(value);
                    this.name_ = value;
                    onChanged();
                    return this;
                }
                throw new NullPointerException();
            }

            @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
            public boolean getIsInternalUser() {
                return this.isInternalUser_;
            }

            public Builder setIsInternalUser(boolean value) {
                this.isInternalUser_ = value;
                onChanged();
                return this;
            }

            public Builder clearIsInternalUser() {
                this.isInternalUser_ = false;
                onChanged();
                return this;
            }

            @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
            public int getClientEventTypeValue() {
                return this.clientEventType_;
            }

            public Builder setClientEventTypeValue(int value) {
                this.clientEventType_ = value;
                onChanged();
                return this;
            }

            @Override // plugin.actions.Plugin.LogAndroidActionPackageDevelopmentEventRequestOrBuilder
            public DevExMetricsClientEventType.Id getClientEventType() {
                DevExMetricsClientEventType.Id result = DevExMetricsClientEventType.Id.valueOf(this.clientEventType_);
                return result == null ? DevExMetricsClientEventType.Id.UNRECOGNIZED : result;
            }

            public Builder setClientEventType(DevExMetricsClientEventType.Id value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.clientEventType_ = value.getNumber();
                onChanged();
                return this;
            }

            public Builder clearClientEventType() {
                this.clientEventType_ = 0;
                onChanged();
                return this;
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

        public static LogAndroidActionPackageDevelopmentEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LogAndroidActionPackageDevelopmentEventRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LogAndroidActionPackageDevelopmentEventRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LogAndroidActionPackageDevelopmentEventRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$DevExMetricsClientEventType.class */
    public static final class DevExMetricsClientEventType extends GeneratedMessageV3 implements DevExMetricsClientEventTypeOrBuilder {
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final DevExMetricsClientEventType DEFAULT_INSTANCE = new DevExMetricsClientEventType();
        private static final Parser<DevExMetricsClientEventType> PARSER = new AbstractParser<DevExMetricsClientEventType>() { // from class: plugin.actions.Plugin.DevExMetricsClientEventType.1
            @Override // com.google.protobuf.Parser
            public DevExMetricsClientEventType parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new DevExMetricsClientEventType(input, extensionRegistry);
            }
        };

        private DevExMetricsClientEventType(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private DevExMetricsClientEventType() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DevExMetricsClientEventType(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return Plugin.internal_static_plugin_actions_DevExMetricsClientEventType_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_DevExMetricsClientEventType_fieldAccessorTable.ensureFieldAccessorsInitialized(DevExMetricsClientEventType.class, Builder.class);
        }

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$DevExMetricsClientEventType$Id.class */
        public enum Id implements ProtocolMessageEnum {
            ID_UNSPECIFIED(0),
            SHORTCUTS_DEVELOPER_EDIT(1),
            UNRECOGNIZED(-1);
            
            public static final int ID_UNSPECIFIED_VALUE = 0;
            public static final int SHORTCUTS_DEVELOPER_EDIT_VALUE = 1;
            private static final Internal.EnumLiteMap<Id> internalValueMap = new Internal.EnumLiteMap<Id>() { // from class: plugin.actions.Plugin.DevExMetricsClientEventType.Id.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Id findValueByNumber(int number) {
                    return Id.forNumber(number);
                }
            };
            private static final Id[] VALUES = values();
            private final int value;

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }

            @Deprecated
            public static Id valueOf(int value) {
                return forNumber(value);
            }

            public static Id forNumber(int value) {
                switch (value) {
                    case 0:
                        return ID_UNSPECIFIED;
                    case 1:
                        return SHORTCUTS_DEVELOPER_EDIT;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Id> internalGetValueMap() {
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
                return DevExMetricsClientEventType.getDescriptor().getEnumTypes().get(0);
            }

            public static Id valueOf(Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            Id(int value) {
                this.value = value;
            }
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
            this.unknownFields.writeTo(output);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size2;
            return size2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DevExMetricsClientEventType)) {
                return super.equals(obj);
            }
            DevExMetricsClientEventType other = (DevExMetricsClientEventType) obj;
            boolean result = 1 != 0 && this.unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (29 * ((19 * 41) + getDescriptor().hashCode())) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
        }

        public static DevExMetricsClientEventType parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DevExMetricsClientEventType parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DevExMetricsClientEventType parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DevExMetricsClientEventType parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DevExMetricsClientEventType parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DevExMetricsClientEventType parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DevExMetricsClientEventType parseFrom(InputStream input) throws IOException {
            return (DevExMetricsClientEventType) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static DevExMetricsClientEventType parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DevExMetricsClientEventType) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static DevExMetricsClientEventType parseDelimitedFrom(InputStream input) throws IOException {
            return (DevExMetricsClientEventType) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static DevExMetricsClientEventType parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DevExMetricsClientEventType) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static DevExMetricsClientEventType parseFrom(CodedInputStream input) throws IOException {
            return (DevExMetricsClientEventType) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static DevExMetricsClientEventType parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DevExMetricsClientEventType) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DevExMetricsClientEventType prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$DevExMetricsClientEventType$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DevExMetricsClientEventTypeOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_DevExMetricsClientEventType_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_DevExMetricsClientEventType_fieldAccessorTable.ensureFieldAccessorsInitialized(DevExMetricsClientEventType.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (DevExMetricsClientEventType.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_DevExMetricsClientEventType_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DevExMetricsClientEventType getDefaultInstanceForType() {
                return DevExMetricsClientEventType.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevExMetricsClientEventType build() {
                DevExMetricsClientEventType result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevExMetricsClientEventType buildPartial() {
                DevExMetricsClientEventType result = new DevExMetricsClientEventType(this);
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
                if (other instanceof DevExMetricsClientEventType) {
                    return mergeFrom((DevExMetricsClientEventType) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(DevExMetricsClientEventType other) {
                if (other == DevExMetricsClientEventType.getDefaultInstance()) {
                    return this;
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
                DevExMetricsClientEventType parsedMessage = null;
                try {
                    try {
                        parsedMessage = (DevExMetricsClientEventType) DevExMetricsClientEventType.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (DevExMetricsClientEventType) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
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

        public static DevExMetricsClientEventType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DevExMetricsClientEventType> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DevExMetricsClientEventType> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DevExMetricsClientEventType getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AcceptAssistantPluginToSRequest.class */
    public static final class AcceptAssistantPluginToSRequest extends GeneratedMessageV3 implements AcceptAssistantPluginToSRequestOrBuilder {
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final AcceptAssistantPluginToSRequest DEFAULT_INSTANCE = new AcceptAssistantPluginToSRequest();
        private static final Parser<AcceptAssistantPluginToSRequest> PARSER = new AbstractParser<AcceptAssistantPluginToSRequest>() { // from class: plugin.actions.Plugin.AcceptAssistantPluginToSRequest.1
            @Override // com.google.protobuf.Parser
            public AcceptAssistantPluginToSRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new AcceptAssistantPluginToSRequest(input, extensionRegistry);
            }
        };

        private AcceptAssistantPluginToSRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private AcceptAssistantPluginToSRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AcceptAssistantPluginToSRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AcceptAssistantPluginToSRequest.class, Builder.class);
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
            this.unknownFields.writeTo(output);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size2;
            return size2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AcceptAssistantPluginToSRequest)) {
                return super.equals(obj);
            }
            AcceptAssistantPluginToSRequest other = (AcceptAssistantPluginToSRequest) obj;
            boolean result = 1 != 0 && this.unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (29 * ((19 * 41) + getDescriptor().hashCode())) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
        }

        public static AcceptAssistantPluginToSRequest parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(InputStream input) throws IOException {
            return (AcceptAssistantPluginToSRequest) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AcceptAssistantPluginToSRequest) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AcceptAssistantPluginToSRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (AcceptAssistantPluginToSRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AcceptAssistantPluginToSRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AcceptAssistantPluginToSRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(CodedInputStream input) throws IOException {
            return (AcceptAssistantPluginToSRequest) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AcceptAssistantPluginToSRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AcceptAssistantPluginToSRequest) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AcceptAssistantPluginToSRequest prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AcceptAssistantPluginToSRequest$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AcceptAssistantPluginToSRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AcceptAssistantPluginToSRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (AcceptAssistantPluginToSRequest.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSRequest_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AcceptAssistantPluginToSRequest getDefaultInstanceForType() {
                return AcceptAssistantPluginToSRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AcceptAssistantPluginToSRequest build() {
                AcceptAssistantPluginToSRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AcceptAssistantPluginToSRequest buildPartial() {
                AcceptAssistantPluginToSRequest result = new AcceptAssistantPluginToSRequest(this);
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
                if (other instanceof AcceptAssistantPluginToSRequest) {
                    return mergeFrom((AcceptAssistantPluginToSRequest) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(AcceptAssistantPluginToSRequest other) {
                if (other == AcceptAssistantPluginToSRequest.getDefaultInstance()) {
                    return this;
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
                AcceptAssistantPluginToSRequest parsedMessage = null;
                try {
                    try {
                        parsedMessage = (AcceptAssistantPluginToSRequest) AcceptAssistantPluginToSRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (AcceptAssistantPluginToSRequest) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
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

        public static AcceptAssistantPluginToSRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AcceptAssistantPluginToSRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AcceptAssistantPluginToSRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AcceptAssistantPluginToSRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AcceptAssistantPluginToSResponse.class */
    public static final class AcceptAssistantPluginToSResponse extends GeneratedMessageV3 implements AcceptAssistantPluginToSResponseOrBuilder {
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final AcceptAssistantPluginToSResponse DEFAULT_INSTANCE = new AcceptAssistantPluginToSResponse();
        private static final Parser<AcceptAssistantPluginToSResponse> PARSER = new AbstractParser<AcceptAssistantPluginToSResponse>() { // from class: plugin.actions.Plugin.AcceptAssistantPluginToSResponse.1
            @Override // com.google.protobuf.Parser
            public AcceptAssistantPluginToSResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new AcceptAssistantPluginToSResponse(input, extensionRegistry);
            }
        };

        private AcceptAssistantPluginToSResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private AcceptAssistantPluginToSResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AcceptAssistantPluginToSResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AcceptAssistantPluginToSResponse.class, Builder.class);
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
            this.unknownFields.writeTo(output);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            int size2 = 0 + this.unknownFields.getSerializedSize();
            this.memoizedSize = size2;
            return size2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AcceptAssistantPluginToSResponse)) {
                return super.equals(obj);
            }
            AcceptAssistantPluginToSResponse other = (AcceptAssistantPluginToSResponse) obj;
            boolean result = 1 != 0 && this.unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = (29 * ((19 * 41) + getDescriptor().hashCode())) + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
        }

        public static AcceptAssistantPluginToSResponse parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(InputStream input) throws IOException {
            return (AcceptAssistantPluginToSResponse) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AcceptAssistantPluginToSResponse) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static AcceptAssistantPluginToSResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (AcceptAssistantPluginToSResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static AcceptAssistantPluginToSResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AcceptAssistantPluginToSResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(CodedInputStream input) throws IOException {
            return (AcceptAssistantPluginToSResponse) GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static AcceptAssistantPluginToSResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AcceptAssistantPluginToSResponse) GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AcceptAssistantPluginToSResponse prototype) {
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

        /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:plugin/actions/Plugin$AcceptAssistantPluginToSResponse$Builder.class */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AcceptAssistantPluginToSResponseOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AcceptAssistantPluginToSResponse.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (AcceptAssistantPluginToSResponse.alwaysUseFieldBuilders) {
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Plugin.internal_static_plugin_actions_AcceptAssistantPluginToSResponse_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AcceptAssistantPluginToSResponse getDefaultInstanceForType() {
                return AcceptAssistantPluginToSResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AcceptAssistantPluginToSResponse build() {
                AcceptAssistantPluginToSResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException((Message) result);
                }
                return result;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AcceptAssistantPluginToSResponse buildPartial() {
                AcceptAssistantPluginToSResponse result = new AcceptAssistantPluginToSResponse(this);
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
                if (other instanceof AcceptAssistantPluginToSResponse) {
                    return mergeFrom((AcceptAssistantPluginToSResponse) other);
                }
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(AcceptAssistantPluginToSResponse other) {
                if (other == AcceptAssistantPluginToSResponse.getDefaultInstance()) {
                    return this;
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
                AcceptAssistantPluginToSResponse parsedMessage = null;
                try {
                    try {
                        parsedMessage = (AcceptAssistantPluginToSResponse) AcceptAssistantPluginToSResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        parsedMessage = (AcceptAssistantPluginToSResponse) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                    throw th;
                }
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

        public static AcceptAssistantPluginToSResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AcceptAssistantPluginToSResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AcceptAssistantPluginToSResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AcceptAssistantPluginToSResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static String[] descriptorData = {"\n\fplugin.proto\u0012\u000eplugin.actions\u001a\u001cgoogle/protobuf/struct.proto\":\n\u000fPreviewSettings\u0012\u0017\n\u000finvocation_name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006locale\u0018\u0002 \u0001(\t\"÷\u0004\n\u000fValidationError\u0012:\n\bseverity\u0018\u0001 \u0001(\u000e2(.plugin.actions.ValidationError.Severity\u00122\n\u0004type\u0018\u0002 \u0001(\u000e2$.plugin.actions.ValidationError.Type\u0012\r\n\u0005paths\u0018\u0003 \u0003(\t\u0012\u0015\n\rerror_message\u0018\u0004 \u0001(\t\"T\n\bSeverity\u0012\u0018\n\u0014SEVERITY_UNSPECIFIED\u0010\u0000\u0012\b\n\u0004INFO\u0010\u0001\u0012\u000b\n\u0007WARNING\u0010\u0002\u0012\t\n\u0005ERROR\u0010\u0003\u0012\f\n\bCRITICAL\u0010\u0004\"÷\u0002\n\u0004Type\u0012\u0014\n\u0010TYPE_UNSPECIFIED\u0010\u0000\u0012\u0014\n\u0010DUPLICATE_ENTITY\u0010\u0001\u0012\u0017\n\u0013INVALID_ENTITY_NAME\u0010\u0002\u0012\u0018\n\u0014INVALID_ENTITY_VALUE\u0010\u0003\u0012\u001a\n\u0016INVALID_PARAMETER_NAME\u0010\u0004\u0012\u001b\n\u0017INVALID_PARAMETER_VALUE\u0010\u0005\u0012\u001a\n\u0016INVALID_PARAMETER_TYPE\u0010\u0006\u0012\u001f\n\u001bINCONSISTENT_PARAMETER_TYPE\u0010\u0007\u0012\u001b\n\u0017INVALID_TRAINING_PHRASE\u0010\b\u0012\u001c\n\u0018SIMILAR_TRAINING_PHRASES\u0010\t\u0012\u0016\n\u0012INVALID_ANNOTATION\u0010\n\u0012\u0010\n\fEMPTY_INTENT\u0010\u000b\u0012\u0013\n\u000fSIMILAR_INTENTS\u0010\f\u0012 \n\u001cTOO_MANY_ML_DISABLED_INTENTS\u0010\r\"N\n\u0010ValidationResult\u0012:\n\u0011validation_errors\u0018\u0001 \u0003(\u000b2\u001f.plugin.actions.ValidationError\"£\u0005\n#UpdateAndroidActionPackageV2Request\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014actions_xml_contents\u0018\u0002 \u0001(\f\u0012\\\n\u0010xml_content_type\u0018\u0005 \u0001(\u000e2B.plugin.actions.UpdateAndroidActionPackageV2Request.XmlContentType\u00129\n\u0010preview_settings\u0018\u0003 \u0001(\u000b2\u001f.plugin.actions.PreviewSettings\u0012b\n\u0013localized_resources\u0018\u0004 \u0003(\u000b2E.plugin.actions.UpdateAndroidActionPackageV2Request.LocalizedResource\u001a\u0082\u0002\n\u0011LocalizedResource\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012i\n\rresource_type\u0018\u0002 \u0001(\u000e2R.plugin.actions.UpdateAndroidActionPackageV2Request.LocalizedResource.ResourceType\u0012\u000e\n\u0006locale\u0018\u0003 \u0001(\t\u0012%\n\u0005value\u0018\u0004 \u0001(\u000b2\u0016.google.protobuf.Value\"=\n\fResourceType\u0012\u000f\n\u000bUNSPECIFIED\u0010\u0000\u0012\n\n\u0006STRING\u0010\u0001\u0012\u0010\n\fSTRING_ARRAY\u0010\u0002\"N\n\u000eXmlContentType\u0012 \n\u001cXML_CONTENT_TYPE_UNSPECIFIED\u0010\u0000\u0012\u000b\n\u0007ACTIONS\u0010\u0001\u0012\r\n\tSHORTCUTS\u0010\u0002\"\u0090\u0005\n\u001cAndroidActionPackageResponse\u0012\u0016\n\u000eassistant_link\u0018\u0001 \u0001(\t\u0012W\n\u0011supported_intents\u0018\u0002 \u0003(\u000b2<.plugin.actions.AndroidActionPackageResponse.SupportedIntent\u00129\n\u0010preview_settings\u0018\u0003 \u0001(\u000b2\u001f.plugin.actions.PreviewSettings\u0012<\n\u0012validation_results\u0018\u0004 \u0003(\u000b2 .plugin.actions.ValidationResult\u001a\u0085\u0003\n\u000fSupportedIntent\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012m\n\u0014supported_parameters\u0018\u0002 \u0003(\u000b2O.plugin.actions.AndroidActionPackageResponse.SupportedIntent.SupportedParameter\u0012\u007f\n\u001dsupported_intent_capabilities\u0018\u0003 \u0001(\u000b2X.plugin.actions.AndroidActionPackageResponse.SupportedIntent.SupportedIntentCapabilities\u001a:\n\u0012SupportedParameter\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0016\n\u000eexample_values\u0018\u0002 \u0003(\t\u001a8\n\u001bSupportedIntentCapabilities\u0012\u0019\n\u0011has_web_inventory\u0018\u0001 \u0001(\b\"0\n GetAndroidActionPackageV2Request\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"1\n!DeleteAndroidActionPackageRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"£\u0001\n.LogAndroidActionPackageDevelopmentEventRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010is_internal_user\u0018\u0002 \u0001(\b\u0012I\n\u0011client_event_type\u0018\u0003 \u0001(\u000e2..plugin.actions.DevExMetricsClientEventType.Id\"U\n\u001bDevExMetricsClientEventType\"6\n\u0002Id\u0012\u0012\n\u000eID_UNSPECIFIED\u0010\u0000\u0012\u001c\n\u0018SHORTCUTS_DEVELOPER_EDIT\u0010\u0001\"!\n\u001fAcceptAssistantPluginToSRequest\"\"\n AcceptAssistantPluginToSResponseB\u0010\n\u000eplugin.actionsb\u0006proto3"};
//    static String[] descriptorData = {"\n\fplugin.proto\u0012\u000eplugin.actions\u001a\u001cgoogle/protobuf/struct.proto\":\n\u000fPreviewSettings\u0012\u0017\n\u000finvocation_name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006locale\u0018\u0002 \u0001(\t\"÷\u0004\n\u000fValidationError\u0012:\n\bseverity\u0018\u0001 \u0001(\u000e2(.plugin.actions.ValidationError.Severity\u00122\n\u0004type\u0018\u0002 \u0001(\u000e2$.plugin.actions.ValidationError.Type\u0012\r\n\u0005paths\u0018\u0003 \u0003(\t\u0012\u0015\n\rerror_message\u0018\u0004 \u0001(\t\"T\n\bSeverity\u0012\u0018\n\u0014SEVERITY_UNSPECIFIED\u0010��\u0012\b\n\u0004INFO\u0010\u0001\u0012\u000b\n\u0007WARNING\u0010\u0002\u0012\t\n\u0005ERROR\u0010\u0003\u0012\f\n\bCRITICAL\u0010\u0004\"÷\u0002\n\u0004Type\u0012\u0014\n\u0010TYPE_UNSPECIFIED\u0010��\u0012\u0014\n\u0010DUPLICATE_ENTITY\u0010\u0001\u0012\u0017\n\u0013INVALID_ENTITY_NAME\u0010\u0002\u0012\u0018\n\u0014INVALID_ENTITY_VALUE\u0010\u0003\u0012\u001a\n\u0016INVALID_PARAMETER_NAME\u0010\u0004\u0012\u001b\n\u0017INVALID_PARAMETER_VALUE\u0010\u0005\u0012\u001a\n\u0016INVALID_PARAMETER_TYPE\u0010\u0006\u0012\u001f\n\u001bINCONSISTENT_PARAMETER_TYPE\u0010\u0007\u0012\u001b\n\u0017INVALID_TRAINING_PHRASE\u0010\b\u0012\u001c\n\u0018SIMILAR_TRAINING_PHRASES\u0010\t\u0012\u0016\n\u0012INVALID_ANNOTATION\u0010\n\u0012\u0010\n\fEMPTY_INTENT\u0010\u000b\u0012\u0013\n\u000fSIMILAR_INTENTS\u0010\f\u0012 \n\u001cTOO_MANY_ML_DISABLED_INTENTS\u0010\r\"N\n\u0010ValidationResult\u0012:\n\u0011validation_errors\u0018\u0001 \u0003(\u000b2\u001f.plugin.actions.ValidationError\"£\u0005\n#UpdateAndroidActionPackageV2Request\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014actions_xml_contents\u0018\u0002 \u0001(\f\u0012\\\n\u0010xml_content_type\u0018\u0005 \u0001(\u000e2B.plugin.actions.UpdateAndroidActionPackageV2Request.XmlContentType\u00129\n\u0010preview_settings\u0018\u0003 \u0001(\u000b2\u001f.plugin.actions.PreviewSettings\u0012b\n\u0013localized_resources\u0018\u0004 \u0003(\u000b2E.plugin.actions.UpdateAndroidActionPackageV2Request.LocalizedResource\u001a\u0082\u0002\n\u0011LocalizedResource\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012i\n\rresource_type\u0018\u0002 \u0001(\u000e2R.plugin.actions.UpdateAndroidActionPackageV2Request.LocalizedResource.ResourceType\u0012\u000e\n\u0006locale\u0018\u0003 \u0001(\t\u0012%\n\u0005value\u0018\u0004 \u0001(\u000b2\u0016.google.protobuf.Value\"=\n\fResourceType\u0012\u000f\n\u000bUNSPECIFIED\u0010��\u0012\n\n\u0006STRING\u0010\u0001\u0012\u0010\n\fSTRING_ARRAY\u0010\u0002\"N\n\u000eXmlContentType\u0012 \n\u001cXML_CONTENT_TYPE_UNSPECIFIED\u0010��\u0012\u000b\n\u0007ACTIONS\u0010\u0001\u0012\r\n\tSHORTCUTS\u0010\u0002\"\u0090\u0005\n\u001cAndroidActionPackageResponse\u0012\u0016\n\u000eassistant_link\u0018\u0001 \u0001(\t\u0012W\n\u0011supported_intents\u0018\u0002 \u0003(\u000b2<.plugin.actions.AndroidActionPackageResponse.SupportedIntent\u00129\n\u0010preview_settings\u0018\u0003 \u0001(\u000b2\u001f.plugin.actions.PreviewSettings\u0012<\n\u0012validation_results\u0018\u0004 \u0003(\u000b2 .plugin.actions.ValidationResult\u001a\u0085\u0003\n\u000fSupportedIntent\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012m\n\u0014supported_parameters\u0018\u0002 \u0003(\u000b2O.plugin.actions.AndroidActionPackageResponse.SupportedIntent.SupportedParameter\u0012\u007f\n\u001dsupported_intent_capabilities\u0018\u0003 \u0001(\u000b2X.plugin.actions.AndroidActionPackageResponse.SupportedIntent.SupportedIntentCapabilities\u001a:\n\u0012SupportedParameter\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0016\n\u000eexample_values\u0018\u0002 \u0003(\t\u001a8\n\u001bSupportedIntentCapabilities\u0012\u0019\n\u0011has_web_inventory\u0018\u0001 \u0001(\b\"0\n GetAndroidActionPackageV2Request\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"1\n!DeleteAndroidActionPackageRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\"£\u0001\n.LogAndroidActionPackageDevelopmentEventRequest\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010is_internal_user\u0018\u0002 \u0001(\b\u0012I\n\u0011client_event_type\u0018\u0003 \u0001(\u000e2..plugin.actions.DevExMetricsClientEventType.Id\"U\n\u001bDevExMetricsClientEventType\"6\n\u0002Id\u0012\u0012\n\u000eID_UNSPECIFIED\u0010��\u0012\u001c\n\u0018SHORTCUTS_DEVELOPER_EDIT\u0010\u0001\"!\n\u001fAcceptAssistantPluginToSRequest\"\"\n AcceptAssistantPluginToSResponseB\u0010\n\u000eplugin.actionsb\u0006proto3"};
    // from class: plugin.actions.Plugin.1
// com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
    static Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = root -> {
        Plugin.descriptor = root;
        return null;
    };
    
    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{StructProto.getDescriptor()}, assigner);
        internal_static_plugin_actions_PreviewSettings_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_plugin_actions_PreviewSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_PreviewSettings_descriptor, new String[]{"InvocationName", "Locale"});
        internal_static_plugin_actions_ValidationError_descriptor = getDescriptor().getMessageTypes().get(1);
        internal_static_plugin_actions_ValidationError_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_ValidationError_descriptor, new String[]{"Severity", "Type", "Paths", "ErrorMessage"});
        internal_static_plugin_actions_ValidationResult_descriptor = getDescriptor().getMessageTypes().get(2);
        internal_static_plugin_actions_ValidationResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_ValidationResult_descriptor, new String[]{"ValidationErrors"});
        internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_descriptor = getDescriptor().getMessageTypes().get(3);
        internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_descriptor, new String[]{"Name", "ActionsXmlContents", "XmlContentType", "PreviewSettings", "LocalizedResources"});
        internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_descriptor = internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_descriptor.getNestedTypes().get(0);
        internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_UpdateAndroidActionPackageV2Request_LocalizedResource_descriptor, new String[]{"Name", "ResourceType", "Locale", "Value"});
        internal_static_plugin_actions_AndroidActionPackageResponse_descriptor = getDescriptor().getMessageTypes().get(4);
        internal_static_plugin_actions_AndroidActionPackageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_AndroidActionPackageResponse_descriptor, new String[]{"AssistantLink", "SupportedIntents", "PreviewSettings", "ValidationResults"});
        internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor = internal_static_plugin_actions_AndroidActionPackageResponse_descriptor.getNestedTypes().get(0);
        internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor, new String[]{"Name", "SupportedParameters", "SupportedIntentCapabilities"});
        internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_descriptor = internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor.getNestedTypes().get(0);
        internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedParameter_descriptor, new String[]{"Name", "ExampleValues"});
        internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_descriptor = internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_descriptor.getNestedTypes().get(1);
        internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_AndroidActionPackageResponse_SupportedIntent_SupportedIntentCapabilities_descriptor, new String[]{"HasWebInventory"});
        internal_static_plugin_actions_GetAndroidActionPackageV2Request_descriptor = getDescriptor().getMessageTypes().get(5);
        internal_static_plugin_actions_GetAndroidActionPackageV2Request_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_GetAndroidActionPackageV2Request_descriptor, new String[]{"Name"});
        internal_static_plugin_actions_DeleteAndroidActionPackageRequest_descriptor = getDescriptor().getMessageTypes().get(6);
        internal_static_plugin_actions_DeleteAndroidActionPackageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_DeleteAndroidActionPackageRequest_descriptor, new String[]{"Name"});
        internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_descriptor = getDescriptor().getMessageTypes().get(7);
        internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_LogAndroidActionPackageDevelopmentEventRequest_descriptor, new String[]{"Name", "IsInternalUser", "ClientEventType"});
        internal_static_plugin_actions_DevExMetricsClientEventType_descriptor = getDescriptor().getMessageTypes().get(8);
        internal_static_plugin_actions_DevExMetricsClientEventType_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_DevExMetricsClientEventType_descriptor, new String[0]);
        internal_static_plugin_actions_AcceptAssistantPluginToSRequest_descriptor = getDescriptor().getMessageTypes().get(9);
        internal_static_plugin_actions_AcceptAssistantPluginToSRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_AcceptAssistantPluginToSRequest_descriptor, new String[0]);
        internal_static_plugin_actions_AcceptAssistantPluginToSResponse_descriptor = getDescriptor().getMessageTypes().get(10);
        internal_static_plugin_actions_AcceptAssistantPluginToSResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_plugin_actions_AcceptAssistantPluginToSResponse_descriptor, new String[0]);
        StructProto.getDescriptor();
    }
}
