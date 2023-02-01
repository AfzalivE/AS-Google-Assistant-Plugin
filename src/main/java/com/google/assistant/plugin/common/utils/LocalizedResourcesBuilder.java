package com.google.assistant.plugin.common.utils;

import actions.UpdateAndroidActionPackageV2Request;
import com.android.ide.common.rendering.api.ArrayResourceValue;
import com.android.ide.common.rendering.api.ResourceNamespace;
import com.android.ide.common.rendering.api.ResourceReference;
import com.android.ide.common.rendering.api.ResourceValue;
import com.android.ide.common.resources.ResourceRepository;
import com.android.ide.common.resources.ResourceRepositoryUtil;
import com.android.ide.common.resources.ResourceResolver;
import com.android.ide.common.resources.configuration.FolderConfiguration;
import com.android.ide.common.resources.configuration.LocaleQualifier;
import com.android.resources.ResourceType;
import com.android.resources.ResourceUrl;
import com.android.tools.idea.res.LocalResourceRepository;
import com.google.assistant.plugin.appactions.exceptions.ResourceResolutionException;
import com.google.common.collect.Table;
import com.google.protobuf.ListValue;
import com.google.protobuf.Value;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collectors;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import actions.Plugin;

/* compiled from: LocalizedResourcesBuilder.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��H\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\"\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018��2\u00020\u0001:\u0001\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¨\u0006\u001b"}, d2 = {"Lcom/google/assistant/plugin/common/utils/LocalizedResourcesBuilder;", "", "()V", "buildLocaleResourceResolverMap", "", "Lcom/android/ide/common/resources/configuration/LocaleQualifier;", "Lcom/android/ide/common/resources/ResourceResolver;", "appResources", "Lcom/android/tools/idea/res/LocalResourceRepository;", "buildLocalizedResourcesListInternal", "", "Lplugin/actions/Plugin$UpdateAndroidActionPackageV2Request$LocalizedResource;", "actionsXmlBytes", "", "resolverMap", "buildLocalizedResourcesSet", "collectResourcesFromActionsXml", "Lcom/android/resources/ResourceUrl;", "resolveArrayResourceFromUrl", "Lcom/google/protobuf/Value;", "resourceUrl", "resolver", "resolveStringResourceFromString", "value", "", "resolveStringResourceFromUrl", "XmlHandler", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/LocalizedResourcesBuilder.class */
public final class LocalizedResourcesBuilder {
    @NotNull
    public static final LocalizedResourcesBuilder INSTANCE = new LocalizedResourcesBuilder();

    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/LocalizedResourcesBuilder$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[ResourceType.values().length];

        {
            $EnumSwitchMapping$0[ResourceType.STRING.ordinal()] = 1;
            $EnumSwitchMapping$0[ResourceType.ARRAY.ordinal()] = 2;
        }
    }
    
    private LocalizedResourcesBuilder() {
    }

    @NotNull
    public final Set<UpdateAndroidActionPackageV2Request.LocalizedResource> buildLocalizedResourcesSet(@NotNull byte[] actionsXmlBytes, @NotNull LocalResourceRepository appResources) throws ParserConfigurationException, SAXException, ResourceResolutionException, IOException {
        Intrinsics.checkNotNullParameter(actionsXmlBytes, "actionsXmlBytes");
        Intrinsics.checkNotNullParameter(appResources, "appResources");
        Map resolverMap = buildLocaleResourceResolverMap(appResources);
        return buildLocalizedResourcesListInternal(actionsXmlBytes, resolverMap);
    }

    @NotNull
    public final Set<UpdateAndroidActionPackageV2Request.LocalizedResource> buildLocalizedResourcesListInternal(@NotNull byte[] actionsXmlBytes, @NotNull Map<LocaleQualifier, ? extends ResourceResolver> map) throws ParserConfigurationException, SAXException, IOException, ResourceResolutionException {
        UpdateAndroidActionPackageV2Request.LocalizedResource.ResourceType resourceType;
        Value resolveArrayResourceFromUrl;
        Intrinsics.checkNotNullParameter(actionsXmlBytes, "actionsXmlBytes");
        Intrinsics.checkNotNullParameter(map, "resolverMap");
        Set localizedResources = new HashSet();
        for (ResourceUrl parse : collectResourcesFromActionsXml(actionsXmlBytes)) {
            for (Map.Entry<LocaleQualifier, ? extends ResourceResolver> entry : map.entrySet()) {
                LocaleQualifier localeQualifier = entry.getKey();
                ResourceResolver resourceResolver = entry.getValue();
                String locale = localeQualifier.hasFakeValue() ? "" : localeQualifier.getTag();
                String resourceName = parse.name;
                ResourceType resourceType2 = parse.type;
                if (resourceType2 != null) {
                    switch (resourceType2) {
                        case STRING:
                            resourceType = UpdateAndroidActionPackageV2Request.LocalizedResource.ResourceType.STRING;
                            resolveArrayResourceFromUrl = resolveStringResourceFromUrl(parse, resourceResolver);
                            Value resourceValue = resolveArrayResourceFromUrl;
                            UpdateAndroidActionPackageV2Request.LocalizedResource build = UpdateAndroidActionPackageV2Request.LocalizedResource.newBuilder().setName(resourceName).setResourceType(resourceType).setLocale(locale).setValue(resourceValue).build();
                            Intrinsics.checkNotNullExpressionValue(build, "LocalizedResource.newBui…                 .build()");
                            localizedResources.add(build);
                            break;
                        case ARRAY:
                            resourceType = UpdateAndroidActionPackageV2Request.LocalizedResource.ResourceType.STRING_ARRAY;
                            resolveArrayResourceFromUrl = resolveArrayResourceFromUrl(parse, resourceResolver);
                            Value resourceValue2 = resolveArrayResourceFromUrl;
                            UpdateAndroidActionPackageV2Request.LocalizedResource build2 = UpdateAndroidActionPackageV2Request.LocalizedResource.newBuilder().setName(resourceName).setResourceType(resourceType).setLocale(locale).setValue(resourceValue2).build();
                            Intrinsics.checkNotNullExpressionValue(build2, "LocalizedResource.newBui…                 .build()");
                            localizedResources.add(build2);
                            break;
                    }
                }
            }
        }
        return localizedResources;
    }

    private final Map<LocaleQualifier, ResourceResolver> buildLocaleResourceResolverMap(LocalResourceRepository appResources) {
        SortedSet locales = ResourceRepositoryUtil.getLocales((ResourceRepository) appResources);
        Set<LocaleQualifier> filteredLocales = (Set) locales.stream().filter(LocalizedResourcesBuilder$buildLocaleResourceResolverMap$filteredLocales$1.INSTANCE).collect(Collectors.toSet());
        Map resolverMap = new HashMap();
        filteredLocales.add(new LocaleQualifier("__"));
        for (LocaleQualifier localeQualifier : filteredLocales) {
            FolderConfiguration configuration = new FolderConfiguration();
            configuration.setLocaleQualifier(localeQualifier);
            Table configuredResources = ResourceRepositoryUtil.getConfiguredResources((ResourceRepository) appResources, configuration);
            Intrinsics.checkNotNullExpressionValue(localeQualifier, "localeQualifier");
            ResourceResolver create = ResourceResolver.create(configuredResources.rowMap(), (ResourceReference) null);
            Intrinsics.checkNotNullExpressionValue(create, "ResourceResolver.create(…Resources.rowMap(), null)");
            resolverMap.put(localeQualifier, create);
        }
        return resolverMap;
    }

    private final Value resolveStringResourceFromString(String value, ResourceResolver resolver) throws ResourceResolutionException {
        ResourceUrl parse = ResourceUrl.parse(value);
        if (parse == null) {
            return Value.newBuilder().setStringValue(value).build();
        }
        if (parse.type == ResourceType.STRING) {
            return resolveStringResourceFromUrl(parse, resolver);
        }
        throw new ResourceResolutionException("Could not resolve " + value);
    }

    private final Value resolveStringResourceFromUrl(ResourceUrl resourceUrl, ResourceResolver resolver) throws ResourceResolutionException {
        ResourceReference resourceReference = new ResourceReference(ResourceNamespace.TODO(), ResourceType.STRING, resourceUrl.name);
        ResourceValue resVal = resolver.getResolvedResource(resourceReference);
        if (resVal != null) {
            Value build = Value.newBuilder().setStringValue(resVal.getValue()).build();
            Intrinsics.checkNotNullExpressionValue(build, "Value.newBuilder().setSt…lue(resVal.value).build()");
            return build;
        }
        throw new ResourceResolutionException("Could not resolve " + resourceUrl.name);
    }

    private final Value resolveArrayResourceFromUrl(ResourceUrl resourceUrl, ResourceResolver resolver) throws ResourceResolutionException {
        ResourceReference resourceReference = new ResourceReference(ResourceNamespace.TODO(), ResourceType.ARRAY, resourceUrl.name);
        ArrayResourceValue arrayResourceValue = (ArrayResourceValue) resolver.getResolvedResource(resourceReference);
        if (arrayResourceValue == null) {
            throw new ResourceResolutionException("Could not resolve " + resourceUrl.name);
        }
        ListValue.Builder listBuilder = ListValue.newBuilder();
        for (String element : arrayResourceValue) {
            Intrinsics.checkNotNullExpressionValue(element, "element");
            listBuilder.addValues(resolveStringResourceFromString(element, resolver));
        }
        Value build = Value.newBuilder().setListValue(listBuilder).build();
        Intrinsics.checkNotNullExpressionValue(build, "Value.newBuilder().setLi…alue(listBuilder).build()");
        return build;
    }

    private final Set<ResourceUrl> collectResourcesFromActionsXml(byte[] actionsXmlBytes) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XmlHandler handler = new XmlHandler();
        saxParser.parse(new ByteArrayInputStream(actionsXmlBytes), handler);
        return handler.getResourceUrlSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalizedResourcesBuilder.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\b\u0002\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n��\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/google/assistant/plugin/common/utils/LocalizedResourcesBuilder$XmlHandler;", "Lorg/xml/sax/helpers/DefaultHandler;", "()V", "resourceUrlSet", "Ljava/util/HashSet;", "Lcom/android/resources/ResourceUrl;", "getResourceUrlSet", "()Ljava/util/HashSet;", "startElement", "", "uri", "", "localName", "qName", "attributes", "Lorg/xml/sax/Attributes;", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/common/utils/LocalizedResourcesBuilder$XmlHandler.class */
    public static final class XmlHandler extends DefaultHandler {
        @NotNull
        private final HashSet<ResourceUrl> resourceUrlSet = new HashSet<>();

        @NotNull
        public final HashSet<ResourceUrl> getResourceUrlSet() {
            return this.resourceUrlSet;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(@NotNull String uri, @NotNull String localName, @NotNull String qName, @NotNull Attributes attributes) throws SAXException {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(localName, "localName");
            Intrinsics.checkNotNullParameter(qName, "qName");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            super.startElement(uri, localName, qName, attributes);
            int length = attributes.getLength();
            for (int i = 0; i < length; i++) {
                ResourceUrl parse = ResourceUrl.parse(attributes.getValue(i));
                if (parse != null) {
                    this.resourceUrlSet.add(parse);
                }
            }
        }
    }
}
