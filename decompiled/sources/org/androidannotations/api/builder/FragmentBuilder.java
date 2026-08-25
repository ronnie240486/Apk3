package org.androidannotations.api.builder;

import org.androidannotations.api.builder.FragmentBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FragmentBuilder<I extends org.androidannotations.api.builder.FragmentBuilder<I, F>, F> extends org.androidannotations.api.builder.Builder {
    public android.os.Bundle args;

    public FragmentBuilder() {
            r1 = this;
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.args = r0
            return
    }

    public I arg(android.os.Bundle r2) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putAll(r2)
            return r1
    }

    public I arg(java.lang.String r2, byte r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putByte(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, char r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putChar(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, double r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putDouble(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, float r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putFloat(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, int r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putInt(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, long r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putLong(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putBundle(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, android.os.Parcelable r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putParcelable(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, android.util.SparseArray<? extends android.os.Parcelable> r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putSparseParcelableArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, java.io.Serializable r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putSerializable(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, java.lang.CharSequence r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putCharSequence(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putString(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, short r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putShort(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, boolean r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putBoolean(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, byte[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putByteArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, char[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putCharArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, double[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putDoubleArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, float[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putFloatArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, int[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putIntArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, long[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putLongArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, android.os.Parcelable[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putParcelableArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putStringArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, short[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putShortArray(r2, r3)
            return r1
    }

    public I arg(java.lang.String r2, boolean[] r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putBooleanArray(r2, r3)
            return r1
    }

    public android.os.Bundle args() {
            r1 = this;
            android.os.Bundle r0 = r1.args
            return r0
    }

    public abstract F build();

    public I integerArrayListArg(java.lang.String r2, java.util.ArrayList<java.lang.Integer> r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putIntegerArrayList(r2, r3)
            return r1
    }

    public I parcelableArrayListArg(java.lang.String r2, java.util.ArrayList<? extends android.os.Parcelable> r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putParcelableArrayList(r2, r3)
            return r1
    }

    public I stringArrayListArg(java.lang.String r2, java.util.ArrayList<java.lang.String> r3) {
            r1 = this;
            android.os.Bundle r0 = r1.args
            r0.putStringArrayList(r2, r3)
            return r1
    }
}
