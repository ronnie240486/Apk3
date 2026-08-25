package androidx.activity.result;

/* JADX INFO: loaded from: classes2.dex */
public interface ActivityResultCaller {
    @androidx.annotation.NonNull
    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(@androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r1, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r2);

    @androidx.annotation.NonNull
    <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(@androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r1, @androidx.annotation.NonNull androidx.activity.result.ActivityResultRegistry r2, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r3);
}
