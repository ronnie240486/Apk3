package io.realm;

/* JADX INFO: loaded from: classes.dex */
public abstract class RealmAnyOperator {

    @javax.annotation.Nullable
    private io.realm.internal.core.NativeRealmAny nativeRealmAny;
    private io.realm.RealmAny.Type type;

    /* JADX INFO: renamed from: io.realm.RealmAnyOperator$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$realm$RealmAny$Type = null;

        static {
                io.realm.RealmAny$Type[] r0 = io.realm.RealmAny.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type = r0
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.INTEGER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L28
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L33
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.BINARY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L3e
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DATE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L49
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.FLOAT     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L54
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L60
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.DECIMAL128     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L6c
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.OBJECT_ID     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L78
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.UUID     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L84
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.OBJECT     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type     // Catch: java.lang.NoSuchFieldError -> L90
                io.realm.RealmAny$Type r1 = io.realm.RealmAny.Type.NULL     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                return
        }
    }

    public RealmAnyOperator(io.realm.RealmAny.Type r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public RealmAnyOperator(io.realm.RealmAny.Type r1, io.realm.internal.core.NativeRealmAny r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.nativeRealmAny = r2
            return
    }

    public static io.realm.RealmAnyOperator fromNativeRealmAny(io.realm.BaseRealm r3, io.realm.internal.core.NativeRealmAny r4) {
            io.realm.RealmAny$Type r0 = r4.getType()
            int[] r1 = io.realm.RealmAnyOperator.AnonymousClass1.$SwitchMap$io$realm$RealmAny$Type
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L7e;
                case 2: goto L78;
                case 3: goto L72;
                case 4: goto L6c;
                case 5: goto L66;
                case 6: goto L60;
                case 7: goto L5a;
                case 8: goto L54;
                case 9: goto L4e;
                case 10: goto L48;
                case 11: goto L2c;
                case 12: goto L26;
                default: goto Lf;
            }
        Lf:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Couldn't cast to "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L26:
            io.realm.NullRealmAnyOperator r3 = new io.realm.NullRealmAnyOperator
            r3.<init>(r4)
            return r3
        L2c:
            boolean r0 = r3 instanceof io.realm.Realm
            if (r0 == 0) goto L42
            io.realm.internal.OsSharedRealm r0 = r3.sharedRealm     // Catch: io.realm.exceptions.RealmException -> L42
            io.realm.RealmConfiguration r1 = r3.configuration     // Catch: io.realm.exceptions.RealmException -> L42
            io.realm.internal.RealmProxyMediator r1 = r1.getSchemaMediator()     // Catch: io.realm.exceptions.RealmException -> L42
            java.lang.Class r0 = r4.getModelClass(r0, r1)     // Catch: io.realm.exceptions.RealmException -> L42
            io.realm.RealmModelOperator r1 = new io.realm.RealmModelOperator     // Catch: io.realm.exceptions.RealmException -> L42
            r1.<init>(r3, r4, r0)     // Catch: io.realm.exceptions.RealmException -> L42
            return r1
        L42:
            io.realm.DynamicRealmModelRealmAnyOperator r0 = new io.realm.DynamicRealmModelRealmAnyOperator
            r0.<init>(r3, r4)
            return r0
        L48:
            io.realm.UUIDRealmAnyOperator r3 = new io.realm.UUIDRealmAnyOperator
            r3.<init>(r4)
            return r3
        L4e:
            io.realm.ObjectIdRealmAnyOperator r3 = new io.realm.ObjectIdRealmAnyOperator
            r3.<init>(r4)
            return r3
        L54:
            io.realm.Decimal128RealmAnyOperator r3 = new io.realm.Decimal128RealmAnyOperator
            r3.<init>(r4)
            return r3
        L5a:
            io.realm.DoubleRealmAnyOperator r3 = new io.realm.DoubleRealmAnyOperator
            r3.<init>(r4)
            return r3
        L60:
            io.realm.FloatRealmAnyOperator r3 = new io.realm.FloatRealmAnyOperator
            r3.<init>(r4)
            return r3
        L66:
            io.realm.DateRealmAnyOperator r3 = new io.realm.DateRealmAnyOperator
            r3.<init>(r4)
            return r3
        L6c:
            io.realm.BinaryRealmAnyOperator r3 = new io.realm.BinaryRealmAnyOperator
            r3.<init>(r4)
            return r3
        L72:
            io.realm.StringRealmAnyOperator r3 = new io.realm.StringRealmAnyOperator
            r3.<init>(r4)
            return r3
        L78:
            io.realm.BooleanRealmAnyOperator r3 = new io.realm.BooleanRealmAnyOperator
            r3.<init>(r4)
            return r3
        L7e:
            io.realm.IntegerRealmAnyOperator r3 = new io.realm.IntegerRealmAnyOperator
            r3.<init>(r4)
            return r3
    }

    private synchronized io.realm.internal.core.NativeRealmAny getNativeRealmAny() {
            r1 = this;
            monitor-enter(r1)
            io.realm.internal.core.NativeRealmAny r0 = r1.nativeRealmAny     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lb
            io.realm.internal.core.NativeRealmAny r0 = r1.createNativeRealmAny()     // Catch: java.lang.Throwable -> Lf
            r1.nativeRealmAny = r0     // Catch: java.lang.Throwable -> Lf
        Lb:
            io.realm.internal.core.NativeRealmAny r0 = r1.nativeRealmAny     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public void checkValidObject(io.realm.BaseRealm r1) {
            r0 = this;
            return
    }

    public final boolean coercedEquals(io.realm.RealmAnyOperator r2) {
            r1 = this;
            io.realm.internal.core.NativeRealmAny r0 = r1.getNativeRealmAny()
            io.realm.internal.core.NativeRealmAny r2 = r2.getNativeRealmAny()
            boolean r2 = r0.coercedEquals(r2)
            return r2
    }

    public abstract io.realm.internal.core.NativeRealmAny createNativeRealmAny();

    public final long getNativePtr() {
            r2 = this;
            io.realm.internal.core.NativeRealmAny r0 = r2.getNativeRealmAny()
            long r0 = r0.getNativePtr()
            return r0
    }

    public final io.realm.RealmAny.Type getType() {
            r1 = this;
            io.realm.RealmAny$Type r0 = r1.type
            return r0
    }

    public java.lang.Class<?> getTypedClass() {
            r1 = this;
            io.realm.RealmAny$Type r0 = r1.type
            java.lang.Class r0 = r0.getTypedClass()
            return r0
    }

    public abstract <T> T getValue(java.lang.Class<T> r1);
}
