package androidx.core.database.sqlite;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", "body", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(@org.jetbrains.annotations.NotNull android.database.sqlite.SQLiteDatabase r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.database.sqlite.SQLiteDatabase, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "body"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 == 0) goto L10
            r1.beginTransaction()
            goto L13
        L10:
            r1.beginTransactionNonExclusive()
        L13:
            r2 = 1
            java.lang.Object r3 = r3.invoke(r1)     // Catch: java.lang.Throwable -> L25
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L25
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r3
        L25:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r1.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ java.lang.Object transaction$default(android.database.sqlite.SQLiteDatabase r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L5
            r1 = 1
        L5:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "body"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            if (r1 == 0) goto L15
            r0.beginTransaction()
            goto L18
        L15:
            r0.beginTransactionNonExclusive()
        L18:
            java.lang.Object r1 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L29
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r0.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            return r1
        L29:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r4)
            r0.endTransaction()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r4)
            throw r1
    }
}
