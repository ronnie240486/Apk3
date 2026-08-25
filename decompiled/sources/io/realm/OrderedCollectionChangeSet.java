package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public interface OrderedCollectionChangeSet {

    /* JADX INFO: loaded from: classes.dex */
    public static class Range {
        public final int length;
        public final int startIndex;

        public Range(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.startIndex = r1
                r0.length = r2
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.util.Locale r0 = java.util.Locale.ENGLISH
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r2 = r4.startIndex
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                int r2 = r4.length
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                java.lang.String r2 = "startIndex: %d, length: %d"
                java.lang.String r0 = java.lang.String.format(r0, r2, r1)
                return r0
        }
    }

    public static final enum State extends java.lang.Enum<io.realm.OrderedCollectionChangeSet.State> {
        private static final /* synthetic */ io.realm.OrderedCollectionChangeSet.State[] $VALUES = null;
        public static final io.realm.OrderedCollectionChangeSet.State ERROR = null;
        public static final io.realm.OrderedCollectionChangeSet.State INITIAL = null;
        public static final io.realm.OrderedCollectionChangeSet.State UPDATE = null;

        static {
                io.realm.OrderedCollectionChangeSet$State r0 = new io.realm.OrderedCollectionChangeSet$State
                java.lang.String r1 = "INITIAL"
                r2 = 0
                r0.<init>(r1, r2)
                io.realm.OrderedCollectionChangeSet.State.INITIAL = r0
                io.realm.OrderedCollectionChangeSet$State r1 = new io.realm.OrderedCollectionChangeSet$State
                java.lang.String r3 = "UPDATE"
                r4 = 1
                r1.<init>(r3, r4)
                io.realm.OrderedCollectionChangeSet.State.UPDATE = r1
                io.realm.OrderedCollectionChangeSet$State r3 = new io.realm.OrderedCollectionChangeSet$State
                java.lang.String r5 = "ERROR"
                r6 = 2
                r3.<init>(r5, r6)
                io.realm.OrderedCollectionChangeSet.State.ERROR = r3
                r5 = 3
                io.realm.OrderedCollectionChangeSet$State[] r5 = new io.realm.OrderedCollectionChangeSet.State[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.realm.OrderedCollectionChangeSet.State.$VALUES = r5
                return
        }

        private State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.OrderedCollectionChangeSet.State valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.OrderedCollectionChangeSet$State> r0 = io.realm.OrderedCollectionChangeSet.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.OrderedCollectionChangeSet$State r1 = (io.realm.OrderedCollectionChangeSet.State) r1
                return r1
        }

        public static io.realm.OrderedCollectionChangeSet.State[] values() {
                io.realm.OrderedCollectionChangeSet$State[] r0 = io.realm.OrderedCollectionChangeSet.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.OrderedCollectionChangeSet$State[] r0 = (io.realm.OrderedCollectionChangeSet.State[]) r0
                return r0
        }
    }

    io.realm.OrderedCollectionChangeSet.Range[] getChangeRanges();

    int[] getChanges();

    io.realm.OrderedCollectionChangeSet.Range[] getDeletionRanges();

    int[] getDeletions();

    @javax.annotation.Nullable
    java.lang.Throwable getError();

    io.realm.OrderedCollectionChangeSet.Range[] getInsertionRanges();

    int[] getInsertions();

    io.realm.OrderedCollectionChangeSet.State getState();
}
