package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
interface ViewTypeStorage {

    /* JADX INFO: loaded from: classes2.dex */
    public static class IsolatedViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        public android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> mGlobalTypeToWrapper;
        public int mNextViewType;

        /* JADX INFO: loaded from: classes.dex */
        public class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            private android.util.SparseIntArray mGlobalToLocalMapping;
            private android.util.SparseIntArray mLocalToGlobalMapping;
            public final androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;
            public final /* synthetic */ androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage this$0;

            public WrapperViewTypeLookup(androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage r2, androidx.recyclerview.widget.NestedAdapterWrapper r3) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    android.util.SparseIntArray r2 = new android.util.SparseIntArray
                    r0 = 1
                    r2.<init>(r0)
                    r1.mLocalToGlobalMapping = r2
                    android.util.SparseIntArray r2 = new android.util.SparseIntArray
                    r2.<init>(r0)
                    r1.mGlobalToLocalMapping = r2
                    r1.mWrapper = r3
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                    r4 = this;
                    androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage r0 = r4.this$0
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r4.mWrapper
                    android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r2 = r0.mGlobalTypeToWrapper
                    int r2 = r2.size()
                La:
                    int r2 = r2 + (-1)
                    if (r2 < 0) goto L1e
                    android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r3 = r0.mGlobalTypeToWrapper
                    java.lang.Object r3 = r3.valueAt(r2)
                    androidx.recyclerview.widget.NestedAdapterWrapper r3 = (androidx.recyclerview.widget.NestedAdapterWrapper) r3
                    if (r3 != r1) goto La
                    android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r3 = r0.mGlobalTypeToWrapper
                    r3.removeAt(r2)
                    goto La
                L1e:
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int r4) {
                    r3 = this;
                    android.util.SparseIntArray r0 = r3.mGlobalToLocalMapping
                    int r0 = r0.indexOfKey(r4)
                    if (r0 < 0) goto Lf
                    android.util.SparseIntArray r4 = r3.mGlobalToLocalMapping
                    int r4 = r4.valueAt(r0)
                    return r4
                Lf:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "requested global type "
                    java.lang.String r2 = " does not belong to the adapter:"
                    java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r4, r2)
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r3.mWrapper
                    androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.adapter
                    r4.append(r1)
                    java.lang.String r4 = r4.toString()
                    r0.<init>(r4)
                    throw r0
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int r5) {
                    r4 = this;
                    android.util.SparseIntArray r0 = r4.mLocalToGlobalMapping
                    int r0 = r0.indexOfKey(r5)
                    r1 = -1
                    if (r0 <= r1) goto L10
                    android.util.SparseIntArray r5 = r4.mLocalToGlobalMapping
                    int r5 = r5.valueAt(r0)
                    return r5
                L10:
                    androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage r0 = r4.this$0
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r4.mWrapper
                    int r2 = r0.mNextViewType
                    int r3 = r2 + 1
                    r0.mNextViewType = r3
                    android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r0.mGlobalTypeToWrapper
                    r0.put(r2, r1)
                    android.util.SparseIntArray r0 = r4.mLocalToGlobalMapping
                    r0.put(r5, r2)
                    android.util.SparseIntArray r0 = r4.mGlobalToLocalMapping
                    r0.put(r2, r5)
                    return r2
            }
        }

        public IsolatedViewTypeStorage() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mGlobalTypeToWrapper = r0
                r0 = 0
                r1.mNextViewType = r0
                return
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r2) {
                r1 = this;
                androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage$WrapperViewTypeLookup r0 = new androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage$WrapperViewTypeLookup
                r0.<init>(r1, r2)
                return r0
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r2.mGlobalTypeToWrapper
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.NestedAdapterWrapper r0 = (androidx.recyclerview.widget.NestedAdapterWrapper) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Cannot find the wrapper for global view type "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
        }
    }

    public static class SharedIdRangeViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        public android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> mGlobalTypeToWrapper;

        /* JADX INFO: loaded from: classes2.dex */
        public class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            public final androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;
            public final /* synthetic */ androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage this$0;

            public WrapperViewTypeLookup(androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage r1, androidx.recyclerview.widget.NestedAdapterWrapper r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.mWrapper = r2
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                    r5 = this;
                    androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage r0 = r5.this$0
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r5.mWrapper
                    android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r2 = r0.mGlobalTypeToWrapper
                    int r2 = r2.size()
                La:
                    int r2 = r2 + (-1)
                    if (r2 < 0) goto L28
                    android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r3 = r0.mGlobalTypeToWrapper
                    java.lang.Object r3 = r3.valueAt(r2)
                    java.util.List r3 = (java.util.List) r3
                    boolean r4 = r3.remove(r1)
                    if (r4 == 0) goto La
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto La
                    android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r3 = r0.mGlobalTypeToWrapper
                    r3.removeAt(r2)
                    goto La
                L28:
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int r1) {
                    r0 = this;
                    return r1
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int r3) {
                    r2 = this;
                    androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage r0 = r2.this$0
                    android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r0 = r0.mGlobalTypeToWrapper
                    java.lang.Object r0 = r0.get(r3)
                    java.util.List r0 = (java.util.List) r0
                    if (r0 != 0) goto L18
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage r1 = r2.this$0
                    android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r1 = r1.mGlobalTypeToWrapper
                    r1.put(r3, r0)
                L18:
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r2.mWrapper
                    boolean r1 = r0.contains(r1)
                    if (r1 != 0) goto L25
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r2.mWrapper
                    r0.add(r1)
                L25:
                    return r3
            }
        }

        public SharedIdRangeViewTypeStorage() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mGlobalTypeToWrapper = r0
                return
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r2) {
                r1 = this;
                androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage$WrapperViewTypeLookup r0 = new androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage$WrapperViewTypeLookup
                r0.<init>(r1, r2)
                return r0
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int r3) {
                r2 = this;
                android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r0 = r2.mGlobalTypeToWrapper
                java.lang.Object r0 = r0.get(r3)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L18
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L18
                r3 = 0
                java.lang.Object r3 = r0.get(r3)
                androidx.recyclerview.widget.NestedAdapterWrapper r3 = (androidx.recyclerview.widget.NestedAdapterWrapper) r3
                return r3
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Cannot find the wrapper for global view type "
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
                r0.<init>(r3)
                throw r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int r1);

        int localToGlobal(int r1);
    }

    @androidx.annotation.NonNull
    androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(@androidx.annotation.NonNull androidx.recyclerview.widget.NestedAdapterWrapper r1);

    @androidx.annotation.NonNull
    androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int r1);
}
