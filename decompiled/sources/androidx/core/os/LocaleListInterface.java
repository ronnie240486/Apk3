package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
interface LocaleListInterface {
    java.util.Locale get(int r1);

    @androidx.annotation.Nullable
    java.util.Locale getFirstMatch(@androidx.annotation.NonNull java.lang.String[] r1);

    java.lang.Object getLocaleList();

    @androidx.annotation.IntRange(from = -1)
    int indexOf(java.util.Locale r1);

    boolean isEmpty();

    @androidx.annotation.IntRange(from = 0)
    int size();

    java.lang.String toLanguageTags();
}
