package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes2.dex */
public final class PropertyModel<T> {
    private volatile org.bson.codecs.Codec<T> cachedCodec;
    private final org.bson.codecs.Codec<T> codec;
    private final java.lang.String error;
    private final java.lang.String name;
    private final org.bson.codecs.pojo.PropertyAccessor<T> propertyAccessor;
    private final org.bson.codecs.pojo.PropertySerialization<T> propertySerialization;
    private final java.lang.String readName;
    private final org.bson.codecs.pojo.TypeData<T> typeData;
    private final java.lang.Boolean useDiscriminator;
    private final java.lang.String writeName;

    public PropertyModel(java.lang.String r1, java.lang.String r2, java.lang.String r3, org.bson.codecs.pojo.TypeData<T> r4, org.bson.codecs.Codec<T> r5, org.bson.codecs.pojo.PropertySerialization<T> r6, java.lang.Boolean r7, org.bson.codecs.pojo.PropertyAccessor<T> r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.readName = r2
            r0.writeName = r3
            r0.typeData = r4
            r0.codec = r5
            r0.cachedCodec = r5
            r0.propertySerialization = r6
            r0.useDiscriminator = r7
            r0.propertyAccessor = r8
            r0.error = r9
            return
    }

    public static <T> org.bson.codecs.pojo.PropertyModelBuilder<T> builder() {
            org.bson.codecs.pojo.PropertyModelBuilder r0 = new org.bson.codecs.pojo.PropertyModelBuilder
            r0.<init>()
            return r0
    }

    public final void cachedCodec(org.bson.codecs.Codec<T> r1) {
            r0 = this;
            r0.cachedCodec = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L106
            java.lang.Class<org.bson.codecs.pojo.PropertyModel> r2 = org.bson.codecs.pojo.PropertyModel.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            goto L106
        L11:
            org.bson.codecs.pojo.PropertyModel r5 = (org.bson.codecs.pojo.PropertyModel) r5
            java.lang.String r2 = r4.getName()
            if (r2 == 0) goto L28
            java.lang.String r2 = r4.getName()
            java.lang.String r3 = r5.getName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2f
            goto L2e
        L28:
            java.lang.String r2 = r5.getName()
            if (r2 == 0) goto L2f
        L2e:
            return r1
        L2f:
            java.lang.String r2 = r4.getReadName()
            if (r2 == 0) goto L44
            java.lang.String r2 = r4.getReadName()
            java.lang.String r3 = r5.getReadName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4b
            goto L4a
        L44:
            java.lang.String r2 = r5.getReadName()
            if (r2 == 0) goto L4b
        L4a:
            return r1
        L4b:
            java.lang.String r2 = r4.getWriteName()
            if (r2 == 0) goto L60
            java.lang.String r2 = r4.getWriteName()
            java.lang.String r3 = r5.getWriteName()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L67
            goto L66
        L60:
            java.lang.String r2 = r5.getWriteName()
            if (r2 == 0) goto L67
        L66:
            return r1
        L67:
            org.bson.codecs.pojo.TypeData r2 = r4.getTypeData()
            if (r2 == 0) goto L7c
            org.bson.codecs.pojo.TypeData r2 = r4.getTypeData()
            org.bson.codecs.pojo.TypeData r3 = r5.getTypeData()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L83
            goto L82
        L7c:
            org.bson.codecs.pojo.TypeData r2 = r5.getTypeData()
            if (r2 == 0) goto L83
        L82:
            return r1
        L83:
            org.bson.codecs.Codec r2 = r4.getCodec()
            if (r2 == 0) goto L98
            org.bson.codecs.Codec r2 = r4.getCodec()
            org.bson.codecs.Codec r3 = r5.getCodec()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9f
            goto L9e
        L98:
            org.bson.codecs.Codec r2 = r5.getCodec()
            if (r2 == 0) goto L9f
        L9e:
            return r1
        L9f:
            org.bson.codecs.pojo.PropertySerialization<T> r2 = r4.propertySerialization
            if (r2 == 0) goto Lac
            org.bson.codecs.pojo.PropertySerialization<T> r3 = r5.propertySerialization
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb1
            goto Lb0
        Lac:
            org.bson.codecs.pojo.PropertySerialization<T> r2 = r5.propertySerialization
            if (r2 == 0) goto Lb1
        Lb0:
            return r1
        Lb1:
            java.lang.Boolean r2 = r4.useDiscriminator
            if (r2 == 0) goto Lbe
            java.lang.Boolean r3 = r5.useDiscriminator
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc3
            goto Lc2
        Lbe:
            java.lang.Boolean r2 = r5.useDiscriminator
            if (r2 == 0) goto Lc3
        Lc2:
            return r1
        Lc3:
            org.bson.codecs.pojo.PropertyAccessor r2 = r4.getPropertyAccessor()
            if (r2 == 0) goto Ld8
            org.bson.codecs.pojo.PropertyAccessor r2 = r4.getPropertyAccessor()
            org.bson.codecs.pojo.PropertyAccessor r3 = r5.getPropertyAccessor()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Ldf
            goto Lde
        Ld8:
            org.bson.codecs.pojo.PropertyAccessor r2 = r5.getPropertyAccessor()
            if (r2 == 0) goto Ldf
        Lde:
            return r1
        Ldf:
            java.lang.String r2 = r4.error
            if (r2 == 0) goto Lec
            java.lang.String r3 = r5.error
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lf1
            goto Lf0
        Lec:
            java.lang.String r2 = r5.error
            if (r2 == 0) goto Lf1
        Lf0:
            return r1
        Lf1:
            org.bson.codecs.Codec<T> r2 = r4.cachedCodec
            if (r2 == 0) goto L100
            org.bson.codecs.Codec<T> r2 = r4.cachedCodec
            org.bson.codecs.Codec<T> r5 = r5.cachedCodec
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L105
            goto L104
        L100:
            org.bson.codecs.Codec<T> r5 = r5.cachedCodec
            if (r5 == 0) goto L105
        L104:
            return r1
        L105:
            return r0
        L106:
            return r1
    }

    public final org.bson.codecs.Codec<T> getCachedCodec() {
            r1 = this;
            org.bson.codecs.Codec<T> r0 = r1.cachedCodec
            return r0
    }

    public org.bson.codecs.Codec<T> getCodec() {
            r1 = this;
            org.bson.codecs.Codec<T> r0 = r1.codec
            return r0
    }

    public final java.lang.String getError() {
            r1 = this;
            java.lang.String r0 = r1.error
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public org.bson.codecs.pojo.PropertyAccessor<T> getPropertyAccessor() {
            r1 = this;
            org.bson.codecs.pojo.PropertyAccessor<T> r0 = r1.propertyAccessor
            return r0
    }

    public final org.bson.codecs.pojo.PropertySerialization<T> getPropertySerialization() {
            r1 = this;
            org.bson.codecs.pojo.PropertySerialization<T> r0 = r1.propertySerialization
            return r0
    }

    public java.lang.String getReadName() {
            r1 = this;
            java.lang.String r0 = r1.readName
            return r0
    }

    public org.bson.codecs.pojo.TypeData<T> getTypeData() {
            r1 = this;
            org.bson.codecs.pojo.TypeData<T> r0 = r1.typeData
            return r0
    }

    public java.lang.String getWriteName() {
            r1 = this;
            java.lang.String r0 = r1.writeName
            return r0
    }

    public final boolean hasError() {
            r1 = this;
            java.lang.String r0 = r1.error
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.getName()
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = r3.getName()
            int r0 = r0.hashCode()
            goto L11
        L10:
            r0 = 0
        L11:
            int r0 = r0 * 31
            java.lang.String r2 = r3.getReadName()
            if (r2 == 0) goto L22
            java.lang.String r2 = r3.getReadName()
            int r2 = r2.hashCode()
            goto L23
        L22:
            r2 = 0
        L23:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.getWriteName()
            if (r2 == 0) goto L35
            java.lang.String r2 = r3.getWriteName()
            int r2 = r2.hashCode()
            goto L36
        L35:
            r2 = 0
        L36:
            int r0 = r0 + r2
            int r0 = r0 * 31
            org.bson.codecs.pojo.TypeData r2 = r3.getTypeData()
            if (r2 == 0) goto L48
            org.bson.codecs.pojo.TypeData r2 = r3.getTypeData()
            int r2 = r2.hashCode()
            goto L49
        L48:
            r2 = 0
        L49:
            int r0 = r0 + r2
            int r0 = r0 * 31
            org.bson.codecs.Codec r2 = r3.getCodec()
            if (r2 == 0) goto L5b
            org.bson.codecs.Codec r2 = r3.getCodec()
            int r2 = r2.hashCode()
            goto L5c
        L5b:
            r2 = 0
        L5c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            org.bson.codecs.pojo.PropertySerialization<T> r2 = r3.propertySerialization
            if (r2 == 0) goto L68
            int r2 = r2.hashCode()
            goto L69
        L68:
            r2 = 0
        L69:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Boolean r2 = r3.useDiscriminator
            if (r2 == 0) goto L75
            int r2 = r2.hashCode()
            goto L76
        L75:
            r2 = 0
        L76:
            int r0 = r0 + r2
            int r0 = r0 * 31
            org.bson.codecs.pojo.PropertyAccessor r2 = r3.getPropertyAccessor()
            if (r2 == 0) goto L88
            org.bson.codecs.pojo.PropertyAccessor r2 = r3.getPropertyAccessor()
            int r2 = r2.hashCode()
            goto L89
        L88:
            r2 = 0
        L89:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.error
            if (r2 == 0) goto L95
            int r2 = r2.hashCode()
            goto L96
        L95:
            r2 = 0
        L96:
            int r0 = r0 + r2
            int r0 = r0 * 31
            org.bson.codecs.Codec<T> r2 = r3.cachedCodec
            if (r2 == 0) goto La3
            org.bson.codecs.Codec<T> r1 = r3.cachedCodec
            int r1 = r1.hashCode()
        La3:
            int r0 = r0 + r1
            return r0
    }

    public boolean isReadable() {
            r1 = this;
            java.lang.String r0 = r1.readName
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isWritable() {
            r1 = this;
            java.lang.String r0 = r1.writeName
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean shouldSerialize(T r2) {
            r1 = this;
            org.bson.codecs.pojo.PropertySerialization<T> r0 = r1.propertySerialization
            boolean r2 = r0.shouldSerialize(r2)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "PropertyModel{propertyName='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "', readName='"
            r0.append(r1)
            java.lang.String r1 = r2.readName
            r0.append(r1)
            java.lang.String r1 = "', writeName='"
            r0.append(r1)
            java.lang.String r1 = r2.writeName
            r0.append(r1)
            java.lang.String r1 = "', typeData="
            r0.append(r1)
            org.bson.codecs.pojo.TypeData<T> r1 = r2.typeData
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Boolean useDiscriminator() {
            r1 = this;
            java.lang.Boolean r0 = r1.useDiscriminator
            return r0
    }
}
