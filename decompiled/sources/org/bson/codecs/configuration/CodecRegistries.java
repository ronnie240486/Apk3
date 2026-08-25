package org.bson.codecs.configuration;

/* JADX INFO: loaded from: classes3.dex */
public final class CodecRegistries {


    private CodecRegistries() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.bson.codecs.configuration.CodecRegistry fromCodecs(java.util.List<? extends org.bson.codecs.Codec<?>> r2) {
            r0 = 1
            org.bson.codecs.configuration.CodecProvider[] r0 = new org.bson.codecs.configuration.CodecProvider[r0]
            org.bson.codecs.configuration.MapOfCodecsProvider r1 = new org.bson.codecs.configuration.MapOfCodecsProvider
            r1.<init>(r2)
            r2 = 0
            r0[r2] = r1
            org.bson.codecs.configuration.CodecRegistry r2 = fromProviders(r0)
            return r2
    }

    public static org.bson.codecs.configuration.CodecRegistry fromCodecs(org.bson.codecs.Codec<?>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.bson.codecs.configuration.CodecRegistry r0 = fromCodecs(r0)
            return r0
    }

    public static org.bson.codecs.configuration.CodecRegistry fromProviders(java.util.List<? extends org.bson.codecs.configuration.CodecProvider> r1) {
            org.bson.internal.ProvidersCodecRegistry r0 = new org.bson.internal.ProvidersCodecRegistry
            r0.<init>(r1)
            return r0
    }

    public static org.bson.codecs.configuration.CodecRegistry fromProviders(org.bson.codecs.configuration.CodecProvider... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.bson.codecs.configuration.CodecRegistry r0 = fromProviders(r0)
            return r0
    }

    public static org.bson.codecs.configuration.CodecRegistry fromRegistries(java.util.List<? extends org.bson.codecs.configuration.CodecRegistry> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            org.bson.codecs.configuration.CodecRegistry r1 = (org.bson.codecs.configuration.CodecRegistry) r1
            org.bson.codecs.configuration.CodecProvider r1 = providerFromRegistry(r1)
            r0.add(r1)
            goto L9
        L1d:
            org.bson.internal.ProvidersCodecRegistry r2 = new org.bson.internal.ProvidersCodecRegistry
            r2.<init>(r0)
            return r2
    }

    public static org.bson.codecs.configuration.CodecRegistry fromRegistries(org.bson.codecs.configuration.CodecRegistry... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.bson.codecs.configuration.CodecRegistry r0 = fromRegistries(r0)
            return r0
    }

    private static org.bson.codecs.configuration.CodecProvider providerFromRegistry(org.bson.codecs.configuration.CodecRegistry r1) {
            boolean r0 = r1 instanceof org.bson.codecs.configuration.CodecProvider
            if (r0 == 0) goto L7
            org.bson.codecs.configuration.CodecProvider r1 = (org.bson.codecs.configuration.CodecProvider) r1
            return r1
        L7:
            org.bson.codecs.configuration.CodecRegistries$1 r0 = new org.bson.codecs.configuration.CodecRegistries$1
            r0.<init>(r1)
            return r0
    }
}
