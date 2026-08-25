package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.util.VisibleForTesting
@com.google.android.gms.common.annotation.KeepForSdk
public final class ArrayUtils {
    private ArrayUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T[] concat(@androidx.annotation.NonNull T[]... r6) {
            int r0 = r6.length
            r1 = 0
            if (r0 == 0) goto L28
            r0 = 0
            r2 = 0
        L6:
            int r3 = r6.length
            if (r0 >= r3) goto L10
            r3 = r6[r0]
            int r3 = r3.length
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto L6
        L10:
            r0 = r6[r1]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            r2 = r6[r1]
            int r2 = r2.length
            r3 = 1
        L1a:
            int r4 = r6.length
            if (r3 >= r4) goto L27
            r4 = r6[r3]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r2, r5)
            int r2 = r2 + r5
            int r3 = r3 + 1
            goto L1a
        L27:
            return r0
        L28:
            java.lang.Class r6 = r6.getClass()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r1)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            return r6
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static byte[] concatByteArrays(@androidx.annotation.NonNull byte[]... r6) {
            int r0 = r6.length
            r1 = 0
            if (r0 == 0) goto L28
            r0 = 0
            r2 = 0
        L6:
            int r3 = r6.length
            if (r0 >= r3) goto L10
            r3 = r6[r0]
            int r3 = r3.length
            int r2 = r2 + r3
            int r0 = r0 + 1
            goto L6
        L10:
            r0 = r6[r1]
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            r2 = r6[r1]
            int r2 = r2.length
            r3 = 1
        L1a:
            int r4 = r6.length
            if (r3 >= r4) goto L27
            r4 = r6[r3]
            int r5 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r2, r5)
            int r2 = r2 + r5
            int r3 = r3 + 1
            goto L1a
        L27:
            return r0
        L28:
            byte[] r6 = new byte[r1]
            return r6
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean contains(@androidx.annotation.NonNull int[] r4, int r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L11
            r3 = r4[r2]
            if (r3 != r5) goto Le
            r4 = 1
            return r4
        Le:
            int r2 = r2 + 1
            goto L6
        L11:
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> boolean contains(@androidx.annotation.NonNull T[] r4, @androidx.annotation.NonNull T r5) {
            r0 = 0
            if (r4 == 0) goto L5
            int r1 = r4.length
            goto L6
        L5:
            r1 = 0
        L6:
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r4[r2]
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r5)
            if (r3 == 0) goto L15
            if (r2 < 0) goto L18
            r4 = 1
            return r4
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> java.util.ArrayList<T> newArrayList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T[] removeAll(@androidx.annotation.NonNull T[] r8, @androidx.annotation.NonNull T... r9) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            if (r9 == 0) goto L54
            int r1 = r9.length
            if (r1 != 0) goto La
            goto L54
        La:
            java.lang.Class r2 = r9.getClass()
            java.lang.Class r2 = r2.getComponentType()
            int r3 = r8.length
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            r5 = 1
            if (r1 != r5) goto L33
            r1 = 0
            r5 = 0
        L1f:
            if (r1 >= r3) goto L47
            r6 = r8[r1]
            r7 = r9[r4]
            boolean r7 = com.google.android.gms.common.internal.Objects.equal(r7, r6)
            if (r7 != 0) goto L30
            int r7 = r5 + 1
            r2[r5] = r6
            r5 = r7
        L30:
            int r1 = r1 + 1
            goto L1f
        L33:
            r1 = 0
        L34:
            if (r4 >= r3) goto L46
            r5 = r8[r4]
            boolean r6 = contains(r9, r5)
            if (r6 != 0) goto L43
            int r6 = r1 + 1
            r2[r1] = r5
            r1 = r6
        L43:
            int r4 = r4 + 1
            goto L34
        L46:
            r5 = r1
        L47:
            if (r2 != 0) goto L4a
            goto L4e
        L4a:
            int r8 = r2.length
            if (r5 != r8) goto L4f
            r0 = r2
        L4e:
            return r0
        L4f:
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r2, r5)
            return r8
        L54:
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            return r8
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> java.util.ArrayList<T> toArrayList(@androidx.annotation.NonNull T[] r4) {
            int r0 = r4.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L7:
            if (r2 >= r0) goto L11
            r3 = r4[r2]
            r1.add(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            return r1
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static int[] toPrimitiveArray(@androidx.annotation.NonNull java.util.Collection<java.lang.Integer> r4) {
            r0 = 0
            if (r4 == 0) goto L2b
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L2b
        La:
            int r1 = r4.size()
            int[] r1 = new int[r1]
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2a
            int r2 = r0 + 1
            java.lang.Object r3 = r4.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1[r0] = r3
            r0 = r2
            goto L14
        L2a:
            return r1
        L2b:
            int[] r4 = new int[r0]
            return r4
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.Integer[] toWrapperArray(@androidx.annotation.NonNull int[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r2 = 0
        L8:
            if (r2 >= r0) goto L15
            r3 = r4[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L8
        L15:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeArray(@androidx.annotation.NonNull java.lang.StringBuilder r4, @androidx.annotation.NonNull double[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L17
            if (r1 == 0) goto Lb
            java.lang.String r2 = ","
            r4.append(r2)
        Lb:
            r2 = r5[r1]
            java.lang.String r2 = java.lang.Double.toString(r2)
            r4.append(r2)
            int r1 = r1 + 1
            goto L2
        L17:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeArray(@androidx.annotation.NonNull java.lang.StringBuilder r3, @androidx.annotation.NonNull float[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L17
            if (r1 == 0) goto Lb
            java.lang.String r2 = ","
            r3.append(r2)
        Lb:
            r2 = r4[r1]
            java.lang.String r2 = java.lang.Float.toString(r2)
            r3.append(r2)
            int r1 = r1 + 1
            goto L2
        L17:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeArray(@androidx.annotation.NonNull java.lang.StringBuilder r3, @androidx.annotation.NonNull int[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L17
            if (r1 == 0) goto Lb
            java.lang.String r2 = ","
            r3.append(r2)
        Lb:
            r2 = r4[r1]
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r3.append(r2)
            int r1 = r1 + 1
            goto L2
        L17:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeArray(@androidx.annotation.NonNull java.lang.StringBuilder r4, @androidx.annotation.NonNull long[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L17
            if (r1 == 0) goto Lb
            java.lang.String r2 = ","
            r4.append(r2)
        Lb:
            r2 = r5[r1]
            java.lang.String r2 = java.lang.Long.toString(r2)
            r4.append(r2)
            int r1 = r1 + 1
            goto L2
        L17:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> void writeArray(@androidx.annotation.NonNull java.lang.StringBuilder r3, @androidx.annotation.NonNull T[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L13
            if (r1 == 0) goto Lb
            java.lang.String r2 = ","
            r3.append(r2)
        Lb:
            r2 = r4[r1]
            r3.append(r2)
            int r1 = r1 + 1
            goto L2
        L13:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeArray(@androidx.annotation.NonNull java.lang.StringBuilder r3, @androidx.annotation.NonNull boolean[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L17
            if (r1 == 0) goto Lb
            java.lang.String r2 = ","
            r3.append(r2)
        Lb:
            boolean r2 = r4[r1]
            java.lang.String r2 = java.lang.Boolean.toString(r2)
            r3.append(r2)
            int r1 = r1 + 1
            goto L2
        L17:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void writeStringArray(@androidx.annotation.NonNull java.lang.StringBuilder r4, @androidx.annotation.NonNull java.lang.String[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1b
            if (r1 == 0) goto Lb
            java.lang.String r2 = ","
            r4.append(r2)
        Lb:
            java.lang.String r2 = "\""
            r4.append(r2)
            r3 = r5[r1]
            r4.append(r3)
            r4.append(r2)
            int r1 = r1 + 1
            goto L2
        L1b:
            return
    }
}
