package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class DiscriminatorLookup {
    private final java.util.Map<java.lang.String, java.lang.Class<?>> discriminatorClassMap;
    private final java.util.Set<java.lang.String> packages;

    public DiscriminatorLookup(java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> r4, java.util.Set<java.lang.String> r5) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.discriminatorClassMap = r0
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r4.next()
            org.bson.codecs.pojo.ClassModel r0 = (org.bson.codecs.pojo.ClassModel) r0
            java.lang.String r1 = r0.getDiscriminator()
            if (r1 == 0) goto L12
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r3.discriminatorClassMap
            java.lang.String r2 = r0.getDiscriminator()
            java.lang.Class r0 = r0.getType()
            r1.put(r2, r0)
            goto L12
        L32:
            r3.packages = r5
            return
    }

    private java.lang.Class<?> getClassForName(java.lang.String r1) {
            r0 = this;
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    private java.lang.Class<?> searchPackages(java.lang.String r4) {
            r3 = this;
            java.util.Set<java.lang.String> r0 = r3.packages
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r4)
            java.lang.Class r1 = r3.getClassForName(r1)
            if (r1 == 0) goto L7
        L1f:
            return r1
    }

    public final void addClassModel(org.bson.codecs.pojo.ClassModel<?> r3) {
            r2 = this;
            java.lang.String r0 = r3.getDiscriminator()
            if (r0 == 0) goto L13
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r2.discriminatorClassMap
            java.lang.String r1 = r3.getDiscriminator()
            java.lang.Class r3 = r3.getType()
            r0.put(r1, r3)
        L13:
            return
    }

    public java.lang.Class<?> lookup(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r3.discriminatorClassMap
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L11
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r3.discriminatorClassMap
            java.lang.Object r4 = r0.get(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L11:
            java.lang.Class r0 = r3.getClassForName(r4)
            if (r0 != 0) goto L1b
            java.lang.Class r0 = r3.searchPackages(r4)
        L1b:
            if (r0 == 0) goto L23
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r3.discriminatorClassMap
            r1.put(r4, r0)
            return r0
        L23:
            org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "A class could not be found for the discriminator: '%s'."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }
}
