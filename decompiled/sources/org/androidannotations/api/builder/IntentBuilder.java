package org.androidannotations.api.builder;

import org.androidannotations.api.builder.IntentBuilder;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntentBuilder<I extends org.androidannotations.api.builder.IntentBuilder<I>> extends org.androidannotations.api.builder.Builder {
    public final android.content.Context context;
    public final android.content.Intent intent;

    public IntentBuilder(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.intent = r2
            return
    }

    public IntentBuilder(android.content.Context r2, java.lang.Class<?> r3) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r3)
            r1.<init>(r2, r0)
            return
    }

    public I action(java.lang.String r2) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.setAction(r2)
            return r1
    }

    public I extra(java.lang.String r2, byte r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, char r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, double r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, float r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, int r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, long r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, android.os.Parcelable r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, java.io.Serializable r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, java.lang.CharSequence r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, short r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, boolean r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, byte[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, char[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, double[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, float[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, int[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, long[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, android.os.Parcelable[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, short[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extra(java.lang.String r2, boolean[] r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtra(r2, r3)
            return r1
    }

    public I extras(android.content.Intent r2) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putExtras(r2)
            return r1
    }

    public I flags(int r2) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.setFlags(r2)
            return r1
    }

    public android.content.Intent get() {
            r1 = this;
            android.content.Intent r0 = r1.intent
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public I integerArrayListExtra(java.lang.String r2, java.util.ArrayList<java.lang.Integer> r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putIntegerArrayListExtra(r2, r3)
            return r1
    }

    public I parcelableArrayListExtra(java.lang.String r2, java.util.ArrayList<? extends android.os.Parcelable> r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putParcelableArrayListExtra(r2, r3)
            return r1
    }

    public I stringArrayListExtra(java.lang.String r2, java.util.ArrayList<java.lang.String> r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.putStringArrayListExtra(r2, r3)
            return r1
    }
}
