.class public final Lcom/rencia/integration/RenciaIntegration$MacCopyListener;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.implements Landroid/view/View$OnClickListener;

.field private final context:Landroid/content/Context;
.field private final mac:Ljava/lang/String;

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lcom/rencia/integration/RenciaIntegration$MacCopyListener;->context:Landroid/content/Context;
    iput-object p2, p0, Lcom/rencia/integration/RenciaIntegration$MacCopyListener;->mac:Ljava/lang/String;
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4
    iget-object v0, p0, Lcom/rencia/integration/RenciaIntegration$MacCopyListener;->context:Landroid/content/Context;
    const-string v1, "clipboard"
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    move-result-object v0
    check-cast v0, Landroid/content/ClipboardManager;
    const-string v1, "MAC"
    iget-object v2, p0, Lcom/rencia/integration/RenciaIntegration$MacCopyListener;->mac:Ljava/lang/String;
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;
    move-result-object v1
    invoke-virtual {v0, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    iget-object v0, p0, Lcom/rencia/integration/RenciaIntegration$MacCopyListener;->context:Landroid/content/Context;
    const-string v1, "MAC copiado"
    const/4 v2, 0x0
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    move-result-object v3
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V
    return-void
.end method
