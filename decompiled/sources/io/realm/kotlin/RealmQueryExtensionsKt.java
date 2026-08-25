package io.realm.kotlin;

/* JADX INFO: compiled from: RealmQueryExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0002\u0010\t\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\u0010\u000b\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\u0007¢\u0006\u0002\u0010\u000f\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u0007¢\u0006\u0002\u0010\u0011\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u0007¢\u0006\u0002\u0010\u0013\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0007¢\u0006\u0002\u0010\u0015\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0007¢\u0006\u0002\u0010\u0017\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"oneOf", "Lio/realm/RealmQuery;", "T", "Lio/realm/RealmModel;", "propertyName", "", "value", "", "Ljava/util/Date;", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/util/Date;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Boolean;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Byte;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Double;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Float;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Integer;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Long;)Lio/realm/RealmQuery;", "", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/Short;)Lio/realm/RealmQuery;", "casing", "Lio/realm/Case;", "(Lio/realm/RealmQuery;Ljava/lang/String;[Ljava/lang/String;Lio/realm/Case;)Lio/realm/RealmQuery;", "realm-kotlin-extensions_baseRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class RealmQueryExtensionsKt {
    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Boolean[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Double[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Float[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Integer[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Long[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Short[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String[] r3, @org.jetbrains.annotations.NotNull io.realm.Case r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "casing"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3, r4)
            java.lang.String r2 = "this.`in`(propertyName, value, casing)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <T extends io.realm.RealmModel> io.realm.RealmQuery<T> oneOf(@org.jetbrains.annotations.NotNull io.realm.RealmQuery<T> r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Date[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "propertyName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            io.realm.RealmQuery r1 = r1.in(r2, r3)
            java.lang.String r2 = "this.`in`(propertyName, value)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ io.realm.RealmQuery oneOf$default(io.realm.RealmQuery r0, java.lang.String r1, java.lang.String[] r2, io.realm.Case r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L6
            io.realm.Case r3 = io.realm.Case.SENSITIVE
        L6:
            io.realm.RealmQuery r0 = oneOf(r0, r1, r2, r3)
            return r0
    }
}
