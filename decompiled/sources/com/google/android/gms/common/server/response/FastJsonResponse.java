package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class FastJsonResponse {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes.dex */
    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FieldCreator")
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Field<I, O> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.zaj CREATOR = null;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeIn", id = 2)
        public final int zaa;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        public final boolean zab;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeOut", id = 4)
        public final int zac;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        public final boolean zad;

        @androidx.annotation.NonNull
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        public final java.lang.String zae;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        public final int zaf;

        @androidx.annotation.Nullable
        public final java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> zag;

        @androidx.annotation.Nullable
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        public final java.lang.String zah;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private com.google.android.gms.common.server.response.zan zaj;

        @androidx.annotation.Nullable
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> zak;

        static {
                com.google.android.gms.common.server.response.zaj r0 = new com.google.android.gms.common.server.response.zaj
                r0.<init>()
                com.google.android.gms.common.server.response.FastJsonResponse.Field.CREATOR = r0
                return
        }

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        public Field(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) int r7, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r8, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa r9) {
                r0 = this;
                r0.<init>()
                r0.zai = r1
                r0.zaa = r2
                r0.zab = r3
                r0.zac = r4
                r0.zad = r5
                r0.zae = r6
                r0.zaf = r7
                r1 = 0
                if (r8 != 0) goto L19
                r0.zag = r1
                r0.zah = r1
                goto L1f
            L19:
                java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r2 = com.google.android.gms.common.server.response.SafeParcelResponse.class
                r0.zag = r2
                r0.zah = r8
            L1f:
                if (r9 != 0) goto L24
                r0.zak = r1
                return
            L24:
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r1 = r9.zab()
                r0.zak = r1
                return
        }

        public Field(int r2, boolean r3, int r4, boolean r5, @androidx.annotation.NonNull java.lang.String r6, int r7, @androidx.annotation.Nullable java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r8, @androidx.annotation.Nullable com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> r9) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.zai = r0
                r1.zaa = r2
                r1.zab = r3
                r1.zac = r4
                r1.zad = r5
                r1.zae = r6
                r1.zaf = r7
                r1.zag = r8
                if (r8 != 0) goto L1a
                r2 = 0
                r1.zah = r2
                goto L20
            L1a:
                java.lang.String r2 = r8.getCanonicalName()
                r1.zah = r2
            L20:
                r1.zak = r9
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.util.VisibleForTesting
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], byte[]> forBase64(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 8
                r2 = 0
                r3 = 8
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, java.lang.Boolean> forBoolean(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 6
                r2 = 0
                r3 = 6
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<T, T> forConcreteType(@androidx.annotation.NonNull java.lang.String r10, int r11, @androidx.annotation.NonNull java.lang.Class<T> r12) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 11
                r2 = 0
                r3 = 11
                r4 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r7 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> forConcreteTypeArray(@androidx.annotation.NonNull java.lang.String r10, int r11, @androidx.annotation.NonNull java.lang.Class<T> r12) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 11
                r2 = 1
                r3 = 11
                r4 = 1
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r7 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, java.lang.Double> forDouble(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 4
                r2 = 0
                r3 = 4
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, java.lang.Float> forFloat(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 3
                r2 = 0
                r3 = 3
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.util.VisibleForTesting
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, java.lang.Integer> forInteger(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, java.lang.Long> forLong(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 2
                r2 = 0
                r3 = 2
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, java.lang.String> forString(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 7
                r2 = 0
                r3 = 7
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> forStringMap(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 10
                r2 = 0
                r3 = 10
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> forStrings(@androidx.annotation.NonNull java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 7
                r2 = 1
                r3 = 7
                r4 = 1
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field withConverter(@androidx.annotation.NonNull java.lang.String r10, int r11, @androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> r12, boolean r13) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r12.zaa()
                r12.zab()
                r1 = 7
                r3 = 0
                r4 = 0
                r7 = 0
                r0 = r9
                r2 = r13
                r5 = r10
                r6 = r11
                r8 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zac(com.google.android.gms.common.server.response.FastJsonResponse.Field r0) {
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r0 = r0.zak
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public int getSafeParcelableFieldId() {
                r1 = this;
                int r0 = r1.zaf
                return r0
        }

        @androidx.annotation.NonNull
        public final java.lang.String toString() {
                r3 = this;
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
                int r1 = r3.zai
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "versionCode"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zaa
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "typeIn"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                boolean r1 = r3.zab
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r2 = "typeInArray"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zac
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "typeOut"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                boolean r1 = r3.zad
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r2 = "typeOutArray"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = r3.zae
                java.lang.String r2 = "outputFieldName"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zaf
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "safeParcelFieldId"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = r3.zah
                if (r1 != 0) goto L5f
                r1 = 0
            L5f:
                java.lang.String r2 = "concreteTypeName"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r1 = r3.zag
                if (r1 == 0) goto L72
                java.lang.String r1 = r1.getCanonicalName()
                java.lang.String r2 = "concreteType.class"
                r0.add(r2, r1)
            L72:
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r1 = r3.zak
                if (r1 == 0) goto L83
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getCanonicalName()
                java.lang.String r2 = "converterName"
                r0.add(r2, r1)
            L83:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r6, int r7) {
                r5 = this;
                int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
                int r1 = r5.zai
                r2 = 1
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r2, r1)
                int r1 = r5.zaa
                r2 = 2
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r2, r1)
                boolean r1 = r5.zab
                r2 = 3
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r6, r2, r1)
                int r1 = r5.zac
                r2 = 4
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r2, r1)
                boolean r1 = r5.zad
                r2 = 5
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r6, r2, r1)
                java.lang.String r1 = r5.zae
                r2 = 6
                r3 = 0
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r2, r1, r3)
                int r1 = r5.getSafeParcelableFieldId()
                r2 = 7
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r2, r1)
                java.lang.String r1 = r5.zah
                r2 = 0
                if (r1 != 0) goto L37
                r1 = r2
            L37:
                r4 = 8
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r4, r1, r3)
                r1 = 9
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r4 = r5.zak
                if (r4 != 0) goto L43
                goto L47
            L43:
                com.google.android.gms.common.server.converter.zaa r2 = com.google.android.gms.common.server.converter.zaa.zaa(r4)
            L47:
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r1, r2, r7, r3)
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
                return
        }

        @androidx.annotation.NonNull
        public final com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> zab() {
                r11 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$Field r10 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                int r1 = r11.zai
                int r2 = r11.zaa
                boolean r3 = r11.zab
                int r4 = r11.zac
                boolean r5 = r11.zad
                java.lang.String r6 = r11.zae
                int r7 = r11.zaf
                java.lang.String r8 = r11.zah
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r0 = r11.zak
                if (r0 != 0) goto L18
                r0 = 0
                goto L1c
            L18:
                com.google.android.gms.common.server.converter.zaa r0 = com.google.android.gms.common.server.converter.zaa.zaa(r0)
            L1c:
                r9 = r0
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r10
        }

        @androidx.annotation.NonNull
        public final com.google.android.gms.common.server.response.FastJsonResponse zad() throws java.lang.InstantiationException, java.lang.IllegalAccessException {
                r3 = this;
                java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r0 = r3.zag
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r0 = r3.zag
                java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r1 = com.google.android.gms.common.server.response.SafeParcelResponse.class
                if (r0 != r1) goto L21
                java.lang.String r0 = r3.zah
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r3.zaj
                java.lang.String r1 = "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object."
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
                com.google.android.gms.common.server.response.SafeParcelResponse r0 = new com.google.android.gms.common.server.response.SafeParcelResponse
                com.google.android.gms.common.server.response.zan r1 = r3.zaj
                java.lang.String r2 = r3.zah
                r0.<init>(r1, r2)
                return r0
            L21:
                java.lang.Object r0 = r0.newInstance()
                com.google.android.gms.common.server.response.FastJsonResponse r0 = (com.google.android.gms.common.server.response.FastJsonResponse) r0
                return r0
        }

        @androidx.annotation.NonNull
        public final O zae(@androidx.annotation.Nullable I r2) {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r0 = r1.zak
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r0 = r1.zak
                java.lang.Object r2 = r0.zac(r2)
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                return r2
        }

        @androidx.annotation.NonNull
        public final I zaf(@androidx.annotation.NonNull O r2) {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r0 = r1.zak
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r0 = r1.zak
                java.lang.Object r2 = r0.zad(r2)
                return r2
        }

        @androidx.annotation.NonNull
        public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zah() {
                r2 = this;
                java.lang.String r0 = r2.zah
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r2.zaj
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r2.zaj
                java.lang.String r1 = r2.zah
                java.util.Map r0 = r0.zab(r1)
                java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        public final void zai(com.google.android.gms.common.server.response.zan r1) {
                r0 = this;
                r0.zaj = r1
                return
        }

        public final boolean zaj() {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter<I, O> r0 = r1.zak
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.internal.ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @androidx.annotation.Nullable
        O zac(@androidx.annotation.NonNull I r1);

        @androidx.annotation.NonNull
        I zad(@androidx.annotation.NonNull O r1);
    }

    public FastJsonResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static final <O, I> I zaD(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> r1, @androidx.annotation.Nullable java.lang.Object r2) {
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r1)
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.zaf(r2)
            return r1
        Lb:
            return r2
    }

    private final <I, O> void zaE(com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> r3, @androidx.annotation.Nullable I r4) {
            r2 = this;
            java.lang.String r0 = r3.zae
            java.lang.Object r4 = r3.zae(r4)
            int r1 = r3.zac
            switch(r1) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L51;
                case 3: goto Lb;
                case 4: goto L41;
                case 5: goto L3b;
                case 6: goto L2b;
                case 7: goto L25;
                case 8: goto L19;
                case 9: goto L19;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r4 = 44
            java.lang.String r0 = "Unsupported type for conversion: "
            java.lang.String r4 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r4, r0, r1)
            r3.<init>(r4)
            throw r3
        L19:
            if (r4 == 0) goto L21
            byte[] r4 = (byte[]) r4
            r2.setDecodedBytesInternal(r3, r4)
            return
        L21:
            zaG(r0)
            return
        L25:
            java.lang.String r4 = (java.lang.String) r4
            r2.setStringInternal(r3, r4)
            return
        L2b:
            if (r4 == 0) goto L37
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.setBooleanInternal(r3, r4)
            return
        L37:
            zaG(r0)
            return
        L3b:
            java.math.BigDecimal r4 = (java.math.BigDecimal) r4
            r2.zab(r3, r4)
            return
        L41:
            if (r4 == 0) goto L4d
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r2.zan(r3, r0)
            return
        L4d:
            zaG(r0)
            return
        L51:
            if (r4 == 0) goto L5d
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r2.setLongInternal(r3, r0)
            return
        L5d:
            zaG(r0)
            return
        L61:
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            r2.zaf(r3, r4)
            return
        L67:
            if (r4 == 0) goto L73
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setIntegerInternal(r3, r4)
            return
        L73:
            zaG(r0)
            return
    }

    private static final void zaF(java.lang.StringBuilder r2, com.google.android.gms.common.server.response.FastJsonResponse.Field r3, java.lang.Object r4) {
            int r0 = r3.zaa
            r1 = 11
            if (r0 == r1) goto L1f
            r3 = 7
            if (r0 != r3) goto L1b
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.google.android.gms.common.util.JsonUtils.escapeString(r4)
            r2.append(r4)
            r2.append(r3)
            return
        L1b:
            r2.append(r4)
            return
        L1f:
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r3 = r3.zag
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r3 = r3.cast(r4)
            com.google.android.gms.common.server.response.FastJsonResponse r3 = (com.google.android.gms.common.server.response.FastJsonResponse) r3
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            return
    }

    private static final <O> void zaG(java.lang.String r3) {
            java.lang.String r0 = "FastJsonResponse"
            r1 = 6
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L2c
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 58
            r2.<init>(r1)
            java.lang.String r1 = "Output field ("
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = ") has a null value, but expected a primitive"
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            android.util.Log.e(r0, r3)
        L2c:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.util.ArrayList<T> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Concrete type array not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull T r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Concrete type not supported"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings();

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public final java.lang.Object getFieldValue(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r6) {
            r5 = this;
            java.lang.String r0 = r6.zae
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> r1 = r6.zag
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.getValueObject(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r6 = r6.zae
            r4[r2] = r6
            java.lang.String r6 = "Concrete field shouldn't be value object: %s"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r6, r4)
            char r6 = r0.charAt(r2)     // Catch: java.lang.Exception -> L57
            char r6 = java.lang.Character.toUpperCase(r6)     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L57
            int r1 = r1.length()     // Catch: java.lang.Exception -> L57
            int r1 = r1 + 4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L57
            r3.<init>(r1)     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = "get"
            r3.append(r1)     // Catch: java.lang.Exception -> L57
            r3.append(r6)     // Catch: java.lang.Exception -> L57
            r3.append(r0)     // Catch: java.lang.Exception -> L57
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L57
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L57
            java.lang.reflect.Method r6 = r6.getMethod(r0, r1)     // Catch: java.lang.Exception -> L57
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L57
            java.lang.Object r6 = r6.invoke(r5, r0)     // Catch: java.lang.Exception -> L57
            return r6
        L57:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
        L5e:
            java.lang.Object r6 = r5.getValueObject(r0)
            return r6
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.Object getValueObject(@androidx.annotation.NonNull java.lang.String r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public final boolean isFieldSet(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r2 = this;
            int r0 = r3.zac
            r1 = 11
            if (r0 != r1) goto L1a
            boolean r3 = r3.zad
            if (r3 == 0) goto L12
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Concrete type arrays not supported"
            r3.<init>(r0)
            throw r3
        L12:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Concrete types not supported"
            r3.<init>(r0)
            throw r3
        L1a:
            java.lang.String r3 = r3.zae
            boolean r3 = r2.isPrimitiveFieldSet(r3)
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@androidx.annotation.NonNull java.lang.String r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setBooleanInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Boolean not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setDecodedBytesInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable byte[] r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "byte[] not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setIntegerInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, int r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Integer not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setLongInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Long not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setStringInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.lang.String r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "String not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setStringMapInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.Map r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "String map not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setStringsInternal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "String list not supported"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String toString() {
            r9 = this;
            java.util.Map r0 = r9.getFieldMappings()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            boolean r5 = r9.isFieldSet(r4)
            if (r5 == 0) goto L13
            java.lang.Object r5 = r9.getFieldValue(r4)
            java.lang.Object r5 = zaD(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L42
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L45
        L42:
            r1.append(r7)
        L45:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L5a
            java.lang.String r3 = "null"
            r1.append(r3)
            goto L13
        L5a:
            int r3 = r4.zac
            switch(r3) {
                case 8: goto L86;
                case 9: goto L76;
                case 10: goto L70;
                default: goto L5f;
            }
        L5f:
            boolean r3 = r4.zab
            if (r3 == 0) goto Lb1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            int r3 = r5.size()
            r6 = 0
            goto L97
        L70:
            java.util.HashMap r5 = (java.util.HashMap) r5
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r5)
            goto L13
        L76:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r5)
            r1.append(r3)
            r1.append(r6)
            goto L13
        L86:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r5)
            r1.append(r3)
            r1.append(r6)
            goto L13
        L97:
            if (r6 >= r3) goto Laa
            if (r6 <= 0) goto L9e
            r1.append(r7)
        L9e:
            java.lang.Object r8 = r5.get(r6)
            if (r8 == 0) goto La7
            zaF(r1, r4, r8)
        La7:
            int r6 = r6 + 1
            goto L97
        Laa:
            java.lang.String r3 = "]"
            r1.append(r3)
            goto L13
        Lb1:
            zaF(r1, r4, r5)
            goto L13
        Lb6:
            int r0 = r1.length()
            if (r0 <= 0) goto Lc3
            java.lang.String r0 = "}"
            r1.append(r0)
            goto Lc9
        Lc3:
            java.lang.String r0 = "{}"
            r1.append(r0)
        Lc9:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final <O> void zaA(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, O> r2, @androidx.annotation.Nullable java.lang.String r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.setStringInternal(r2, r3)
            return
    }

    public final <O> void zaB(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.Map<java.lang.String, java.lang.String>, O> r2, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.setStringMapInternal(r2, r3)
            return
    }

    public final <O> void zaC(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.lang.String> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.setStringsInternal(r2, r3)
            return
    }

    public final <O> void zaa(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.math.BigDecimal, O> r2, @androidx.annotation.Nullable java.math.BigDecimal r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zab(r2, r3)
            return
    }

    public void zab(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.math.BigDecimal r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigDecimal not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zac(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.math.BigDecimal>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.math.BigDecimal> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zad(r2, r3)
            return
    }

    public void zad(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigDecimal list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zae(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.math.BigInteger, O> r2, @androidx.annotation.Nullable java.math.BigInteger r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zaf(r2, r3)
            return
    }

    public void zaf(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.math.BigInteger r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigInteger not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zag(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.math.BigInteger>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.math.BigInteger> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zah(r2, r3)
            return
    }

    public void zah(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigInteger list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zai(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, O> r2, boolean r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            r1.setBooleanInternal(r2, r3)
            return
    }

    public final <O> void zaj(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Boolean>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.lang.Boolean> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zak(r2, r3)
            return
    }

    public void zak(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Boolean list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zal(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], O> r2, @androidx.annotation.Nullable byte[] r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.setDecodedBytesInternal(r2, r3)
            return
    }

    public final <O> void zam(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, O> r2, double r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            r1.zan(r2, r3)
            return
    }

    public void zan(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, double r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Double not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zao(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Double>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.lang.Double> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zap(r2, r3)
            return
    }

    public void zap(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Double list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zaq(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, O> r2, float r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            r1.zar(r2, r3)
            return
    }

    public void zar(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, float r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Float not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zas(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Float>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.lang.Float> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zat(r2, r3)
            return
    }

    public void zat(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Float list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zau(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, O> r2, int r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            r1.setIntegerInternal(r2, r3)
            return
    }

    public final <O> void zav(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Integer>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.lang.Integer> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zaw(r2, r3)
            return
    }

    public void zaw(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Integer list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final <O> void zax(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, O> r2, long r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            r1.setLongInternal(r2, r3)
            return
    }

    public final <O> void zay(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Long>, O> r2, @androidx.annotation.Nullable java.util.ArrayList<java.lang.Long> r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            r1.zaz(r2, r3)
            return
    }

    public void zaz(@androidx.annotation.NonNull com.google.android.gms.common.server.response.FastJsonResponse.Field r1, @androidx.annotation.Nullable java.util.ArrayList r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Long list not supported"
            r1.<init>(r2)
            throw r1
    }
}
