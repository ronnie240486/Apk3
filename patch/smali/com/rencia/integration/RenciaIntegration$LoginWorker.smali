.class public final Lcom/rencia/integration/RenciaIntegration$LoginWorker;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.implements Ljava/lang/Runnable;

.field private final activity:Landroid/app/Activity;

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lcom/rencia/integration/RenciaIntegration$LoginWorker;->activity:Landroid/app/Activity;
    return-void
.end method

.method public run()V
    .locals 3
    iget-object v0, p0, Lcom/rencia/integration/RenciaIntegration$LoginWorker;->activity:Landroid/app/Activity;
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->sync(Landroid/content/Context;)V
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->checkUpdate(Landroid/content/Context;)V
    invoke-static {v0}, Lcom/rencia/integration/RenciaIntegration;->isAllowed(Landroid/content/Context;)Z
    move-result v1
    if-eqz v1, :cond_0
    new-instance v1, Lcom/rencia/integration/RenciaIntegration$AutoLogin;
    invoke-direct {v1, v0}, Lcom/rencia/integration/RenciaIntegration$AutoLogin;-><init>(Landroid/app/Activity;)V
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    goto :goto_0
    :cond_0
    new-instance v1, Lcom/rencia/integration/RenciaIntegration$AccessNotice;
    invoke-direct {v1, v0}, Lcom/rencia/integration/RenciaIntegration$AccessNotice;-><init>(Landroid/content/Context;)V
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :goto_0
    return-void
.end method
