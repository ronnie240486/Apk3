package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
public final class PojoCodecProvider implements org.bson.codecs.configuration.CodecProvider {
    public static final org.bson.diagnostics.Logger LOGGER = null;
    private final boolean automatic;
    private final java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> classModels;
    private final java.util.List<org.bson.codecs.pojo.Convention> conventions;
    private final org.bson.codecs.pojo.DiscriminatorLookup discriminatorLookup;
    private final java.util.Set<java.lang.String> packages;
    private final java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> propertyCodecProviders;

    /* JADX INFO: renamed from: org.bson.codecs.pojo.PojoCodecProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder {
        private boolean automatic;
        private final java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> classModels;
        private final java.util.List<java.lang.Class<?>> clazzes;
        private java.util.List<org.bson.codecs.pojo.Convention> conventions;
        private final java.util.Set<java.lang.String> packages;
        private final java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> propertyCodecProviders;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.packages = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.classModels = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.clazzes = r0
                r0 = 0
                r1.conventions = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.propertyCodecProviders = r0
                return
        }

        public /* synthetic */ Builder(org.bson.codecs.pojo.PojoCodecProvider.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public org.bson.codecs.pojo.PojoCodecProvider.Builder automatic(boolean r1) {
                r0 = this;
                r0.automatic = r1
                return r0
        }

        public org.bson.codecs.pojo.PojoCodecProvider build() {
                r8 = this;
                java.util.List<org.bson.codecs.pojo.Convention> r0 = r8.conventions
                if (r0 == 0) goto L10
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<org.bson.codecs.pojo.Convention> r1 = r8.conventions
                r0.<init>(r1)
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                goto L11
            L10:
                r0 = 0
            L11:
                r5 = r0
                java.util.List<java.lang.Class<?>> r0 = r8.clazzes
                java.util.Iterator r0 = r0.iterator()
            L18:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3a
                java.lang.Object r1 = r0.next()
                java.lang.Class r1 = (java.lang.Class) r1
                java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> r2 = r8.classModels
                boolean r2 = r2.containsKey(r1)
                if (r2 != 0) goto L18
                r2 = 1
                org.bson.codecs.pojo.ClassModel[] r2 = new org.bson.codecs.pojo.ClassModel[r2]
                r3 = 0
                org.bson.codecs.pojo.ClassModel r1 = org.bson.codecs.pojo.PojoCodecProvider.access$100(r1, r5)
                r2[r3] = r1
                r8.register(r2)
                goto L18
            L3a:
                org.bson.codecs.pojo.PojoCodecProvider r0 = new org.bson.codecs.pojo.PojoCodecProvider
                boolean r2 = r8.automatic
                java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> r3 = r8.classModels
                java.util.Set<java.lang.String> r4 = r8.packages
                java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r6 = r8.propertyCodecProviders
                r7 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        public org.bson.codecs.pojo.PojoCodecProvider.Builder conventions(java.util.List<org.bson.codecs.pojo.Convention> r2) {
                r1 = this;
                java.lang.String r0 = "conventions"
                java.lang.Object r2 = org.bson.assertions.Assertions.notNull(r0, r2)
                java.util.List r2 = (java.util.List) r2
                r1.conventions = r2
                return r1
        }

        public org.bson.codecs.pojo.PojoCodecProvider.Builder register(java.lang.Class<?>... r2) {
                r1 = this;
                java.util.List<java.lang.Class<?>> r0 = r1.clazzes
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.addAll(r2)
                return r1
        }

        public org.bson.codecs.pojo.PojoCodecProvider.Builder register(java.lang.String... r3) {
                r2 = this;
                java.util.Set<java.lang.String> r0 = r2.packages
                java.lang.String r1 = "packageNames"
                java.lang.Object r3 = org.bson.assertions.Assertions.notNull(r1, r3)
                java.lang.Object[] r3 = (java.lang.Object[]) r3
                java.util.List r3 = java.util.Arrays.asList(r3)
                r0.addAll(r3)
                return r2
        }

        public org.bson.codecs.pojo.PojoCodecProvider.Builder register(org.bson.codecs.pojo.ClassModel<?>... r6) {
                r5 = this;
                java.lang.String r0 = "classModels"
                org.bson.assertions.Assertions.notNull(r0, r6)
                int r0 = r6.length
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                r2 = r6[r1]
                java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> r3 = r5.classModels
                java.lang.Class r4 = r2.getType()
                r3.put(r4, r2)
                int r1 = r1 + 1
                goto L7
            L17:
                return r5
        }

        public org.bson.codecs.pojo.PojoCodecProvider.Builder register(org.bson.codecs.pojo.PropertyCodecProvider... r3) {
                r2 = this;
                java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r0 = r2.propertyCodecProviders
                java.lang.String r1 = "providers"
                java.lang.Object r3 = org.bson.assertions.Assertions.notNull(r1, r3)
                java.lang.Object[] r3 = (java.lang.Object[]) r3
                java.util.List r3 = java.util.Arrays.asList(r3)
                r0.addAll(r3)
                return r2
        }
    }

    static {
            java.lang.String r0 = "codecs.pojo"
            org.bson.diagnostics.Logger r0 = org.bson.diagnostics.Loggers.getLogger(r0)
            org.bson.codecs.pojo.PojoCodecProvider.LOGGER = r0
            return
    }

    private PojoCodecProvider(boolean r1, java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> r2, java.util.Set<java.lang.String> r3, java.util.List<org.bson.codecs.pojo.Convention> r4, java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r5) {
            r0 = this;
            r0.<init>()
            r0.automatic = r1
            r0.classModels = r2
            r0.packages = r3
            r0.conventions = r4
            org.bson.codecs.pojo.DiscriminatorLookup r1 = new org.bson.codecs.pojo.DiscriminatorLookup
            r1.<init>(r2, r3)
            r0.discriminatorLookup = r1
            r0.propertyCodecProviders = r5
            return
    }

    public /* synthetic */ PojoCodecProvider(boolean r1, java.util.Map r2, java.util.Set r3, java.util.List r4, java.util.List r5, org.bson.codecs.pojo.PojoCodecProvider.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ org.bson.codecs.pojo.ClassModel access$100(java.lang.Class r0, java.util.List r1) {
            org.bson.codecs.pojo.ClassModel r0 = createClassModel(r0, r1)
            return r0
    }

    public static org.bson.codecs.pojo.PojoCodecProvider.Builder builder() {
            org.bson.codecs.pojo.PojoCodecProvider$Builder r0 = new org.bson.codecs.pojo.PojoCodecProvider$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private static <T> org.bson.codecs.pojo.ClassModel<T> createClassModel(java.lang.Class<T> r0, java.util.List<org.bson.codecs.pojo.Convention> r1) {
            org.bson.codecs.pojo.ClassModelBuilder r0 = org.bson.codecs.pojo.ClassModel.builder(r0)
            if (r1 == 0) goto L9
            r0.conventions(r1)
        L9:
            org.bson.codecs.pojo.ClassModel r0 = r0.build()
            return r0
    }

    private <T> org.bson.codecs.pojo.PojoCodec<T> getPojoCodec(java.lang.Class<T> r7, org.bson.codecs.configuration.CodecRegistry r8) {
            r6 = this;
            java.util.Map<java.lang.Class<?>, org.bson.codecs.pojo.ClassModel<?>> r0 = r6.classModels
            java.lang.Object r0 = r0.get(r7)
            org.bson.codecs.pojo.ClassModel r0 = (org.bson.codecs.pojo.ClassModel) r0
            if (r0 == 0) goto L14
            org.bson.codecs.pojo.PojoCodecImpl r7 = new org.bson.codecs.pojo.PojoCodecImpl
            java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r1 = r6.propertyCodecProviders
            org.bson.codecs.pojo.DiscriminatorLookup r2 = r6.discriminatorLookup
            r7.<init>(r0, r8, r1, r2)
            return r7
        L14:
            boolean r0 = r6.automatic
            r1 = 0
            if (r0 != 0) goto L2f
            java.lang.Package r0 = r7.getPackage()
            if (r0 == 0) goto L46
            java.util.Set<java.lang.String> r0 = r6.packages
            java.lang.Package r2 = r7.getPackage()
            java.lang.String r2 = r2.getName()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L46
        L2f:
            java.util.List<org.bson.codecs.pojo.Convention> r0 = r6.conventions     // Catch: java.lang.Exception -> L5b
            org.bson.codecs.pojo.ClassModel r0 = createClassModel(r7, r0)     // Catch: java.lang.Exception -> L5b
            boolean r2 = r7.isInterface()     // Catch: java.lang.Exception -> L5b
            if (r2 != 0) goto L47
            java.util.List r2 = r0.getPropertyModels()     // Catch: java.lang.Exception -> L5b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Exception -> L5b
            if (r2 != 0) goto L46
            goto L47
        L46:
            return r1
        L47:
            org.bson.codecs.pojo.DiscriminatorLookup r2 = r6.discriminatorLookup     // Catch: java.lang.Exception -> L5b
            r2.addClassModel(r0)     // Catch: java.lang.Exception -> L5b
            org.bson.codecs.pojo.AutomaticPojoCodec r2 = new org.bson.codecs.pojo.AutomaticPojoCodec     // Catch: java.lang.Exception -> L5b
            org.bson.codecs.pojo.PojoCodecImpl r3 = new org.bson.codecs.pojo.PojoCodecImpl     // Catch: java.lang.Exception -> L5b
            java.util.List<org.bson.codecs.pojo.PropertyCodecProvider> r4 = r6.propertyCodecProviders     // Catch: java.lang.Exception -> L5b
            org.bson.codecs.pojo.DiscriminatorLookup r5 = r6.discriminatorLookup     // Catch: java.lang.Exception -> L5b
            r3.<init>(r0, r8, r4, r5)     // Catch: java.lang.Exception -> L5b
            r2.<init>(r3)     // Catch: java.lang.Exception -> L5b
            return r2
        L5b:
            r8 = move-exception
            org.bson.diagnostics.Logger r0 = org.bson.codecs.pojo.PojoCodecProvider.LOGGER
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r7 = r7.getSimpleName()
            r2[r3] = r7
            java.lang.String r7 = "Cannot use '%s' with the PojoCodec."
            java.lang.String r7 = java.lang.String.format(r7, r2)
            r0.warn(r7, r8)
            return r1
    }

    @Override // org.bson.codecs.configuration.CodecProvider
    public <T> org.bson.codecs.Codec<T> get(java.lang.Class<T> r1, org.bson.codecs.configuration.CodecRegistry r2) {
            r0 = this;
            org.bson.codecs.pojo.PojoCodec r1 = r0.getPojoCodec(r1, r2)
            return r1
    }
}
