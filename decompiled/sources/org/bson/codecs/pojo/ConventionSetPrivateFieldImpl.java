package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
final class ConventionSetPrivateFieldImpl implements org.bson.codecs.pojo.Convention {

    /* JADX INFO: renamed from: org.bson.codecs.pojo.ConventionSetPrivateFieldImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class PrivatePropertyAccessor<T> implements org.bson.codecs.pojo.PropertyAccessor<T> {
        private final org.bson.codecs.pojo.PropertyAccessorImpl<T> wrapped;

        private PrivatePropertyAccessor(org.bson.codecs.pojo.PropertyAccessorImpl<T> r7) {
                r6 = this;
                r6.<init>()
                r6.wrapped = r7
                r0 = 1
                org.bson.codecs.pojo.PropertyMetadata r1 = r7.getPropertyMetadata()     // Catch: java.lang.Exception -> L12
                java.lang.reflect.Field r1 = r1.getField()     // Catch: java.lang.Exception -> L12
                r1.setAccessible(r0)     // Catch: java.lang.Exception -> L12
                return
            L12:
                r1 = move-exception
                org.bson.codecs.configuration.CodecConfigurationException r2 = new org.bson.codecs.configuration.CodecConfigurationException
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                org.bson.codecs.pojo.PropertyMetadata r5 = r7.getPropertyMetadata()
                java.lang.String r5 = r5.getName()
                r3[r4] = r5
                org.bson.codecs.pojo.PropertyMetadata r7 = r7.getPropertyMetadata()
                java.lang.String r7 = r7.getDeclaringClassName()
                r3[r0] = r7
                java.lang.String r7 = "Unable to make private field accessible '%s' in %s"
                java.lang.String r7 = java.lang.String.format(r7, r3)
                r2.<init>(r7, r1)
                throw r2
        }

        public /* synthetic */ PrivatePropertyAccessor(org.bson.codecs.pojo.PropertyAccessorImpl r1, org.bson.codecs.pojo.ConventionSetPrivateFieldImpl.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public <S> T get(S r2) {
                r1 = this;
                org.bson.codecs.pojo.PropertyAccessorImpl<T> r0 = r1.wrapped
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // org.bson.codecs.pojo.PropertyAccessor
        public <S> void set(S r4, T r5) {
                r3 = this;
                org.bson.codecs.pojo.PropertyAccessorImpl<T> r0 = r3.wrapped     // Catch: java.lang.Exception -> Le
                org.bson.codecs.pojo.PropertyMetadata r0 = r0.getPropertyMetadata()     // Catch: java.lang.Exception -> Le
                java.lang.reflect.Field r0 = r0.getField()     // Catch: java.lang.Exception -> Le
                r0.set(r4, r5)     // Catch: java.lang.Exception -> Le
                return
            Le:
                r4 = move-exception
                org.bson.codecs.configuration.CodecConfigurationException r5 = new org.bson.codecs.configuration.CodecConfigurationException
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                org.bson.codecs.pojo.PropertyAccessorImpl<T> r2 = r3.wrapped
                org.bson.codecs.pojo.PropertyMetadata r2 = r2.getPropertyMetadata()
                java.lang.String r2 = r2.getName()
                r0[r1] = r2
                r1 = 1
                org.bson.codecs.pojo.PropertyAccessorImpl<T> r2 = r3.wrapped
                org.bson.codecs.pojo.PropertyMetadata r2 = r2.getPropertyMetadata()
                java.lang.String r2 = r2.getDeclaringClassName()
                r0[r1] = r2
                java.lang.String r1 = "Unable to set value for property '%s' in %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r5.<init>(r0, r4)
                throw r5
        }
    }

    public ConventionSetPrivateFieldImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private <T> void setPropertyAccessor(org.bson.codecs.pojo.PropertyModelBuilder<T> r4) {
            r3 = this;
            org.bson.codecs.pojo.ConventionSetPrivateFieldImpl$PrivatePropertyAccessor r0 = new org.bson.codecs.pojo.ConventionSetPrivateFieldImpl$PrivatePropertyAccessor
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
            java.lang.reflect.Field r2 = r1.getField()
            if (r2 == 0) goto L8
            java.lang.reflect.Field r1 = r1.getField()
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPrivate(r1)
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
            java.lang.String r0 = "The SET_PRIVATE_FIELDS_CONVENTION is not compatible with propertyModelBuilder instance that have custom implementations of org.bson.codecs.pojo.PropertyAccessor: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r4.<init>(r0)
            throw r4
        L62:
            return
    }
}
