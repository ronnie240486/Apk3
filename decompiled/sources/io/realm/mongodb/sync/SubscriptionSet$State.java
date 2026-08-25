package io.realm.mongodb.sync;

/* JADX INFO: loaded from: classes.dex */
public final enum SubscriptionSet$State extends java.lang.Enum<io.realm.mongodb.sync.SubscriptionSet$State> {
    private static final /* synthetic */ io.realm.mongodb.sync.SubscriptionSet$State[] $VALUES = null;
    public static final io.realm.mongodb.sync.SubscriptionSet$State BOOTSTRAPPING = null;
    public static final io.realm.mongodb.sync.SubscriptionSet$State COMPLETE = null;
    public static final io.realm.mongodb.sync.SubscriptionSet$State ERROR = null;
    public static final io.realm.mongodb.sync.SubscriptionSet$State PENDING = null;
    public static final io.realm.mongodb.sync.SubscriptionSet$State SUPERSEDED = null;
    public static final io.realm.mongodb.sync.SubscriptionSet$State UNCOMMITTED = null;
    private final byte value;

    static {
            io.realm.mongodb.sync.SubscriptionSet$State r0 = new io.realm.mongodb.sync.SubscriptionSet$State
            java.lang.String r1 = "UNCOMMITTED"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.realm.mongodb.sync.SubscriptionSet$State.UNCOMMITTED = r0
            io.realm.mongodb.sync.SubscriptionSet$State r1 = new io.realm.mongodb.sync.SubscriptionSet$State
            java.lang.String r3 = "PENDING"
            r4 = 1
            r1.<init>(r3, r4, r4)
            io.realm.mongodb.sync.SubscriptionSet$State.PENDING = r1
            io.realm.mongodb.sync.SubscriptionSet$State r3 = new io.realm.mongodb.sync.SubscriptionSet$State
            java.lang.String r5 = "BOOTSTRAPPING"
            r6 = 2
            r3.<init>(r5, r6, r6)
            io.realm.mongodb.sync.SubscriptionSet$State.BOOTSTRAPPING = r3
            io.realm.mongodb.sync.SubscriptionSet$State r5 = new io.realm.mongodb.sync.SubscriptionSet$State
            java.lang.String r7 = "COMPLETE"
            r8 = 3
            r5.<init>(r7, r8, r8)
            io.realm.mongodb.sync.SubscriptionSet$State.COMPLETE = r5
            io.realm.mongodb.sync.SubscriptionSet$State r7 = new io.realm.mongodb.sync.SubscriptionSet$State
            java.lang.String r9 = "ERROR"
            r10 = 4
            r7.<init>(r9, r10, r10)
            io.realm.mongodb.sync.SubscriptionSet$State.ERROR = r7
            io.realm.mongodb.sync.SubscriptionSet$State r9 = new io.realm.mongodb.sync.SubscriptionSet$State
            java.lang.String r11 = "SUPERSEDED"
            r12 = 5
            r9.<init>(r11, r12, r12)
            io.realm.mongodb.sync.SubscriptionSet$State.SUPERSEDED = r9
            r11 = 6
            io.realm.mongodb.sync.SubscriptionSet$State[] r11 = new io.realm.mongodb.sync.SubscriptionSet$State[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            io.realm.mongodb.sync.SubscriptionSet$State.$VALUES = r11
            return
    }

    private SubscriptionSet$State(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static io.realm.mongodb.sync.SubscriptionSet$State fromNativeValue(long r7) {
            io.realm.mongodb.sync.SubscriptionSet$State[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L15
            r3 = r0[r2]
            byte r4 = r3.value
            long r4 = (long) r4
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 != 0) goto L12
            return r3
        L12:
            int r2 = r2 + 1
            goto L6
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown SubscriptionSetState code: "
            java.lang.String r7 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r7)
            r0.<init>(r7)
            throw r0
    }

    public static io.realm.mongodb.sync.SubscriptionSet$State valueOf(java.lang.String r1) {
            java.lang.Class<io.realm.mongodb.sync.SubscriptionSet$State> r0 = io.realm.mongodb.sync.SubscriptionSet$State.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.realm.mongodb.sync.SubscriptionSet$State r1 = (io.realm.mongodb.sync.SubscriptionSet$State) r1
            return r1
    }

    public static io.realm.mongodb.sync.SubscriptionSet$State[] values() {
            io.realm.mongodb.sync.SubscriptionSet$State[] r0 = io.realm.mongodb.sync.SubscriptionSet$State.$VALUES
            java.lang.Object r0 = r0.clone()
            io.realm.mongodb.sync.SubscriptionSet$State[] r0 = (io.realm.mongodb.sync.SubscriptionSet$State[]) r0
            return r0
    }
}
