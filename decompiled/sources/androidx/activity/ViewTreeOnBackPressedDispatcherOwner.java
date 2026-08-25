package androidx.activity;

/* JADX INFO: compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeOnBackPressedDispatcherOwner", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroid/view/View;", "get", "setViewTreeOnBackPressedDispatcherOwner", "", "onBackPressedDispatcherOwner", "set", "activity_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class ViewTreeOnBackPressedDispatcherOwner {
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.Nullable
    public static final androidx.activity.OnBackPressedDispatcherOwner get(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 r0 = androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1.INSTANCE
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.generateSequence(r1, r0)
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 r0 = androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2.INSTANCE
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.mapNotNull(r1, r0)
            java.lang.Object r1 = kotlin.sequences.SequencesKt.firstOrNull(r1)
            androidx.activity.OnBackPressedDispatcherOwner r1 = (androidx.activity.OnBackPressedDispatcherOwner) r1
            return r1
    }

    @kotlin.jvm.JvmName(name = "set")
    public static final void set(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull androidx.activity.OnBackPressedDispatcherOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onBackPressedDispatcherOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = androidx.activity.R.id.view_tree_on_back_pressed_dispatcher_owner
            r1.setTag(r0, r2)
            return
    }
}
