.class public final Lcom/rencia/integration/RenciaIntegration$AccessNotice;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.implements Ljava/lang/Runnable;

.field private final context:Landroid/content/Context;

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lcom/rencia/integration/RenciaIntegration$AccessNotice;->context:Landroid/content/Context;
    return-void
.end method

.method public run()V
    .locals 3
    iget-object v0, p0, Lcom/rencia/integration/RenciaIntegration$AccessNotice;->context:Landroid/content/Context;
    const-string v1, "MAC n\u00e3o autorizado ou expirado. Use usu\u00e1rio e senha se dispon\u00edvel."
    const/4 v2, 0x1
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    move-result-object v0
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    return-void
.end method
