package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes2.dex */
interface StableIdStorage {

    public static class IsolatedStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        public long mNextStableId;

        public class WrapperStableIdLookup implements androidx.recyclerview.widget.StableIdStorage.StableIdLookup {
            private final androidx.collection.LongSparseArray<java.lang.Long> mLocalToGlobalLookup;
            public final /* synthetic */ androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage this$0;

            public WrapperStableIdLookup(androidx.recyclerview.widget.StableIdStorage.IsolatedStableIdStorage r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    androidx.collection.LongSparseArray r1 = new androidx.collection.LongSparseArray
                    r1.<init>()
                    r0.mLocalToGlobalLookup = r1
                    return
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long r6) {
                    r5 = this;
                    androidx.collection.LongSparseArray<java.lang.Long> r0 = r5.mLocalToGlobalLookup
                    java.lang.Object r0 = r0.get(r6)
                    java.lang.Long r0 = (java.lang.Long) r0
                    if (r0 != 0) goto L1c
                    androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage r0 = r5.this$0
                    long r1 = r0.mNextStableId
                    r3 = 1
                    long r3 = r3 + r1
                    r0.mNextStableId = r3
                    java.lang.Long r0 = java.lang.Long.valueOf(r1)
                    androidx.collection.LongSparseArray<java.lang.Long> r1 = r5.mLocalToGlobalLookup
                    r1.put(r6, r0)
                L1c:
                    long r6 = r0.longValue()
                    return r6
            }
        }

        public IsolatedStableIdStorage() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mNextStableId = r0
                return
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
                r1 = this;
                androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage$WrapperStableIdLookup r0 = new androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage$WrapperStableIdLookup
                r0.<init>(r1)
                return r0
        }
    }

    public static class NoStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mNoIdLookup;


        public NoStableIdStorage() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1 r0 = new androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage$1
                r0.<init>()
                r1.mNoIdLookup = r0
                return
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
                r1 = this;
                androidx.recyclerview.widget.StableIdStorage$StableIdLookup r0 = r1.mNoIdLookup
                return r0
        }
    }

    public static class SharedPoolStableIdStorage implements androidx.recyclerview.widget.StableIdStorage {
        private final androidx.recyclerview.widget.StableIdStorage.StableIdLookup mSameIdLookup;


        public SharedPoolStableIdStorage() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1 r0 = new androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage$1
                r0.<init>()
                r1.mSameIdLookup = r0
                return
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @androidx.annotation.NonNull
        public androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup() {
                r1 = this;
                androidx.recyclerview.widget.StableIdStorage$StableIdLookup r0 = r1.mSameIdLookup
                return r0
        }
    }

    public interface StableIdLookup {
        long localToGlobal(long r1);
    }

    @androidx.annotation.NonNull
    androidx.recyclerview.widget.StableIdStorage.StableIdLookup createStableIdLookup();
}
