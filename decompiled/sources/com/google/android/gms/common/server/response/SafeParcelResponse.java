package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SafeParcelResponseCreator")
public class SafeParcelResponse extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.SafeParcelResponse> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getParcel", id = 2)
    private final android.os.Parcel zab;
    private final int zac;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final com.google.android.gms.common.server.response.zan zad;

    @androidx.annotation.Nullable
    private final java.lang.String zae;
    private int zaf;
    private int zag;

    static {
            com.google.android.gms.common.server.response.zaq r0 = new com.google.android.gms.common.server.response.zaq
            r0.<init>()
            com.google.android.gms.common.server.response.SafeParcelResponse.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public SafeParcelResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.Parcel r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.common.server.response.zan r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.os.Parcel r1 = (android.os.Parcel) r1
            r0.zab = r1
            r1 = 2
            r0.zac = r1
            r0.zad = r3
            if (r3 != 0) goto L16
            r2 = 0
            goto L1a
        L16:
            java.lang.String r2 = r3.zaa()
        L1a:
            r0.zae = r2
            r0.zaf = r1
            return
    }

    private SafeParcelResponse(com.google.android.gms.common.internal.safeparcel.SafeParcelable r4, com.google.android.gms.common.server.response.zan r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.zaa = r0
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r3.zab = r1
            r2 = 0
            r4.writeToParcel(r1, r2)
            r3.zac = r0
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.server.response.zan r4 = (com.google.android.gms.common.server.response.zan) r4
            r3.zad = r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.lang.String r4 = (java.lang.String) r4
            r3.zae = r4
            r4 = 2
            r3.zaf = r4
            return
    }

    public SafeParcelResponse(com.google.android.gms.common.server.response.zan r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1.zab = r0
            r0 = 0
            r1.zac = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.server.response.zan r2 = (com.google.android.gms.common.server.response.zan) r2
            r1.zad = r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.zae = r2
            r1.zaf = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T extends com.google.android.gms.common.server.response.FastJsonResponse & com.google.android.gms.common.internal.safeparcel.SafeParcelable> com.google.android.gms.common.server.response.SafeParcelResponse from(@androidx.annotation.NonNull T r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.common.server.response.zan r1 = new com.google.android.gms.common.server.response.zan
            java.lang.Class r2 = r3.getClass()
            r1.<init>(r2)
            zaF(r1, r3)
            r1.zac()
            r1.zad()
            com.google.android.gms.common.server.response.SafeParcelResponse r2 = new com.google.android.gms.common.server.response.SafeParcelResponse
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r3
            r2.<init>(r3, r1, r0)
            return r2
    }

    private static void zaF(com.google.android.gms.common.server.response.zan r3, com.google.android.gms.common.server.response.FastJsonResponse r4) {
            java.lang.Class r0 = r4.getClass()
            boolean r1 = r3.zaf(r0)
            if (r1 != 0) goto L8b
            java.util.Map r4 = r4.getFieldMappings()
            r3.zae(r0, r4)
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.get(r1)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r1 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r1
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r2 = r1.zag
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L62
            com.google.android.gms.common.server.response.FastJsonResponse r2 = (com.google.android.gms.common.server.response.FastJsonResponse) r2     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L62
            zaF(r3, r2)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L62
            goto L19
        L39:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r0 = r1.zag
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Could not access object of type "
            int r2 = r0.length()
            if (r2 == 0) goto L59
            java.lang.String r0 = r1.concat(r0)
            goto L5e
        L59:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L5e:
            r4.<init>(r0, r3)
            throw r4
        L62:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r0 = r1.zag
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Could not instantiate an object of type "
            int r2 = r0.length()
            if (r2 == 0) goto L82
            java.lang.String r0 = r1.concat(r0)
            goto L87
        L82:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L87:
            r4.<init>(r0, r3)
            throw r4
        L8b:
            return
    }

    private final void zaG(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r3) {
            r2 = this;
            int r3 = r3.zaf
            r0 = -1
            if (r3 == r0) goto L2a
            android.os.Parcel r3 = r2.zab
            if (r3 == 0) goto L22
            int r0 = r2.zaf
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempted to parse JSON with a SafeParcelResponse object that is already filled with data."
            r3.<init>(r0)
            throw r3
        L19:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r2.zag = r3
            r2.zaf = r1
            return
        L22:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal Parcel object is null."
            r3.<init>(r0)
            throw r3
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Field does not have a valid safe parcelable field id."
            r3.<init>(r0)
            throw r3
    }

    private final void zaH(java.lang.StringBuilder r10, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> r11, android.os.Parcel r12) {
            r9 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Ld:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.getSafeParcelableFieldId()
            r0.put(r2, r1)
            goto Ld
        L27:
            r11 = 123(0x7b, float:1.72E-43)
            r10.append(r11)
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
        L32:
            int r3 = r12.dataPosition()
            if (r3 >= r11) goto L29c
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            java.lang.Object r4 = r0.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L32
            java.lang.String r5 = ","
            if (r2 == 0) goto L4f
            r10.append(r5)
        L4f:
            java.lang.Object r2 = r4.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r4.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            java.lang.String r6 = "\""
            r10.append(r6)
            r10.append(r2)
            java.lang.String r2 = "\":"
            r10.append(r2)
            boolean r2 = r4.zaj()
            if (r2 == 0) goto L146
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L135;
                case 1: goto L128;
                case 2: goto L117;
                case 3: goto L106;
                case 4: goto Lf5;
                case 5: goto Le8;
                case 6: goto Ld7;
                case 7: goto Lca;
                case 8: goto Lbd;
                case 9: goto Lbd;
                case 10: goto L89;
                case 11: goto L81;
                default: goto L73;
            }
        L73:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r11 = 36
            java.lang.String r12 = "Unknown field out type = "
            java.lang.String r11 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r11, r12, r2)
            r10.<init>(r11)
            throw r10
        L81:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Method does not accept concrete type."
            r10.<init>(r11)
            throw r10
        L89:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r12, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L9a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r2.getString(r6)
            java.lang.Object r7 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.lang.String r7 = (java.lang.String) r7
            r3.put(r6, r7)
            goto L9a
        Lb4:
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r3)
            zaJ(r10, r4, r2)
            goto L299
        Lbd:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r12, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        Lca:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        Ld7:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        Le8:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r12, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        Lf5:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r12, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        L106:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r12, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        L117:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        L128:
            java.math.BigInteger r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r12, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        L135:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r10, r4, r2)
            goto L299
        L146:
            boolean r2 = r4.zad
            if (r2 == 0) goto L1c8
            java.lang.String r2 = "["
            r10.append(r2)
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L1ba;
                case 1: goto L1b2;
                case 2: goto L1aa;
                case 3: goto L1a2;
                case 4: goto L19a;
                case 5: goto L192;
                case 6: goto L18a;
                case 7: goto L182;
                case 8: goto L17a;
                case 9: goto L17a;
                case 10: goto L17a;
                case 11: goto L15c;
                default: goto L154;
            }
        L154:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unknown field type out."
            r10.<init>(r11)
            throw r10
        L15c:
            android.os.Parcel[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(r12, r3)
            int r3 = r2.length
            r6 = 0
        L162:
            if (r6 >= r3) goto L1c1
            if (r6 <= 0) goto L169
            r10.append(r5)
        L169:
            r7 = r2[r6]
            r7.setDataPosition(r1)
            java.util.Map r7 = r4.zah()
            r8 = r2[r6]
            r9.zaH(r10, r7, r8)
            int r6 = r6 + 1
            goto L162
        L17a:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r11 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r10.<init>(r11)
            throw r10
        L182:
            java.lang.String[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeStringArray(r10, r2)
            goto L1c1
        L18a:
            boolean[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r10, r2)
            goto L1c1
        L192:
            java.math.BigDecimal[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r10, r2)
            goto L1c1
        L19a:
            double[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r10, r2)
            goto L1c1
        L1a2:
            float[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r10, r2)
            goto L1c1
        L1aa:
            long[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r10, r2)
            goto L1c1
        L1b2:
            java.math.BigInteger[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r10, r2)
            goto L1c1
        L1ba:
            int[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r12, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r10, r2)
        L1c1:
            java.lang.String r2 = "]"
            r10.append(r2)
            goto L299
        L1c8:
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L292;
                case 1: goto L28a;
                case 2: goto L282;
                case 3: goto L27a;
                case 4: goto L272;
                case 5: goto L26a;
                case 6: goto L262;
                case 7: goto L250;
                case 8: goto L23e;
                case 9: goto L22c;
                case 10: goto L1e5;
                case 11: goto L1d5;
                default: goto L1cd;
            }
        L1cd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unknown field type out"
            r10.<init>(r11)
            throw r10
        L1d5:
            android.os.Parcel r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(r12, r3)
            r2.setDataPosition(r1)
            java.util.Map r3 = r4.zah()
            r9.zaH(r10, r3, r2)
            goto L299
        L1e5:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r12, r3)
            java.util.Set r3 = r2.keySet()
            java.lang.String r4 = "{"
            r10.append(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 1
        L1f8:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L224
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r4 != 0) goto L209
            r10.append(r5)
        L209:
            r10.append(r6)
            r10.append(r7)
            java.lang.String r4 = "\":\""
            r10.append(r4)
            java.lang.String r4 = r2.getString(r7)
            java.lang.String r4 = com.google.android.gms.common.util.JsonUtils.escapeString(r4)
            r10.append(r4)
            r10.append(r6)
            r4 = 0
            goto L1f8
        L224:
            java.lang.String r2 = "}"
            r10.append(r2)
            goto L299
        L22c:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r12, r3)
            r10.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r2)
            r10.append(r2)
            r10.append(r6)
            goto L299
        L23e:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r12, r3)
            r10.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encode(r2)
            r10.append(r2)
            r10.append(r6)
            goto L299
        L250:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r3)
            r10.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.JsonUtils.escapeString(r2)
            r10.append(r2)
            r10.append(r6)
            goto L299
        L262:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r3)
            r10.append(r2)
            goto L299
        L26a:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r12, r3)
            r10.append(r2)
            goto L299
        L272:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r12, r3)
            r10.append(r2)
            goto L299
        L27a:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r12, r3)
            r10.append(r2)
            goto L299
        L282:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r3)
            r10.append(r2)
            goto L299
        L28a:
            java.math.BigInteger r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r12, r3)
            r10.append(r2)
            goto L299
        L292:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r3)
            r10.append(r2)
        L299:
            r2 = 1
            goto L32
        L29c:
            int r0 = r12.dataPosition()
            if (r0 != r11) goto L2a8
            r11 = 125(0x7d, float:1.75E-43)
            r10.append(r11)
            return
        L2a8:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r10 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            r0 = 37
            java.lang.String r1 = "Overread allowed size end="
            java.lang.String r11 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r11)
            r10.<init>(r11, r12)
            throw r10
    }

    private static final void zaI(java.lang.StringBuilder r1, int r2, @androidx.annotation.Nullable java.lang.Object r3) {
            java.lang.String r0 = "\""
            switch(r2) {
                case 0: goto L5b;
                case 1: goto L5b;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L5b;
                case 5: goto L5b;
                case 6: goto L5b;
                case 7: goto L45;
                case 8: goto L35;
                case 9: goto L25;
                case 10: goto L1b;
                case 11: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r3 = 26
            java.lang.String r0 = "Unknown type = "
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r3, r0, r2)
            r1.<init>(r2)
            throw r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Method does not accept concrete type."
            r1.<init>(r2)
            throw r1
        L1b:
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r2)
            return
        L25:
            r1.append(r0)
            byte[] r3 = (byte[]) r3
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r3)
            r1.append(r2)
            r1.append(r0)
            return
        L35:
            r1.append(r0)
            byte[] r3 = (byte[]) r3
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encode(r3)
            r1.append(r2)
            r1.append(r0)
            return
        L45:
            r1.append(r0)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.google.android.gms.common.util.JsonUtils.escapeString(r2)
            r1.append(r2)
            r1.append(r0)
            return
        L5b:
            r1.append(r3)
            return
    }

    private static final void zaJ(java.lang.StringBuilder r4, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r5, java.lang.Object r6) {
            boolean r0 = r5.zab
            if (r0 == 0) goto L2b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.String r0 = "["
            r4.append(r0)
            int r0 = r6.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L25
            if (r1 == 0) goto L19
            java.lang.String r2 = ","
            r4.append(r2)
        L19:
            int r2 = r5.zaa
            java.lang.Object r3 = r6.get(r1)
            zaI(r4, r2, r3)
            int r1 = r1 + 1
            goto L10
        L25:
            java.lang.String r5 = "]"
            r4.append(r5)
            return
        L2b:
            int r5 = r5.zaa
            zaI(r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r4, @androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable java.util.ArrayList<T> r6) {
            r3 = this;
            r3.zaG(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.size()
            int r0 = r6.size()
            r1 = 0
        L16:
            if (r1 >= r0) goto L2a
            java.lang.Object r2 = r6.get(r1)
            com.google.android.gms.common.server.response.FastJsonResponse r2 = (com.google.android.gms.common.server.response.FastJsonResponse) r2
            com.google.android.gms.common.server.response.SafeParcelResponse r2 = (com.google.android.gms.common.server.response.SafeParcelResponse) r2
            android.os.Parcel r2 = r2.zaE()
            r5.add(r2)
            int r1 = r1 + 1
            goto L16
        L2a:
            android.os.Parcel r6 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelList(r6, r4, r5, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull T r4) {
            r1 = this;
            r1.zaG(r2)
            com.google.android.gms.common.server.response.SafeParcelResponse r4 = (com.google.android.gms.common.server.response.SafeParcelResponse) r4
            android.os.Parcel r3 = r4.zaE()
            android.os.Parcel r4 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(r4, r2, r3, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @androidx.annotation.Nullable
    public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
            r2 = this;
            com.google.android.gms.common.server.response.zan r0 = r2.zad
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = r2.zae
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r0 = r0.zab(r1)
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @androidx.annotation.NonNull
    public final java.lang.Object getValueObject(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Converting to JSON does not require this method."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Converting to JSON does not require this method."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, boolean r3) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r0 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r3, @androidx.annotation.Nullable byte[] r4) {
            r2 = this;
            r2.zaG(r3)
            android.os.Parcel r0 = r2.zab
            int r3 = r3.getSafeParcelableFieldId()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r0, r3, r4, r1)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, int r3) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r0 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, long r3) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r0 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r3, @androidx.annotation.Nullable java.lang.String r4) {
            r2 = this;
            r2.zaG(r3)
            android.os.Parcel r0 = r2.zab
            int r3 = r3.getSafeParcelableFieldId()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r0, r3, r4, r1)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.Nullable java.util.Map r6) {
            r4 = this;
            r4.zaG(r5)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0.putString(r2, r3)
            goto L16
        L2c:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r6, r5, r0, r1)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r6.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L1d:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r6, r5, r1, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r4 = this;
            com.google.android.gms.common.server.response.zan r0 = r4.zad
            java.lang.String r1 = "Cannot convert to JSON on client side."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            android.os.Parcel r0 = r4.zaE()
            r1 = 0
            r0.setDataPosition(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            com.google.android.gms.common.server.response.zan r2 = r4.zad
            java.lang.String r3 = r4.zae
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r2 = r2.zab(r3)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Map r2 = (java.util.Map) r2
            r4.zaH(r1, r2, r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            int r1 = r5.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r2, r1)
            android.os.Parcel r1 = r5.zaE()
            r3 = 2
            r4 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(r6, r3, r1, r4)
            int r1 = r5.zac
            if (r1 == 0) goto L1f
            if (r1 == r2) goto L1c
            com.google.android.gms.common.server.response.zan r1 = r5.zad
            goto L20
        L1c:
            com.google.android.gms.common.server.response.zan r1 = r5.zad
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r2, r1, r7, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            return
    }

    @androidx.annotation.NonNull
    public final android.os.Parcel zaE() {
            r3 = this;
            int r0 = r3.zaf
            r1 = 2
            if (r0 == 0) goto L13
            r2 = 1
            if (r0 == r2) goto L9
            goto L22
        L9:
            android.os.Parcel r0 = r3.zab
            int r2 = r3.zag
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r0, r2)
            r3.zaf = r1
            goto L22
        L13:
            android.os.Parcel r0 = r3.zab
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r0)
            r3.zag = r0
            android.os.Parcel r2 = r3.zab
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r2, r0)
            r3.zaf = r1
        L22:
            android.os.Parcel r0 = r3.zab
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r3, @androidx.annotation.Nullable java.math.BigDecimal r4) {
            r2 = this;
            r2.zaG(r3)
            android.os.Parcel r0 = r2.zab
            int r3 = r3.getSafeParcelableFieldId()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(r0, r3, r4, r1)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            java.math.BigDecimal[] r1 = new java.math.BigDecimal[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r6.get(r2)
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L1d:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimalArray(r6, r5, r1, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r3, @androidx.annotation.Nullable java.math.BigInteger r4) {
            r2 = this;
            r2.zaG(r3)
            android.os.Parcel r0 = r2.zab
            int r3 = r3.getSafeParcelableFieldId()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigInteger(r0, r3, r4, r1)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            java.math.BigInteger[] r1 = new java.math.BigInteger[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r6.get(r2)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L1d:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigIntegerArray(r6, r5, r1, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            boolean[] r1 = new boolean[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L21:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(r6, r5, r1, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, double r3) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r0 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r6, @androidx.annotation.Nullable java.util.ArrayList r7) {
            r5 = this;
            r5.zaG(r6)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            double[] r1 = new double[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r7.get(r2)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L21:
            android.os.Parcel r7 = r5.zab
            int r6 = r6.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleArray(r7, r6, r1, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r2, float r3) {
            r1 = this;
            r1.zaG(r2)
            android.os.Parcel r0 = r1.zab
            int r2 = r2.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r0, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            float[] r1 = new float[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r6.get(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L21:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(r6, r5, r1, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r5, @androidx.annotation.Nullable java.util.ArrayList r6) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int[] r1 = new int[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r6.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L21:
            android.os.Parcel r6 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r6, r5, r1, r0)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r6, @androidx.annotation.Nullable java.util.ArrayList r7) {
            r5 = this;
            r5.zaG(r6)
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            long[] r1 = new long[r0]
            r2 = 0
        L10:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r7.get(r2)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L21:
            android.os.Parcel r7 = r5.zab
            int r6 = r6.getSafeParcelableFieldId()
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongArray(r7, r6, r1, r0)
            return
    }
}
