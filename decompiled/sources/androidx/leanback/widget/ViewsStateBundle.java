package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
class ViewsStateBundle {
    public static final int LIMIT_DEFAULT = 100;
    public static final int UNLIMITED = Integer.MAX_VALUE;
    private androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> mChildStates;
    private int mLimitNumber;
    private int mSavePolicy;

    public ViewsStateBundle() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mSavePolicy = r0
            r0 = 100
            r1.mLimitNumber = r0
            return
    }

    public final void applyPolicyChanges() {
            r2 = this;
            int r0 = r2.mSavePolicy
            r1 = 2
            if (r0 != r1) goto L25
            int r0 = r2.mLimitNumber
            if (r0 <= 0) goto L1f
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r2.mChildStates
            if (r0 == 0) goto L15
            int r0 = r0.maxSize()
            int r1 = r2.mLimitNumber
            if (r0 == r1) goto L44
        L15:
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            int r1 = r2.mLimitNumber
            r0.<init>(r1)
            r2.mChildStates = r0
            goto L44
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L25:
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 1
            if (r0 != r1) goto L2c
            goto L30
        L2c:
            r0 = 0
            r2.mChildStates = r0
            goto L44
        L30:
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r2.mChildStates
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L3d
            int r0 = r0.maxSize()
            if (r0 == r1) goto L44
        L3d:
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r0.<init>(r1)
            r2.mChildStates = r0
        L44:
            return
    }

    public void clear() {
            r1 = this;
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r1.mChildStates
            if (r0 == 0) goto L7
            r0.evictAll()
        L7:
            return
    }

    public final int getLimitNumber() {
            r1 = this;
            int r0 = r1.mLimitNumber
            return r0
    }

    public final int getSavePolicy() {
            r1 = this;
            int r0 = r1.mSavePolicy
            return r0
    }

    public final void loadFromBundle(android.os.Bundle r5) {
            r4 = this;
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r4.mChildStates
            if (r0 == 0) goto L27
            if (r5 == 0) goto L27
            r0.evictAll()
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r2 = r4.mChildStates
            android.util.SparseArray r3 = r5.getSparseParcelableArray(r1)
            r2.put(r1, r3)
            goto L11
        L27:
            return
    }

    public final void loadView(android.view.View r2, int r3) {
            r1 = this;
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r1.mChildStates
            if (r0 == 0) goto L15
            java.lang.String r3 = java.lang.Integer.toString(r3)
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r1.mChildStates
            java.lang.Object r3 = r0.remove(r3)
            android.util.SparseArray r3 = (android.util.SparseArray) r3
            if (r3 == 0) goto L15
            r2.restoreHierarchyState(r3)
        L15:
            return
    }

    public void remove(int r2) {
            r1 = this;
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r1.mChildStates
            if (r0 == 0) goto L13
            int r0 = r0.size()
            if (r0 == 0) goto L13
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r1.mChildStates
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r0.remove(r2)
        L13:
            return
    }

    public final android.os.Bundle saveAsBundle() {
            r4 = this;
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r4.mChildStates
            if (r0 == 0) goto L3b
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L3b
        Lb:
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r4.mChildStates
            java.util.Map r0 = r0.snapshot()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            r1.putSparseParcelableArray(r3, r2)
            goto L1e
        L3a:
            return r1
        L3b:
            r0 = 0
            return r0
    }

    public final void saveOffscreenView(android.view.View r3, int r4) {
            r2 = this;
            int r0 = r2.mSavePolicy
            r1 = 1
            if (r0 == r1) goto L22
            r1 = 2
            if (r0 == r1) goto Lc
            r1 = 3
            if (r0 == r1) goto Lc
            goto L25
        Lc:
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r0 = r2.mChildStates
            if (r0 == 0) goto L25
            java.lang.String r4 = java.lang.Integer.toString(r4)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.saveHierarchyState(r0)
            androidx.collection.LruCache<java.lang.String, android.util.SparseArray<android.os.Parcelable>> r3 = r2.mChildStates
            r3.put(r4, r0)
            goto L25
        L22:
            r2.remove(r4)
        L25:
            return
    }

    public final android.os.Bundle saveOnScreenView(android.os.Bundle r2, android.view.View r3, int r4) {
            r1 = this;
            int r0 = r1.mSavePolicy
            if (r0 == 0) goto L1a
            java.lang.String r4 = java.lang.Integer.toString(r4)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r3.saveHierarchyState(r0)
            if (r2 != 0) goto L17
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L17:
            r2.putSparseParcelableArray(r4, r0)
        L1a:
            return r2
    }

    public final void setLimitNumber(int r1) {
            r0 = this;
            r0.mLimitNumber = r1
            r0.applyPolicyChanges()
            return
    }

    public final void setSavePolicy(int r1) {
            r0 = this;
            r0.mSavePolicy = r1
            r0.applyPolicyChanges()
            return
    }
}
