package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
class GifViewSavedState extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<pl.droidsonroids.gif.GifViewSavedState> CREATOR = null;
    public final long[][] mStates;


    static {
            pl.droidsonroids.gif.GifViewSavedState$1 r0 = new pl.droidsonroids.gif.GifViewSavedState$1
            r0.<init>()
            pl.droidsonroids.gif.GifViewSavedState.CREATOR = r0
            return
    }

    private GifViewSavedState(android.os.Parcel r4) {
            r3 = this;
            r3.<init>(r4)
            int r0 = r4.readInt()
            long[][] r0 = new long[r0][]
            r3.mStates = r0
            r0 = 0
        Lc:
            long[][] r1 = r3.mStates
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            long[] r2 = r4.createLongArray()
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lc
        L1a:
            return
    }

    public /* synthetic */ GifViewSavedState(android.os.Parcel r1, pl.droidsonroids.gif.GifViewSavedState.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public GifViewSavedState(android.os.Parcelable r2, long[] r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            long[][] r2 = new long[r2][]
            r1.mStates = r2
            r0 = 0
            r2[r0] = r3
            return
    }

    public GifViewSavedState(android.os.Parcelable r3, android.graphics.drawable.Drawable... r4) {
            r2 = this;
            r2.<init>(r3)
            int r3 = r4.length
            long[][] r3 = new long[r3][]
            r2.mStates = r3
            r3 = 0
        L9:
            int r0 = r4.length
            if (r3 >= r0) goto L27
            r0 = r4[r3]
            boolean r1 = r0 instanceof pl.droidsonroids.gif.GifDrawable
            if (r1 == 0) goto L1f
            long[][] r1 = r2.mStates
            pl.droidsonroids.gif.GifDrawable r0 = (pl.droidsonroids.gif.GifDrawable) r0
            pl.droidsonroids.gif.GifInfoHandle r0 = r0.mNativeInfoHandle
            long[] r0 = r0.getSavedState()
            r1[r3] = r0
            goto L24
        L1f:
            long[][] r0 = r2.mStates
            r1 = 0
            r0[r3] = r1
        L24:
            int r3 = r3 + 1
            goto L9
        L27:
            return
    }

    public final void restoreState(android.graphics.drawable.Drawable r3, int r4) {
            r2 = this;
            long[][] r0 = r2.mStates
            r1 = r0[r4]
            if (r1 == 0) goto L1a
            boolean r1 = r3 instanceof pl.droidsonroids.gif.GifDrawable
            if (r1 == 0) goto L1a
            pl.droidsonroids.gif.GifDrawable r3 = (pl.droidsonroids.gif.GifDrawable) r3
            pl.droidsonroids.gif.GifInfoHandle r1 = r3.mNativeInfoHandle
            r4 = r0[r4]
            android.graphics.Bitmap r0 = r3.mBuffer
            int r4 = r1.restoreSavedState(r4, r0)
            long r0 = (long) r4
            r3.startAnimation(r0)
        L1a:
            return
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r4, int r5) {
            r3 = this;
            super.writeToParcel(r4, r5)
            long[][] r5 = r3.mStates
            int r5 = r5.length
            r4.writeInt(r5)
            long[][] r5 = r3.mStates
            int r0 = r5.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L17
            r2 = r5[r1]
            r4.writeLongArray(r2)
            int r1 = r1 + 1
            goto Ld
        L17:
            return
    }
}
