package org.bson.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class CodecRegistryHelper {
    private CodecRegistryHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.bson.codecs.configuration.CodecRegistry createRegistry(org.bson.codecs.configuration.CodecRegistry r1, org.bson.UuidRepresentation r2) {
            org.bson.UuidRepresentation r0 = org.bson.UuidRepresentation.JAVA_LEGACY
            if (r2 == r0) goto L19
            boolean r0 = r1 instanceof org.bson.codecs.configuration.CodecProvider
            if (r0 == 0) goto L11
            org.bson.internal.OverridableUuidRepresentationCodecRegistry r0 = new org.bson.internal.OverridableUuidRepresentationCodecRegistry
            org.bson.codecs.configuration.CodecProvider r1 = (org.bson.codecs.configuration.CodecProvider) r1
            r0.<init>(r1, r2)
            r1 = r0
            goto L19
        L11:
            org.bson.codecs.configuration.CodecConfigurationException r1 = new org.bson.codecs.configuration.CodecConfigurationException
            java.lang.String r2 = "Changing the default UuidRepresentation requires a CodecRegistry that also implements the CodecProvider interface"
            r1.<init>(r2)
            throw r1
        L19:
            return r1
    }
}
