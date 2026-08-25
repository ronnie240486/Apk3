package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.annotation.KeepName
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.DataHolder> CREATOR = null;
    private static final com.google.android.gms.common.data.DataHolder.Builder zaf = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1000)
    public final int zaa;
    public android.os.Bundle zab;
    public int[] zac;
    public int zad;
    public boolean zae;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getColumns", id = 1)
    private final java.lang.String[] zag;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWindows", id = 2)
    private final android.database.CursorWindow[] zah;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final android.os.Bundle zaj;
    private boolean zak;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Builder {
        private final java.lang.String[] zaa;
        private final java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> zab;
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> zac;

        public /* synthetic */ Builder(java.lang.String[] r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r0.zaa = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zab = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.zac = r1
                return
        }

        public static /* bridge */ /* synthetic */ java.util.ArrayList zab(com.google.android.gms.common.data.DataHolder.Builder r0) {
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r0.zab
                return r0
        }

        public static /* bridge */ /* synthetic */ java.lang.String[] zac(com.google.android.gms.common.data.DataHolder.Builder r0) {
                java.lang.String[] r0 = r0.zaa
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.data.DataHolder build(int r2) {
                r1 = this;
                com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
                r0.<init>(r1, r2)
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.data.DataHolder build(int r8, @androidx.annotation.NonNull android.os.Bundle r9) {
                r7 = this;
                com.google.android.gms.common.data.DataHolder r6 = new com.google.android.gms.common.data.DataHolder
                r4 = -1
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.data.DataHolder.Builder withRow(@androidx.annotation.NonNull android.content.ContentValues r4) {
                r3 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r4)
                java.util.HashMap r0 = new java.util.HashMap
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Set r4 = r4.valueSet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r4.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r1 = r1.getValue()
                r0.put(r2, r1)
                goto L14
            L2e:
                com.google.android.gms.common.data.DataHolder$Builder r4 = r3.zaa(r0)
                return r4
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.common.data.DataHolder.Builder zaa(@androidx.annotation.NonNull java.util.HashMap<java.lang.String, java.lang.Object> r2) {
                r1 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r1.zab
                r0.add(r2)
                return r1
        }
    }

    static {
            com.google.android.gms.common.data.zaf r0 = new com.google.android.gms.common.data.zaf
            r0.<init>()
            com.google.android.gms.common.data.DataHolder.CREATOR = r0
            com.google.android.gms.common.data.zab r0 = new com.google.android.gms.common.data.zab
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.<init>(r1)
            com.google.android.gms.common.data.DataHolder.zaf = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public DataHolder(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1000) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.database.CursorWindow[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r5, @androidx.annotation.Nullable @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zae = r0
            r0 = 1
            r1.zak = r0
            r1.zaa = r2
            r1.zag = r3
            r1.zah = r4
            r1.zai = r5
            r1.zaj = r6
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public DataHolder(@androidx.annotation.NonNull android.database.Cursor r8, int r9, @androidx.annotation.Nullable android.os.Bundle r10) {
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L76
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L2e
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L2e
            r3.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            r1.add(r3)     // Catch: java.lang.Throwable -> L76
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L76
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 >= r2) goto L63
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L63
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L44
            r6.acquireReference()     // Catch: java.lang.Throwable -> L76
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L76
            goto L4f
        L44:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L76
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L76
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L76
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L76
        L4f:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            if (r3 != 0) goto L56
            goto L63
        L56:
            r1.add(r6)     // Catch: java.lang.Throwable -> L76
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L76
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + r6
            goto L2f
        L63:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L76:
            r8 = move-exception
            r0.close()
            throw r8
    }

    public /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder.Builder r2, int r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r1 = this;
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r2)
            r0 = -1
            android.database.CursorWindow[] r2 = zaf(r2, r0)
            r0 = 0
            r1.<init>(r4, r2, r3, r0)
            return
    }

    public /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder r1, int r2, android.os.Bundle r3, int r4, com.google.android.gms.common.data.zae r5) {
            r0 = this;
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r1)
            r5 = -1
            android.database.CursorWindow[] r1 = zaf(r1, r5)
            r0.<init>(r4, r1, r2, r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public DataHolder(@androidx.annotation.NonNull java.lang.String[] r2, @androidx.annotation.NonNull android.database.CursorWindow[] r3, int r4, @androidx.annotation.Nullable android.os.Bundle r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zae = r0
            r0 = 1
            r1.zak = r0
            r1.zaa = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.zag = r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.database.CursorWindow[] r2 = (android.database.CursorWindow[]) r2
            r1.zah = r2
            r1.zai = r4
            r1.zaj = r5
            r1.zad()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.data.DataHolder.Builder builder(@androidx.annotation.NonNull java.lang.String[] r1) {
            com.google.android.gms.common.data.DataHolder$Builder r0 = new com.google.android.gms.common.data.DataHolder$Builder
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.data.DataHolder empty(int r3) {
            com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
            com.google.android.gms.common.data.DataHolder$Builder r1 = com.google.android.gms.common.data.DataHolder.zaf
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    private final void zae(java.lang.String r3, int r4) {
            r2 = this;
            android.os.Bundle r0 = r2.zab
            if (r0 == 0) goto L28
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto Lb
            goto L28
        Lb:
            boolean r3 = r2.isClosed()
            if (r3 != 0) goto L20
            if (r4 < 0) goto L18
            int r3 = r2.zad
            if (r4 >= r3) goto L18
            return
        L18:
            android.database.CursorIndexOutOfBoundsException r3 = new android.database.CursorIndexOutOfBoundsException
            int r0 = r2.zad
            r3.<init>(r4, r0)
            throw r3
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Buffer is closed."
            r3.<init>(r4)
            throw r3
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "No such column: "
            int r1 = r3.length()
            if (r1 == 0) goto L3b
            java.lang.String r3 = r0.concat(r3)
            goto L40
        L3b:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L40:
            r4.<init>(r3)
            throw r4
    }

    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder r13, int r14) {
            java.lang.String[] r14 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)
            int r14 = r14.length
            r0 = 0
            if (r14 != 0) goto Lb
            android.database.CursorWindow[] r13 = new android.database.CursorWindow[r0]
            return r13
        Lb:
            java.util.ArrayList r14 = com.google.android.gms.common.data.DataHolder.Builder.zab(r13)
            int r1 = r14.size()
            android.database.CursorWindow r2 = new android.database.CursorWindow
            r2.<init>(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r2)
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)
            int r4 = r4.length
            r2.setNumColumns(r4)
            r4 = 0
            r5 = 0
        L2a:
            if (r4 >= r1) goto L199
            boolean r6 = r2.allocRow()     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r7 = "DataHolder"
            if (r6 != 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L185
            r6 = 72
            r2.<init>(r6)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r6 = "Allocating additional cursor window for large data set (row "
            r2.append(r6)     // Catch: java.lang.RuntimeException -> L185
            r2.append(r4)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r6 = ")"
            r2.append(r6)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r2 = r2.toString()     // Catch: java.lang.RuntimeException -> L185
            android.util.Log.d(r7, r2)     // Catch: java.lang.RuntimeException -> L185
            android.database.CursorWindow r2 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L185
            r2.<init>(r0)     // Catch: java.lang.RuntimeException -> L185
            r2.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String[] r6 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L185
            int r6 = r6.length     // Catch: java.lang.RuntimeException -> L185
            r2.setNumColumns(r6)     // Catch: java.lang.RuntimeException -> L185
            r3.add(r2)     // Catch: java.lang.RuntimeException -> L185
            boolean r6 = r2.allocRow()     // Catch: java.lang.RuntimeException -> L185
            if (r6 != 0) goto L7d
            java.lang.String r13 = "Unable to allocate row to hold data."
            android.util.Log.e(r7, r13)     // Catch: java.lang.RuntimeException -> L185
            r3.remove(r2)     // Catch: java.lang.RuntimeException -> L185
            int r13 = r3.size()     // Catch: java.lang.RuntimeException -> L185
            android.database.CursorWindow[] r13 = new android.database.CursorWindow[r13]     // Catch: java.lang.RuntimeException -> L185
            java.lang.Object[] r13 = r3.toArray(r13)     // Catch: java.lang.RuntimeException -> L185
            android.database.CursorWindow[] r13 = (android.database.CursorWindow[]) r13     // Catch: java.lang.RuntimeException -> L185
            return r13
        L7d:
            java.lang.Object r6 = r14.get(r4)     // Catch: java.lang.RuntimeException -> L185
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.RuntimeException -> L185
            r8 = 1
            r9 = 0
            r10 = 1
        L86:
            java.lang.String[] r11 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L185
            int r11 = r11.length     // Catch: java.lang.RuntimeException -> L185
            if (r9 >= r11) goto L140
            if (r10 == 0) goto L144
            java.lang.String[] r10 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L185
            r10 = r10[r9]     // Catch: java.lang.RuntimeException -> L185
            java.lang.Object r11 = r6.get(r10)     // Catch: java.lang.RuntimeException -> L185
            if (r11 != 0) goto La1
            boolean r10 = r2.putNull(r4, r9)     // Catch: java.lang.RuntimeException -> L185
            goto L10a
        La1:
            boolean r12 = r11 instanceof java.lang.String     // Catch: java.lang.RuntimeException -> L185
            if (r12 == 0) goto Lac
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.RuntimeException -> L185
            boolean r10 = r2.putString(r11, r4, r9)     // Catch: java.lang.RuntimeException -> L185
            goto L10a
        Lac:
            boolean r12 = r11 instanceof java.lang.Long     // Catch: java.lang.RuntimeException -> L185
            if (r12 == 0) goto Lbb
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.RuntimeException -> L185
            long r10 = r11.longValue()     // Catch: java.lang.RuntimeException -> L185
            boolean r10 = r2.putLong(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L185
            goto L10a
        Lbb:
            boolean r12 = r11 instanceof java.lang.Integer     // Catch: java.lang.RuntimeException -> L185
            if (r12 == 0) goto Lcb
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.RuntimeException -> L185
            int r10 = r11.intValue()     // Catch: java.lang.RuntimeException -> L185
            long r10 = (long) r10     // Catch: java.lang.RuntimeException -> L185
            boolean r10 = r2.putLong(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L185
            goto L10a
        Lcb:
            boolean r12 = r11 instanceof java.lang.Boolean     // Catch: java.lang.RuntimeException -> L185
            if (r12 == 0) goto Le1
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.RuntimeException -> L185
            boolean r10 = r11.booleanValue()     // Catch: java.lang.RuntimeException -> L185
            if (r8 == r10) goto Lda
            r10 = 0
            goto Ldc
        Lda:
            r10 = 1
        Ldc:
            boolean r10 = r2.putLong(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L185
            goto L10a
        Le1:
            boolean r12 = r11 instanceof byte[]     // Catch: java.lang.RuntimeException -> L185
            if (r12 == 0) goto Lec
            byte[] r11 = (byte[]) r11     // Catch: java.lang.RuntimeException -> L185
            boolean r10 = r2.putBlob(r11, r4, r9)     // Catch: java.lang.RuntimeException -> L185
            goto L10a
        Lec:
            boolean r12 = r11 instanceof java.lang.Double     // Catch: java.lang.RuntimeException -> L185
            if (r12 == 0) goto Lfb
            java.lang.Double r11 = (java.lang.Double) r11     // Catch: java.lang.RuntimeException -> L185
            double r10 = r11.doubleValue()     // Catch: java.lang.RuntimeException -> L185
            boolean r10 = r2.putDouble(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L185
            goto L10a
        Lfb:
            boolean r12 = r11 instanceof java.lang.Float     // Catch: java.lang.RuntimeException -> L185
            if (r12 == 0) goto L10e
            java.lang.Float r11 = (java.lang.Float) r11     // Catch: java.lang.RuntimeException -> L185
            float r10 = r11.floatValue()     // Catch: java.lang.RuntimeException -> L185
            double r10 = (double) r10     // Catch: java.lang.RuntimeException -> L185
            boolean r10 = r2.putDouble(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L185
        L10a:
            int r9 = r9 + 1
            goto L86
        L10e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r14 = r11.toString()     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch: java.lang.RuntimeException -> L185
            int r1 = r1.length()     // Catch: java.lang.RuntimeException -> L185
            int r1 = r1 + 32
            int r2 = r14.length()     // Catch: java.lang.RuntimeException -> L185
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L185
            r2.<init>(r1)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r1 = "Unsupported object for column "
            r2.append(r1)     // Catch: java.lang.RuntimeException -> L185
            r2.append(r10)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r1 = ": "
            r2.append(r1)     // Catch: java.lang.RuntimeException -> L185
            r2.append(r14)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r14 = r2.toString()     // Catch: java.lang.RuntimeException -> L185
            r13.<init>(r14)     // Catch: java.lang.RuntimeException -> L185
            throw r13     // Catch: java.lang.RuntimeException -> L185
        L140:
            if (r10 == 0) goto L144
            r5 = 0
            goto L17a
        L144:
            if (r5 != 0) goto L17d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L185
            r6 = 74
            r5.<init>(r6)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r6 = "Couldn't populate window data for row "
            r5.append(r6)     // Catch: java.lang.RuntimeException -> L185
            r5.append(r4)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r6 = " - allocating new window."
            r5.append(r6)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String r5 = r5.toString()     // Catch: java.lang.RuntimeException -> L185
            android.util.Log.d(r7, r5)     // Catch: java.lang.RuntimeException -> L185
            r2.freeLastRow()     // Catch: java.lang.RuntimeException -> L185
            android.database.CursorWindow r2 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L185
            r2.<init>(r0)     // Catch: java.lang.RuntimeException -> L185
            r2.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L185
            java.lang.String[] r5 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L185
            int r5 = r5.length     // Catch: java.lang.RuntimeException -> L185
            r2.setNumColumns(r5)     // Catch: java.lang.RuntimeException -> L185
            r3.add(r2)     // Catch: java.lang.RuntimeException -> L185
            int r4 = r4 + (-1)
            r5 = 1
        L17a:
            int r4 = r4 + r8
            goto L2a
        L17d:
            java.lang.String r13 = "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle."
            com.google.android.gms.common.data.zad r14 = new com.google.android.gms.common.data.zad     // Catch: java.lang.RuntimeException -> L185
            r14.<init>(r13)     // Catch: java.lang.RuntimeException -> L185
            throw r14     // Catch: java.lang.RuntimeException -> L185
        L185:
            r13 = move-exception
            int r14 = r3.size()
        L18a:
            if (r0 >= r14) goto L198
            java.lang.Object r1 = r3.get(r0)
            android.database.CursorWindow r1 = (android.database.CursorWindow) r1
            r1.close()
            int r0 = r0 + 1
            goto L18a
        L198:
            throw r13
        L199:
            int r13 = r3.size()
            android.database.CursorWindow[] r13 = new android.database.CursorWindow[r13]
            java.lang.Object[] r13 = r3.toArray(r13)
            android.database.CursorWindow[] r13 = (android.database.CursorWindow[]) r13
            return r13
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @com.google.android.gms.common.annotation.KeepForSdk
    public void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zae     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L16
            r0 = 1
            r3.zae = r0     // Catch: java.lang.Throwable -> L18
            r0 = 0
        L9:
            android.database.CursorWindow[] r1 = r3.zah     // Catch: java.lang.Throwable -> L18
            int r2 = r1.length     // Catch: java.lang.Throwable -> L18
            if (r0 >= r2) goto L16
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L18
            r1.close()     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 1
            goto L9
        L16:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public final void finalize() throws java.lang.Throwable {
            r4 = this;
            boolean r0 = r4.zak     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3b
            android.database.CursorWindow[] r0 = r4.zah     // Catch: java.lang.Throwable -> L3f
            int r0 = r0.length     // Catch: java.lang.Throwable -> L3f
            if (r0 <= 0) goto L3b
            boolean r0 = r4.isClosed()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L3b
            r4.close()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "DataBuffer"
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L3f
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L3f
            int r2 = r2 + 178
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L3f
            r3.append(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = ")"
            r3.append(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L3f
        L3b:
            super.finalize()
            return
        L3f:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean getBoolean(@androidx.annotation.NonNull java.lang.String r3, int r4, int r5) {
            r2 = this;
            r2.zae(r3, r4)
            android.database.CursorWindow[] r0 = r2.zah
            r5 = r0[r5]
            android.os.Bundle r0 = r2.zab
            int r3 = r0.getInt(r3)
            long r3 = r5.getLong(r4, r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r3 = r3.longValue()
            r0 = 1
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L21
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public byte[] getByteArray(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            byte[] r2 = r4.getBlob(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getCount() {
            r1 = this;
            int r0 = r1.zad
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getInteger(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            int r2 = r4.getInt(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public long getLong(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            long r2 = r4.getLong(r3, r2)
            return r2
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Bundle getMetadata() {
            r1 = this;
            android.os.Bundle r0 = r1.zaj
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getStatusCode() {
            r1 = this;
            int r0 = r1.zai
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getString(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            java.lang.String r2 = r4.getString(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int getWindowIndex(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L9
            int r1 = r3.zad
            if (r4 >= r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
        Ld:
            int[] r1 = r3.zac
            int r2 = r1.length
            if (r0 >= r2) goto L1c
            r1 = r1[r0]
            if (r4 >= r1) goto L19
            int r0 = r0 + (-1)
            goto L1c
        L19:
            int r0 = r0 + 1
            goto Ld
        L1c:
            if (r0 != r2) goto L20
            int r0 = r0 + (-1)
        L20:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasColumn(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.zab
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasNull(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            boolean r2 = r4.isNull(r3, r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zae     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            java.lang.String[] r1 = r5.zag
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r6, r2, r1, r3)
            android.database.CursorWindow[] r1 = r5.zah
            r4 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r6, r4, r1, r7, r3)
            int r1 = r5.getStatusCode()
            r4 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r4, r1)
            android.os.Bundle r1 = r5.getMetadata()
            r4 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r6, r4, r1, r3)
            int r1 = r5.zaa
            r3 = 1000(0x3e8, float:1.401E-42)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r3, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            r6 = r7 & 1
            if (r6 == 0) goto L32
            r5.close()
        L32:
            return
    }

    public final double zaa(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            double r2 = r4.getDouble(r3, r2)
            return r2
    }

    public final float zab(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            float r2 = r4.getFloat(r3, r2)
            return r2
    }

    public final void zac(@androidx.annotation.NonNull java.lang.String r2, int r3, int r4, @androidx.annotation.NonNull android.database.CharArrayBuffer r5) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r0 = r1.zab
            int r2 = r0.getInt(r2)
            r4.copyStringToBuffer(r3, r2, r5)
            return
    }

    public final void zad() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r4.zab = r0
            r0 = 0
            r1 = 0
        L9:
            java.lang.String[] r2 = r4.zag
            int r3 = r2.length
            if (r1 >= r3) goto L18
            android.os.Bundle r3 = r4.zab
            r2 = r2[r1]
            r3.putInt(r2, r1)
            int r1 = r1 + 1
            goto L9
        L18:
            android.database.CursorWindow[] r1 = r4.zah
            int r1 = r1.length
            int[] r1 = new int[r1]
            r4.zac = r1
            r1 = 0
        L20:
            android.database.CursorWindow[] r2 = r4.zah
            int r3 = r2.length
            if (r0 >= r3) goto L3e
            int[] r3 = r4.zac
            r3[r0] = r1
            r2 = r2[r0]
            int r2 = r2.getStartPosition()
            android.database.CursorWindow[] r3 = r4.zah
            r3 = r3[r0]
            int r3 = r3.getNumRows()
            int r2 = r1 - r2
            int r3 = r3 - r2
            int r1 = r1 + r3
            int r0 = r0 + 1
            goto L20
        L3e:
            r4.zad = r1
            return
    }
}
