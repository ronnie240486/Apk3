package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
final class ConventionUseGettersAsSettersImpl implements org.bson.codecs.pojo.Convention {

    /* JADX INFO: renamed from: org.bson.codecs.pojo.ConventionUseGettersAsSettersImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class PrivatePropertyAccessor<T> implements org.bson.codecs.pojo.PropertyAccessor<T> {
        private final org.bson.codecs.pojo.PropertyAccessorImpl<T> wrapped;

        private PrivatePropertyAccessor(org.bson.codecs.pojo.PropertyAccessorImpl<T> r1) {
                r0 = this;
                r0.<init>()
                r0.wrapped = r1
                return
        }

        public /* synthetic */ PrivatePropertyAccessor(org.bson.codecs.pojo.PropertyAccessorImpl r1, org.bson.codecs.pojo.ConventionUseGettersAsSettersImpl.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private <S> void mutateCollection(S r3, java.util.Collection r4) {
                r2 = this;
                java.lang.Object r3 = r2.get(r3)
                java.util.Collection r3 = (java.util.Collection) r3
                r0 = 0
                if (r3 != 0) goto Lf
                java.lang.String r3 = "The getter returned null."
                r2.throwCodecConfigurationException(r3, r0)
                goto L25
            Lf:
                boolean r1 = r3.isEmpty()
                if (r1 != 0) goto L1b
                java.lang.String r3 = "The getter returned a non empty collection."
                r2.throwCodecConfigurationException(r3, r0)
                goto L25
            L1b:
                r3.addAll(r4)     // Catch: java.lang.Exception -> L1f
                goto L25
            L1f:
                r3 = move-exception
                java.lang.String r4 = "collection#addAll failed."
                r2.throwCodecConfigurationException(r4, r3)
            L25:
                return
        }

        private <S> void mutateMap(S r3, java.util.Map r4) {
                r2 = this;
                java.lang.Object r3 = r2.get(r3)
                java.util.Map r3 = (java.util.Map) r3
                r0 = 0
                if (r3 != 0) goto Lf
                java.lang.String r3 = "The getter returned null."
                r2.throwCodecConfigurationException(r3, r0)
                goto L25
            Lf:
                boolean r1 = r3.isEmpty()
                if (r1 != 0) goto L1b
                java.lang.String r3 = "The getter returned a non empty map."
                r2.throwCodecConfigurationException(r3, r0)
                goto L25
            L1b:
                r3.putAll(r4)     // Catch: java.lang.Exception -> L1f
                goto L25
            L1f:
                r3 = move-exception
                java.lang.String r4 = "map#putAll failed."
                r2.throwCodecConfigurationException(r4, r3)
            L25:
                return
        }

        private void throwCodecConfigurationException(java.lang.String r5, java.lang.Exception r6) {
                r4 = this;
                org.bson.codecs.configuration.CodecConfigurationException r0 = new org.bson.codecs.configuration.CodecConfigurationException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                org.bson.codecs.pojo.PropertyAccessorImpl<T> r2 = r4.wrapped
                org.bson.codecs.pojo.PropertyMetadata r2 = r2.getPropertyMetadata()
                java.lang.String r2 = r2.getDeclaringClassName()
                r3 = 0
                r1[r3] = r2
                org.bson.codecs.pojo.PropertyAccessorImpl<T> r2 = r4.wrapped
                org.bson.codecs.pojo.PropertyMetadata r2 = r2.getPropertyMetadata()
                java.lang.String r2 = r2.getName()
                r3 = 1
                r1[r3] = r2
                r2 = 2
                r1[r2] = r5
                java.lang.String r5 = "Cannot use getter in '%s' to set '%s'. %s"
                java.lang.String r5 = java.lang.String.format(r5, r1)
                r0.<init>(r5, r6)
                throw r0
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public <S> T get(S r2) {
                r1 = this;
                org.bson.codecs.pojo.PropertyAccessorImpl<T> r0 = r1.wrapped
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public <S> void set(S r2, T r3) {
                r1 = this;
                boolean r0 = r3 instanceof java.util.Collection
                if (r0 == 0) goto La
                java.util.Collection r3 = (java.util.Collection) r3
                r1.mutateCollection(r2, r3)
                goto L28
            La:
                boolean r0 = r3 instanceof java.util.Map
                if (r0 == 0) goto L14
                java.util.Map r3 = (java.util.Map) r3
                r1.mutateMap(r2, r3)
                goto L28
            L14:
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0 = 0
                java.lang.Class r3 = r3.getClass()
                r2[r0] = r3
                java.lang.String r3 = "Unexpected type: '%s'"
                java.lang.String r2 = java.lang.String.format(r3, r2)
                r3 = 0
                r1.throwCodecConfigurationException(r2, r3)
            L28:
                return
        }
    }

    public ConventionUseGettersAsSettersImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private <T> boolean isMapOrCollection(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L13
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    private <T> void setPropertyAccessor(org.bson.codecs.pojo.PropertyModelBuilder<T> r4) {
            r3 = this;
            org.bson.codecs.pojo.ConventionUseGettersAsSettersImpl$PrivatePropertyAccessor r0 = new org.bson.codecs.pojo.ConventionUseGettersAsSettersImpl$PrivatePropertyAccessor
            org.bson.codecs.pojo.PropertyAccessor r1 = r4.getPropertyAccessor()
            org.bson.codecs.pojo.PropertyAccessorImpl r1 = (org.bson.codecs.pojo.PropertyAccessorImpl) r1
            r2 = 0
            r0.<init>(r1, r2)
            r4.propertyAccessor(r0)
            return
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(org.bson.codecs.pojo.ClassModelBuilder<?> r4) {
            r3 = this;
            java.util.List r4 = r4.getPropertyModelBuilders()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r4.next()
            org.bson.codecs.pojo.PropertyModelBuilder r0 = (org.bson.codecs.pojo.PropertyModelBuilder) r0
            org.bson.codecs.pojo.PropertyAccessor r1 = r0.getPropertyAccessor()
            boolean r1 = r1 instanceof org.bson.codecs.pojo.PropertyAccessorImpl
            if (r1 == 0) goto L44
            org.bson.codecs.pojo.PropertyAccessor r1 = r0.getPropertyAccessor()
            org.bson.codecs.pojo.PropertyAccessorImpl r1 = (org.bson.codecs.pojo.PropertyAccessorImpl) r1
            org.bson.codecs.pojo.PropertyMetadata r1 = r1.getPropertyMetadata()
            boolean r2 = r1.isDeserializable()
            if (r2 != 0) goto L8
            boolean r2 = r1.isSerializable()
            if (r2 == 0) goto L8
            org.bson.codecs.pojo.TypeData r1 = r1.getTypeData()
            java.lang.Class r1 = r1.getType()
            boolean r1 = r3.isMapOrCollection(r1)
            if (r1 == 0) goto L8
            r3.setPropertyAccessor(r0)
            goto L8
        L44:
            org.bson.codecs.configuration.CodecConfigurationException r4 = new org.bson.codecs.configuration.CodecConfigurationException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            org.bson.codecs.pojo.PropertyAccessor r0 = r0.getPropertyAccessor()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1[r2] = r0
            java.lang.String r0 = "The USE_GETTER_AS_SETTER_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r4.<init>(r0)
            throw r4
        L62:
            return
    }
}
