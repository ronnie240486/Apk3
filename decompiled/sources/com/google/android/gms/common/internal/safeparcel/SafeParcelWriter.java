package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int beginObjectHeader(@androidx.annotation.NonNull android.os.Parcel r1) {
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r1 = zza(r1, r0)
            return r1
    }

    public static void finishObjectHeader(@androidx.annotation.NonNull android.os.Parcel r0, int r1) {
            zzb(r0, r1)
            return
    }

    public static void writeBigDecimal(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.math.BigDecimal r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            java.math.BigInteger r3 = r2.unscaledValue()
            byte[] r3 = r3.toByteArray()
            r0.writeByteArray(r3)
            int r2 = r2.scale()
            r0.writeInt(r2)
            zzb(r0, r1)
            return
    }

    public static void writeBigDecimalArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull java.math.BigDecimal[] r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.length
            r2.writeInt(r5)
        L11:
            if (r0 >= r5) goto L2c
            r1 = r4[r0]
            java.math.BigInteger r1 = r1.unscaledValue()
            byte[] r1 = r1.toByteArray()
            r2.writeByteArray(r1)
            r1 = r4[r0]
            int r1 = r1.scale()
            r2.writeInt(r1)
            int r0 = r0 + 1
            goto L11
        L2c:
            zzb(r2, r3)
            return
    }

    public static void writeBigInteger(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.math.BigInteger r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            byte[] r2 = r2.toByteArray()
            r0.writeByteArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeBigIntegerArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull java.math.BigInteger[] r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.length
            r2.writeInt(r5)
        L11:
            if (r0 >= r5) goto L1f
            r1 = r4[r0]
            byte[] r1 = r1.toByteArray()
            r2.writeByteArray(r1)
            int r0 = r0 + 1
            goto L11
        L1f:
            zzb(r2, r3)
            return
    }

    public static void writeBoolean(@androidx.annotation.NonNull android.os.Parcel r1, int r2, boolean r3) {
            r0 = 4
            zzc(r1, r2, r0)
            r1.writeInt(r3)
            return
    }

    public static void writeBooleanArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull boolean[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeBooleanArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeBooleanList(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull java.util.List<java.lang.Boolean> r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L26
            java.lang.Object r1 = r4.get(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2.writeInt(r1)
            int r0 = r0 + 1
            goto L14
        L26:
            zzb(r2, r3)
            return
    }

    public static void writeBooleanObject(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.lang.Boolean r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            r3 = 4
            zzc(r0, r1, r3)
            boolean r1 = r2.booleanValue()
            r0.writeInt(r1)
            return
    }

    public static void writeBundle(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull android.os.Bundle r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeBundle(r2)
            zzb(r0, r1)
            return
    }

    public static void writeByte(@androidx.annotation.NonNull android.os.Parcel r1, int r2, byte r3) {
            r0 = 4
            zzc(r1, r2, r0)
            r1.writeInt(r3)
            return
    }

    public static void writeByteArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull byte[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeByteArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeByteArrayArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull byte[][] r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.length
            r2.writeInt(r5)
        L11:
            if (r0 >= r5) goto L1b
            r1 = r4[r0]
            r2.writeByteArray(r1)
            int r0 = r0 + 1
            goto L11
        L1b:
            zzb(r2, r3)
            return
    }

    public static void writeByteArraySparseArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull android.util.SparseArray<byte[]> r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L29
            int r1 = r4.keyAt(r0)
            r2.writeInt(r1)
            java.lang.Object r1 = r4.valueAt(r0)
            byte[] r1 = (byte[]) r1
            r2.writeByteArray(r1)
            int r0 = r0 + 1
            goto L14
        L29:
            zzb(r2, r3)
            return
    }

    public static void writeChar(@androidx.annotation.NonNull android.os.Parcel r1, int r2, char r3) {
            r0 = 4
            zzc(r1, r2, r0)
            r1.writeInt(r3)
            return
    }

    public static void writeCharArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull char[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeCharArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeDouble(@androidx.annotation.NonNull android.os.Parcel r1, int r2, double r3) {
            r0 = 8
            zzc(r1, r2, r0)
            r1.writeDouble(r3)
            return
    }

    public static void writeDoubleArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull double[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeDoubleArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeDoubleList(@androidx.annotation.NonNull android.os.Parcel r3, int r4, @androidx.annotation.NonNull java.util.List<java.lang.Double> r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            zzc(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = zza(r3, r4)
            int r6 = r5.size()
            r3.writeInt(r6)
        L14:
            if (r0 >= r6) goto L26
            java.lang.Object r1 = r5.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r3.writeDouble(r1)
            int r0 = r0 + 1
            goto L14
        L26:
            zzb(r3, r4)
            return
    }

    public static void writeDoubleObject(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.lang.Double r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            r3 = 8
            zzc(r0, r1, r3)
            double r1 = r2.doubleValue()
            r0.writeDouble(r1)
            return
    }

    public static void writeDoubleSparseArray(@androidx.annotation.NonNull android.os.Parcel r3, int r4, @androidx.annotation.NonNull android.util.SparseArray<java.lang.Double> r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            zzc(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = zza(r3, r4)
            int r6 = r5.size()
            r3.writeInt(r6)
        L14:
            if (r0 >= r6) goto L2d
            int r1 = r5.keyAt(r0)
            r3.writeInt(r1)
            java.lang.Object r1 = r5.valueAt(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r3.writeDouble(r1)
            int r0 = r0 + 1
            goto L14
        L2d:
            zzb(r3, r4)
            return
    }

    public static void writeFloat(@androidx.annotation.NonNull android.os.Parcel r1, int r2, float r3) {
            r0 = 4
            zzc(r1, r2, r0)
            r1.writeFloat(r3)
            return
    }

    public static void writeFloatArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull float[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeFloatArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeFloatList(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull java.util.List<java.lang.Float> r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L26
            java.lang.Object r1 = r4.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2.writeFloat(r1)
            int r0 = r0 + 1
            goto L14
        L26:
            zzb(r2, r3)
            return
    }

    public static void writeFloatObject(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.lang.Float r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            r3 = 4
            zzc(r0, r1, r3)
            float r1 = r2.floatValue()
            r0.writeFloat(r1)
            return
    }

    public static void writeFloatSparseArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull android.util.SparseArray<java.lang.Float> r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L2d
            int r1 = r4.keyAt(r0)
            r2.writeInt(r1)
            java.lang.Object r1 = r4.valueAt(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2.writeFloat(r1)
            int r0 = r0 + 1
            goto L14
        L2d:
            zzb(r2, r3)
            return
    }

    public static void writeIBinder(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull android.os.IBinder r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeStrongBinder(r2)
            zzb(r0, r1)
            return
    }

    public static void writeIBinderArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull android.os.IBinder[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeBinderArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeIBinderList(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.util.List<android.os.IBinder> r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeBinderList(r2)
            zzb(r0, r1)
            return
    }

    public static void writeIBinderSparseArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull android.util.SparseArray<android.os.IBinder> r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L29
            int r1 = r4.keyAt(r0)
            r2.writeInt(r1)
            java.lang.Object r1 = r4.valueAt(r0)
            android.os.IBinder r1 = (android.os.IBinder) r1
            r2.writeStrongBinder(r1)
            int r0 = r0 + 1
            goto L14
        L29:
            zzb(r2, r3)
            return
    }

    public static void writeInt(@androidx.annotation.NonNull android.os.Parcel r1, int r2, int r3) {
            r0 = 4
            zzc(r1, r2, r0)
            r1.writeInt(r3)
            return
    }

    public static void writeIntArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull int[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeIntArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeIntegerList(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull java.util.List<java.lang.Integer> r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L26
            java.lang.Object r1 = r4.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.writeInt(r1)
            int r0 = r0 + 1
            goto L14
        L26:
            zzb(r2, r3)
            return
    }

    public static void writeIntegerObject(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.lang.Integer r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            r3 = 4
            zzc(r0, r1, r3)
            int r1 = r2.intValue()
            r0.writeInt(r1)
            return
    }

    public static void writeList(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.util.List r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeList(r2)
            zzb(r0, r1)
            return
    }

    public static void writeLong(@androidx.annotation.NonNull android.os.Parcel r1, int r2, long r3) {
            r0 = 8
            zzc(r1, r2, r0)
            r1.writeLong(r3)
            return
    }

    public static void writeLongArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull long[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeLongArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeLongList(@androidx.annotation.NonNull android.os.Parcel r3, int r4, @androidx.annotation.NonNull java.util.List<java.lang.Long> r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            zzc(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = zza(r3, r4)
            int r6 = r5.size()
            r3.writeInt(r6)
        L14:
            if (r0 >= r6) goto L26
            java.lang.Object r1 = r5.get(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.writeLong(r1)
            int r0 = r0 + 1
            goto L14
        L26:
            zzb(r3, r4)
            return
    }

    public static void writeLongObject(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.lang.Long r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            r3 = 8
            zzc(r0, r1, r3)
            long r1 = r2.longValue()
            r0.writeLong(r1)
            return
    }

    public static void writeParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2, @androidx.annotation.NonNull android.os.Parcel r3, boolean r4) {
            r0 = 0
            if (r3 != 0) goto L9
            if (r4 == 0) goto L8
            zzc(r1, r2, r0)
        L8:
            return
        L9:
            int r2 = zza(r1, r2)
            int r4 = r3.dataSize()
            r1.appendFrom(r3, r0, r4)
            zzb(r1, r2)
            return
    }

    public static void writeParcelArray(@androidx.annotation.NonNull android.os.Parcel r4, int r5, @androidx.annotation.NonNull android.os.Parcel[] r6, boolean r7) {
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            zzc(r4, r5, r0)
        L8:
            return
        L9:
            int r5 = zza(r4, r5)
            int r7 = r6.length
            r4.writeInt(r7)
            r1 = 0
        L12:
            if (r1 >= r7) goto L2d
            r2 = r6[r1]
            if (r2 == 0) goto L27
            int r3 = r2.dataSize()
            r4.writeInt(r3)
            int r3 = r2.dataSize()
            r4.appendFrom(r2, r0, r3)
            goto L2a
        L27:
            r4.writeInt(r0)
        L2a:
            int r1 = r1 + 1
            goto L12
        L2d:
            zzb(r4, r5)
            return
    }

    public static void writeParcelList(@androidx.annotation.NonNull android.os.Parcel r4, int r5, @androidx.annotation.NonNull java.util.List<android.os.Parcel> r6, boolean r7) {
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            zzc(r4, r5, r0)
        L8:
            return
        L9:
            int r5 = zza(r4, r5)
            int r7 = r6.size()
            r4.writeInt(r7)
            r1 = 0
        L15:
            if (r1 >= r7) goto L34
            java.lang.Object r2 = r6.get(r1)
            android.os.Parcel r2 = (android.os.Parcel) r2
            if (r2 == 0) goto L2e
            int r3 = r2.dataSize()
            r4.writeInt(r3)
            int r3 = r2.dataSize()
            r4.appendFrom(r2, r0, r3)
            goto L31
        L2e:
            r4.writeInt(r0)
        L31:
            int r1 = r1 + 1
            goto L15
        L34:
            zzb(r4, r5)
            return
    }

    public static void writeParcelSparseArray(@androidx.annotation.NonNull android.os.Parcel r4, int r5, @androidx.annotation.NonNull android.util.SparseArray<android.os.Parcel> r6, boolean r7) {
            r0 = 0
            if (r6 != 0) goto L9
            if (r7 == 0) goto L8
            zzc(r4, r5, r0)
        L8:
            return
        L9:
            int r5 = zza(r4, r5)
            int r7 = r6.size()
            r4.writeInt(r7)
            r1 = 0
        L15:
            if (r1 >= r7) goto L3b
            int r2 = r6.keyAt(r1)
            r4.writeInt(r2)
            java.lang.Object r2 = r6.valueAt(r1)
            android.os.Parcel r2 = (android.os.Parcel) r2
            if (r2 == 0) goto L35
            int r3 = r2.dataSize()
            r4.writeInt(r3)
            int r3 = r2.dataSize()
            r4.appendFrom(r2, r0, r3)
            goto L38
        L35:
            r4.writeInt(r0)
        L38:
            int r1 = r1 + 1
            goto L15
        L3b:
            zzb(r4, r5)
            return
    }

    public static void writeParcelable(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull android.os.Parcelable r2, int r3, boolean r4) {
            if (r2 != 0) goto L9
            if (r4 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r2.writeToParcel(r0, r3)
            zzb(r0, r1)
            return
    }

    public static void writePendingIntent(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull android.app.PendingIntent r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            android.app.PendingIntent.writePendingIntentOrNullToParcel(r2, r0)
            zzb(r0, r1)
            return
    }

    public static void writeShort(@androidx.annotation.NonNull android.os.Parcel r1, int r2, short r3) {
            r0 = 4
            zzc(r1, r2, r0)
            r1.writeInt(r3)
            return
    }

    public static void writeSparseBooleanArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull android.util.SparseBooleanArray r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeSparseBooleanArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeSparseIntArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull android.util.SparseIntArray r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L27
            int r1 = r4.keyAt(r0)
            r2.writeInt(r1)
            int r1 = r4.valueAt(r0)
            r2.writeInt(r1)
            int r0 = r0 + 1
            goto L14
        L27:
            zzb(r2, r3)
            return
    }

    public static void writeSparseLongArray(@androidx.annotation.NonNull android.os.Parcel r3, int r4, @androidx.annotation.NonNull android.util.SparseLongArray r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            zzc(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = zza(r3, r4)
            int r6 = r5.size()
            r3.writeInt(r6)
        L14:
            if (r0 >= r6) goto L27
            int r1 = r5.keyAt(r0)
            r3.writeInt(r1)
            long r1 = r5.valueAt(r0)
            r3.writeLong(r1)
            int r0 = r0 + 1
            goto L14
        L27:
            zzb(r3, r4)
            return
    }

    public static void writeString(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeString(r2)
            zzb(r0, r1)
            return
    }

    public static void writeStringArray(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.lang.String[] r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeStringArray(r2)
            zzb(r0, r1)
            return
    }

    public static void writeStringList(@androidx.annotation.NonNull android.os.Parcel r0, int r1, @androidx.annotation.NonNull java.util.List<java.lang.String> r2, boolean r3) {
            if (r2 != 0) goto L9
            if (r3 == 0) goto L8
            r2 = 0
            zzc(r0, r1, r2)
        L8:
            return
        L9:
            int r1 = zza(r0, r1)
            r0.writeStringList(r2)
            zzb(r0, r1)
            return
    }

    public static void writeStringSparseArray(@androidx.annotation.NonNull android.os.Parcel r2, int r3, @androidx.annotation.NonNull android.util.SparseArray<java.lang.String> r4, boolean r5) {
            r0 = 0
            if (r4 != 0) goto L9
            if (r5 == 0) goto L8
            zzc(r2, r3, r0)
        L8:
            return
        L9:
            int r3 = zza(r2, r3)
            int r5 = r4.size()
            r2.writeInt(r5)
        L14:
            if (r0 >= r5) goto L29
            int r1 = r4.keyAt(r0)
            r2.writeInt(r1)
            java.lang.Object r1 = r4.valueAt(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2.writeString(r1)
            int r0 = r0 + 1
            goto L14
        L29:
            zzb(r2, r3)
            return
    }

    public static <T extends android.os.Parcelable> void writeTypedArray(@androidx.annotation.NonNull android.os.Parcel r3, int r4, @androidx.annotation.NonNull T[] r5, int r6, boolean r7) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r7 == 0) goto L8
            zzc(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = zza(r3, r4)
            int r7 = r5.length
            r3.writeInt(r7)
            r1 = 0
        L12:
            if (r1 >= r7) goto L22
            r2 = r5[r1]
            if (r2 != 0) goto L1c
            r3.writeInt(r0)
            goto L1f
        L1c:
            zzd(r3, r2, r6)
        L1f:
            int r1 = r1 + 1
            goto L12
        L22:
            zzb(r3, r4)
            return
    }

    public static <T extends android.os.Parcelable> void writeTypedList(@androidx.annotation.NonNull android.os.Parcel r3, int r4, @androidx.annotation.NonNull java.util.List<T> r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            zzc(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = zza(r3, r4)
            int r6 = r5.size()
            r3.writeInt(r6)
            r1 = 0
        L15:
            if (r1 >= r6) goto L29
            java.lang.Object r2 = r5.get(r1)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            if (r2 != 0) goto L23
            r3.writeInt(r0)
            goto L26
        L23:
            zzd(r3, r2, r0)
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            zzb(r3, r4)
            return
    }

    public static <T extends android.os.Parcelable> void writeTypedSparseArray(@androidx.annotation.NonNull android.os.Parcel r3, int r4, @androidx.annotation.NonNull android.util.SparseArray<T> r5, boolean r6) {
            r0 = 0
            if (r5 != 0) goto L9
            if (r6 == 0) goto L8
            zzc(r3, r4, r0)
        L8:
            return
        L9:
            int r4 = zza(r3, r4)
            int r6 = r5.size()
            r3.writeInt(r6)
            r1 = 0
        L15:
            if (r1 >= r6) goto L30
            int r2 = r5.keyAt(r1)
            r3.writeInt(r2)
            java.lang.Object r2 = r5.valueAt(r1)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            if (r2 != 0) goto L2a
            r3.writeInt(r0)
            goto L2d
        L2a:
            zzd(r3, r2, r0)
        L2d:
            int r1 = r1 + 1
            goto L15
        L30:
            zzb(r3, r4)
            return
    }

    private static int zza(android.os.Parcel r1, int r2) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 | r0
            r1.writeInt(r2)
            r2 = 0
            r1.writeInt(r2)
            int r1 = r1.dataPosition()
            return r1
    }

    private static void zzb(android.os.Parcel r2, int r3) {
            int r0 = r2.dataPosition()
            int r1 = r3 + (-4)
            r2.setDataPosition(r1)
            int r3 = r0 - r3
            r2.writeInt(r3)
            r2.setDataPosition(r0)
            return
    }

    private static void zzc(android.os.Parcel r0, int r1, int r2) {
            int r2 = r2 << 16
            r1 = r1 | r2
            r0.writeInt(r1)
            return
    }

    private static <T extends android.os.Parcelable> void zzd(android.os.Parcel r2, T r3, int r4) {
            int r0 = r2.dataPosition()
            r1 = 1
            r2.writeInt(r1)
            int r1 = r2.dataPosition()
            r3.writeToParcel(r2, r4)
            int r3 = r2.dataPosition()
            r2.setDataPosition(r0)
            int r4 = r3 - r1
            r2.writeInt(r4)
            r2.setDataPosition(r3)
            return
    }
}
