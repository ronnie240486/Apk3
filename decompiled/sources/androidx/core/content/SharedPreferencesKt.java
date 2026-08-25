package androidx.core.content;

/* JADX INFO: compiled from: SharedPreferences.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"edit", "", "Landroid/content/SharedPreferences;", "commit", "", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SharedPreferencesKt {
    @android.annotation.SuppressLint({"ApplySharedPref"})
    public static final void edit(@org.jetbrains.annotations.NotNull android.content.SharedPreferences r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r3.invoke(r1)
            if (r2 == 0) goto L1c
            r1.commit()
            goto L1f
        L1c:
            r1.apply()
        L1f:
            return
    }

    public static /* synthetic */ void edit$default(android.content.SharedPreferences r0, boolean r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "editor"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r2.invoke(r0)
            if (r1 == 0) goto L21
            r0.commit()
            goto L24
        L21:
            r0.apply()
        L24:
            return
    }
}
