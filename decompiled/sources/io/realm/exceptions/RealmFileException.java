package io.realm.exceptions;

/* JADX INFO: loaded from: classes2.dex */
@io.realm.internal.Keep
public class RealmFileException extends java.lang.RuntimeException {
    private final io.realm.exceptions.RealmFileException.Kind kind;

    /* JADX INFO: loaded from: classes.dex */
    @io.realm.internal.Keep
    public static final enum Kind extends java.lang.Enum<io.realm.exceptions.RealmFileException.Kind> {
        private static final /* synthetic */ io.realm.exceptions.RealmFileException.Kind[] $VALUES = null;
        public static final io.realm.exceptions.RealmFileException.Kind ACCESS_ERROR = null;
        public static final io.realm.exceptions.RealmFileException.Kind BAD_HISTORY = null;
        public static final io.realm.exceptions.RealmFileException.Kind EXISTS = null;
        public static final io.realm.exceptions.RealmFileException.Kind FORMAT_UPGRADE_REQUIRED = null;
        public static final io.realm.exceptions.RealmFileException.Kind INCOMPATIBLE_LOCK_FILE = null;
        public static final io.realm.exceptions.RealmFileException.Kind INCOMPATIBLE_SYNC_FILE = null;
        public static final io.realm.exceptions.RealmFileException.Kind NOT_FOUND = null;
        public static final io.realm.exceptions.RealmFileException.Kind PERMISSION_DENIED = null;

        static {
                io.realm.exceptions.RealmFileException$Kind r0 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r1 = "ACCESS_ERROR"
                r2 = 0
                r0.<init>(r1, r2)
                io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR = r0
                io.realm.exceptions.RealmFileException$Kind r1 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r3 = "BAD_HISTORY"
                r4 = 1
                r1.<init>(r3, r4)
                io.realm.exceptions.RealmFileException.Kind.BAD_HISTORY = r1
                io.realm.exceptions.RealmFileException$Kind r3 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r5 = "PERMISSION_DENIED"
                r6 = 2
                r3.<init>(r5, r6)
                io.realm.exceptions.RealmFileException.Kind.PERMISSION_DENIED = r3
                io.realm.exceptions.RealmFileException$Kind r5 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r7 = "EXISTS"
                r8 = 3
                r5.<init>(r7, r8)
                io.realm.exceptions.RealmFileException.Kind.EXISTS = r5
                io.realm.exceptions.RealmFileException$Kind r7 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r9 = "NOT_FOUND"
                r10 = 4
                r7.<init>(r9, r10)
                io.realm.exceptions.RealmFileException.Kind.NOT_FOUND = r7
                io.realm.exceptions.RealmFileException$Kind r9 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r11 = "INCOMPATIBLE_LOCK_FILE"
                r12 = 5
                r9.<init>(r11, r12)
                io.realm.exceptions.RealmFileException.Kind.INCOMPATIBLE_LOCK_FILE = r9
                io.realm.exceptions.RealmFileException$Kind r11 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r13 = "FORMAT_UPGRADE_REQUIRED"
                r14 = 6
                r11.<init>(r13, r14)
                io.realm.exceptions.RealmFileException.Kind.FORMAT_UPGRADE_REQUIRED = r11
                io.realm.exceptions.RealmFileException$Kind r13 = new io.realm.exceptions.RealmFileException$Kind
                java.lang.String r15 = "INCOMPATIBLE_SYNC_FILE"
                r14 = 7
                r13.<init>(r15, r14)
                io.realm.exceptions.RealmFileException.Kind.INCOMPATIBLE_SYNC_FILE = r13
                r15 = 8
                io.realm.exceptions.RealmFileException$Kind[] r15 = new io.realm.exceptions.RealmFileException.Kind[r15]
                r15[r2] = r0
                r15[r4] = r1
                r15[r6] = r3
                r15[r8] = r5
                r15[r10] = r7
                r15[r12] = r9
                r0 = 6
                r15[r0] = r11
                r15[r14] = r13
                io.realm.exceptions.RealmFileException.Kind.$VALUES = r15
                return
        }

        private Kind(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.realm.exceptions.RealmFileException.Kind getKind(byte r1) {
                switch(r1) {
                    case 0: goto L20;
                    case 1: goto L1d;
                    case 2: goto L1a;
                    case 3: goto L17;
                    case 4: goto L14;
                    case 5: goto L11;
                    case 6: goto Le;
                    case 7: goto Lb;
                    default: goto L3;
                }
            L3:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r0 = "Unknown value for RealmFileException kind."
                r1.<init>(r0)
                throw r1
            Lb:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.INCOMPATIBLE_SYNC_FILE
                return r1
            Le:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.FORMAT_UPGRADE_REQUIRED
                return r1
            L11:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.INCOMPATIBLE_LOCK_FILE
                return r1
            L14:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.NOT_FOUND
                return r1
            L17:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.EXISTS
                return r1
            L1a:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.PERMISSION_DENIED
                return r1
            L1d:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.BAD_HISTORY
                return r1
            L20:
                io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.ACCESS_ERROR
                return r1
        }

        public static io.realm.exceptions.RealmFileException.Kind valueOf(java.lang.String r1) {
                java.lang.Class<io.realm.exceptions.RealmFileException$Kind> r0 = io.realm.exceptions.RealmFileException.Kind.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.realm.exceptions.RealmFileException$Kind r1 = (io.realm.exceptions.RealmFileException.Kind) r1
                return r1
        }

        public static io.realm.exceptions.RealmFileException.Kind[] values() {
                io.realm.exceptions.RealmFileException$Kind[] r0 = io.realm.exceptions.RealmFileException.Kind.$VALUES
                java.lang.Object r0 = r0.clone()
                io.realm.exceptions.RealmFileException$Kind[] r0 = (io.realm.exceptions.RealmFileException.Kind[]) r0
                return r0
        }
    }

    public RealmFileException(byte r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            io.realm.exceptions.RealmFileException$Kind r1 = io.realm.exceptions.RealmFileException.Kind.getKind(r1)
            r0.kind = r1
            return
    }

    public RealmFileException(io.realm.exceptions.RealmFileException.Kind r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.kind = r1
            return
    }

    public RealmFileException(io.realm.exceptions.RealmFileException.Kind r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.kind = r1
            return
    }

    public RealmFileException(io.realm.exceptions.RealmFileException.Kind r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r2)
            r0.kind = r1
            return
    }

    public io.realm.exceptions.RealmFileException.Kind getKind() {
            r1 = this;
            io.realm.exceptions.RealmFileException$Kind r0 = r1.kind
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = super.toString()
            r3 = 0
            r1[r3] = r2
            io.realm.exceptions.RealmFileException$Kind r2 = r4.kind
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "%s Kind: %s."
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }
}
