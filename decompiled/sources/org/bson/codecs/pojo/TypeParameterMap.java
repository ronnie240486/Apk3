package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class TypeParameterMap {
    private final java.util.Map<java.lang.Integer, java.lang.Integer> propertyToClassParamIndexMap;

    /* JADX INFO: renamed from: org.bson.codecs.pojo.TypeParameterMap$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final java.util.Map<java.lang.Integer, java.lang.Integer> propertyToClassParamIndexMap;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.propertyToClassParamIndexMap = r0
                return
        }

        public /* synthetic */ Builder(org.bson.codecs.pojo.TypeParameterMap.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.bson.codecs.pojo.TypeParameterMap.Builder addIndex(int r3) {
                r2 = this;
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r2.propertyToClassParamIndexMap
                r1 = -1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.put(r1, r3)
                return r2
        }

        public final org.bson.codecs.pojo.TypeParameterMap.Builder addIndex(int r2, int r3) {
                r1 = this;
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.propertyToClassParamIndexMap
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.put(r2, r3)
                return r1
        }

        public final org.bson.codecs.pojo.TypeParameterMap build() {
                r3 = this;
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r3.propertyToClassParamIndexMap
                int r0 = r0.size()
                r1 = 1
                if (r0 <= r1) goto L1f
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r3.propertyToClassParamIndexMap
                r1 = -1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.containsKey(r1)
                if (r0 != 0) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "You cannot have a generic field that also has type parameters."
                r0.<init>(r1)
                throw r0
            L1f:
                org.bson.codecs.pojo.TypeParameterMap r0 = new org.bson.codecs.pojo.TypeParameterMap
                java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r3.propertyToClassParamIndexMap
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    private TypeParameterMap(java.util.Map<java.lang.Integer, java.lang.Integer> r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.propertyToClassParamIndexMap = r1
            return
    }

    public /* synthetic */ TypeParameterMap(java.util.Map r1, org.bson.codecs.pojo.TypeParameterMap.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1e
            java.lang.Class<org.bson.codecs.pojo.TypeParameterMap> r2 = org.bson.codecs.pojo.TypeParameterMap.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1e
        L10:
            org.bson.codecs.pojo.TypeParameterMap r5 = (org.bson.codecs.pojo.TypeParameterMap) r5
            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r4.propertyToClassParamIndexMap
            java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r5.propertyToClassParamIndexMap
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1d
            return r1
        L1d:
            return r0
        L1e:
            return r1
    }

    public final java.util.Map<java.lang.Integer, java.lang.Integer> getPropertyToClassParamIndexMap() {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.propertyToClassParamIndexMap
            return r0
    }

    public final boolean hasTypeParameters() {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.propertyToClassParamIndexMap
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.propertyToClassParamIndexMap
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "TypeParameterMap{fieldToClassParamIndexMap="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r2.propertyToClassParamIndexMap
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
