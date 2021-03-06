// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Requests.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InnerRequestProto extends Message {

  @ProtoField(tag = 3)
  public final RequestSpecificPropertiesProto requestSpecificProperties;

  @ProtoField(tag = 4)
  public final AssetsRequestProto assetRequest;

  @ProtoField(tag = 5)
  public final CommentsRequestProto commentsRequest;

  @ProtoField(tag = 6)
  public final ModifyCommentRequestProto modifyCommentRequest;

  @ProtoField(tag = 7)
  public final PurchasePostRequestProto purchasePostRequest;

  @ProtoField(tag = 8)
  public final PurchaseOrderRequestProto purchaseOrderRequest;

  @ProtoField(tag = 9)
  public final ContentSyncRequestProto contentSyncRequest;

  @ProtoField(tag = 10)
  public final GetAssetRequestProto getAssetRequest;

  @ProtoField(tag = 11)
  public final GetImageRequestProto getImageRequest;

  @ProtoField(tag = 12)
  public final RefundRequestProto refundRequest;

  @ProtoField(tag = 13)
  public final PurchaseMetadataRequestProto purchaseMetadataRequest;

  @ProtoField(tag = 14)
  public final GetSubCategoriesRequestProto subCategoriesRequest;

  @ProtoField(tag = 16)
  public final UninstallReasonRequestProto uninstallReasonRequest;

  @ProtoField(tag = 17)
  public final RateCommentRequestProto rateCommentRequest;

  @ProtoField(tag = 18)
  public final CheckLicenseRequestProto checkLicenseRequest;

  @ProtoField(tag = 19)
  public final GetMarketMetadataRequestProto getMarketMetadataRequest;

  @ProtoField(tag = 21)
  public final GetCategoriesRequestProto getCategoriesRequest;

  @ProtoField(tag = 22)
  public final GetCarrierInfoRequestProto getCarrierInfoRequest;

  @ProtoField(tag = 23)
  public final RemoveAssetRequestProto removeAssetRequest;

  @ProtoField(tag = 24)
  public final RestoreApplicationsRequestProto restoreApplicationsRequest;

  @ProtoField(tag = 25)
  public final QuerySuggestionRequestProto querySuggestionRequest;

  @ProtoField(tag = 26)
  public final BillingEventRequestProto billingEventRequest;

  @ProtoField(tag = 27)
  public final PaypalPreapprovalRequestProto paypalPreapprovalRequest;

  @ProtoField(tag = 28)
  public final PaypalPreapprovalDetailsRequestProto paypalPreapprovalDetailsRequest;

  @ProtoField(tag = 29)
  public final PaypalCreateAccountRequestProto paypalCreateAccountRequest;

  @ProtoField(tag = 30)
  public final PaypalPreapprovalCredentialsRequestProto paypalPreapprovalCredentialsRequest;

  @ProtoField(tag = 31)
  public final InAppRestoreTransactionsRequestProto inAppRestoreTransactionsRequest;

  @ProtoField(tag = 32)
  public final InAppPurchaseInformationRequestProto inAppPurchaseInformationRequest;

  @ProtoField(tag = 33)
  public final CheckForNotificationsRequestProto checkForNotificationsRequest;

  @ProtoField(tag = 34)
  public final AckNotificationsRequestProto ackNotificationsRequest;

  @ProtoField(tag = 35)
  public final PurchaseProductRequestProto purchaseProductRequest;

  @ProtoField(tag = 36)
  public final ReconstructDatabaseRequestProto reconstructDatabaseRequest;

  @ProtoField(tag = 37)
  public final PaypalMassageAddressRequestProto paypalMassageAddressRequest;

  @ProtoField(tag = 38)
  public final GetAddressSnippetRequestProto getAddressSnippetRequest;

  public InnerRequestProto(RequestSpecificPropertiesProto requestSpecificProperties, AssetsRequestProto assetRequest, CommentsRequestProto commentsRequest, ModifyCommentRequestProto modifyCommentRequest, PurchasePostRequestProto purchasePostRequest, PurchaseOrderRequestProto purchaseOrderRequest, ContentSyncRequestProto contentSyncRequest, GetAssetRequestProto getAssetRequest, GetImageRequestProto getImageRequest, RefundRequestProto refundRequest, PurchaseMetadataRequestProto purchaseMetadataRequest, GetSubCategoriesRequestProto subCategoriesRequest, UninstallReasonRequestProto uninstallReasonRequest, RateCommentRequestProto rateCommentRequest, CheckLicenseRequestProto checkLicenseRequest, GetMarketMetadataRequestProto getMarketMetadataRequest, GetCategoriesRequestProto getCategoriesRequest, GetCarrierInfoRequestProto getCarrierInfoRequest, RemoveAssetRequestProto removeAssetRequest, RestoreApplicationsRequestProto restoreApplicationsRequest, QuerySuggestionRequestProto querySuggestionRequest, BillingEventRequestProto billingEventRequest, PaypalPreapprovalRequestProto paypalPreapprovalRequest, PaypalPreapprovalDetailsRequestProto paypalPreapprovalDetailsRequest, PaypalCreateAccountRequestProto paypalCreateAccountRequest, PaypalPreapprovalCredentialsRequestProto paypalPreapprovalCredentialsRequest, InAppRestoreTransactionsRequestProto inAppRestoreTransactionsRequest, InAppPurchaseInformationRequestProto inAppPurchaseInformationRequest, CheckForNotificationsRequestProto checkForNotificationsRequest, AckNotificationsRequestProto ackNotificationsRequest, PurchaseProductRequestProto purchaseProductRequest, ReconstructDatabaseRequestProto reconstructDatabaseRequest, PaypalMassageAddressRequestProto paypalMassageAddressRequest, GetAddressSnippetRequestProto getAddressSnippetRequest) {
    this.requestSpecificProperties = requestSpecificProperties;
    this.assetRequest = assetRequest;
    this.commentsRequest = commentsRequest;
    this.modifyCommentRequest = modifyCommentRequest;
    this.purchasePostRequest = purchasePostRequest;
    this.purchaseOrderRequest = purchaseOrderRequest;
    this.contentSyncRequest = contentSyncRequest;
    this.getAssetRequest = getAssetRequest;
    this.getImageRequest = getImageRequest;
    this.refundRequest = refundRequest;
    this.purchaseMetadataRequest = purchaseMetadataRequest;
    this.subCategoriesRequest = subCategoriesRequest;
    this.uninstallReasonRequest = uninstallReasonRequest;
    this.rateCommentRequest = rateCommentRequest;
    this.checkLicenseRequest = checkLicenseRequest;
    this.getMarketMetadataRequest = getMarketMetadataRequest;
    this.getCategoriesRequest = getCategoriesRequest;
    this.getCarrierInfoRequest = getCarrierInfoRequest;
    this.removeAssetRequest = removeAssetRequest;
    this.restoreApplicationsRequest = restoreApplicationsRequest;
    this.querySuggestionRequest = querySuggestionRequest;
    this.billingEventRequest = billingEventRequest;
    this.paypalPreapprovalRequest = paypalPreapprovalRequest;
    this.paypalPreapprovalDetailsRequest = paypalPreapprovalDetailsRequest;
    this.paypalCreateAccountRequest = paypalCreateAccountRequest;
    this.paypalPreapprovalCredentialsRequest = paypalPreapprovalCredentialsRequest;
    this.inAppRestoreTransactionsRequest = inAppRestoreTransactionsRequest;
    this.inAppPurchaseInformationRequest = inAppPurchaseInformationRequest;
    this.checkForNotificationsRequest = checkForNotificationsRequest;
    this.ackNotificationsRequest = ackNotificationsRequest;
    this.purchaseProductRequest = purchaseProductRequest;
    this.reconstructDatabaseRequest = reconstructDatabaseRequest;
    this.paypalMassageAddressRequest = paypalMassageAddressRequest;
    this.getAddressSnippetRequest = getAddressSnippetRequest;
  }

  private InnerRequestProto(Builder builder) {
    this(builder.requestSpecificProperties, builder.assetRequest, builder.commentsRequest, builder.modifyCommentRequest, builder.purchasePostRequest, builder.purchaseOrderRequest, builder.contentSyncRequest, builder.getAssetRequest, builder.getImageRequest, builder.refundRequest, builder.purchaseMetadataRequest, builder.subCategoriesRequest, builder.uninstallReasonRequest, builder.rateCommentRequest, builder.checkLicenseRequest, builder.getMarketMetadataRequest, builder.getCategoriesRequest, builder.getCarrierInfoRequest, builder.removeAssetRequest, builder.restoreApplicationsRequest, builder.querySuggestionRequest, builder.billingEventRequest, builder.paypalPreapprovalRequest, builder.paypalPreapprovalDetailsRequest, builder.paypalCreateAccountRequest, builder.paypalPreapprovalCredentialsRequest, builder.inAppRestoreTransactionsRequest, builder.inAppPurchaseInformationRequest, builder.checkForNotificationsRequest, builder.ackNotificationsRequest, builder.purchaseProductRequest, builder.reconstructDatabaseRequest, builder.paypalMassageAddressRequest, builder.getAddressSnippetRequest);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InnerRequestProto)) return false;
    InnerRequestProto o = (InnerRequestProto) other;
    return equals(requestSpecificProperties, o.requestSpecificProperties)
        && equals(assetRequest, o.assetRequest)
        && equals(commentsRequest, o.commentsRequest)
        && equals(modifyCommentRequest, o.modifyCommentRequest)
        && equals(purchasePostRequest, o.purchasePostRequest)
        && equals(purchaseOrderRequest, o.purchaseOrderRequest)
        && equals(contentSyncRequest, o.contentSyncRequest)
        && equals(getAssetRequest, o.getAssetRequest)
        && equals(getImageRequest, o.getImageRequest)
        && equals(refundRequest, o.refundRequest)
        && equals(purchaseMetadataRequest, o.purchaseMetadataRequest)
        && equals(subCategoriesRequest, o.subCategoriesRequest)
        && equals(uninstallReasonRequest, o.uninstallReasonRequest)
        && equals(rateCommentRequest, o.rateCommentRequest)
        && equals(checkLicenseRequest, o.checkLicenseRequest)
        && equals(getMarketMetadataRequest, o.getMarketMetadataRequest)
        && equals(getCategoriesRequest, o.getCategoriesRequest)
        && equals(getCarrierInfoRequest, o.getCarrierInfoRequest)
        && equals(removeAssetRequest, o.removeAssetRequest)
        && equals(restoreApplicationsRequest, o.restoreApplicationsRequest)
        && equals(querySuggestionRequest, o.querySuggestionRequest)
        && equals(billingEventRequest, o.billingEventRequest)
        && equals(paypalPreapprovalRequest, o.paypalPreapprovalRequest)
        && equals(paypalPreapprovalDetailsRequest, o.paypalPreapprovalDetailsRequest)
        && equals(paypalCreateAccountRequest, o.paypalCreateAccountRequest)
        && equals(paypalPreapprovalCredentialsRequest, o.paypalPreapprovalCredentialsRequest)
        && equals(inAppRestoreTransactionsRequest, o.inAppRestoreTransactionsRequest)
        && equals(inAppPurchaseInformationRequest, o.inAppPurchaseInformationRequest)
        && equals(checkForNotificationsRequest, o.checkForNotificationsRequest)
        && equals(ackNotificationsRequest, o.ackNotificationsRequest)
        && equals(purchaseProductRequest, o.purchaseProductRequest)
        && equals(reconstructDatabaseRequest, o.reconstructDatabaseRequest)
        && equals(paypalMassageAddressRequest, o.paypalMassageAddressRequest)
        && equals(getAddressSnippetRequest, o.getAddressSnippetRequest);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = requestSpecificProperties != null ? requestSpecificProperties.hashCode() : 0;
      result = result * 37 + (assetRequest != null ? assetRequest.hashCode() : 0);
      result = result * 37 + (commentsRequest != null ? commentsRequest.hashCode() : 0);
      result = result * 37 + (modifyCommentRequest != null ? modifyCommentRequest.hashCode() : 0);
      result = result * 37 + (purchasePostRequest != null ? purchasePostRequest.hashCode() : 0);
      result = result * 37 + (purchaseOrderRequest != null ? purchaseOrderRequest.hashCode() : 0);
      result = result * 37 + (contentSyncRequest != null ? contentSyncRequest.hashCode() : 0);
      result = result * 37 + (getAssetRequest != null ? getAssetRequest.hashCode() : 0);
      result = result * 37 + (getImageRequest != null ? getImageRequest.hashCode() : 0);
      result = result * 37 + (refundRequest != null ? refundRequest.hashCode() : 0);
      result = result * 37 + (purchaseMetadataRequest != null ? purchaseMetadataRequest.hashCode() : 0);
      result = result * 37 + (subCategoriesRequest != null ? subCategoriesRequest.hashCode() : 0);
      result = result * 37 + (uninstallReasonRequest != null ? uninstallReasonRequest.hashCode() : 0);
      result = result * 37 + (rateCommentRequest != null ? rateCommentRequest.hashCode() : 0);
      result = result * 37 + (checkLicenseRequest != null ? checkLicenseRequest.hashCode() : 0);
      result = result * 37 + (getMarketMetadataRequest != null ? getMarketMetadataRequest.hashCode() : 0);
      result = result * 37 + (getCategoriesRequest != null ? getCategoriesRequest.hashCode() : 0);
      result = result * 37 + (getCarrierInfoRequest != null ? getCarrierInfoRequest.hashCode() : 0);
      result = result * 37 + (removeAssetRequest != null ? removeAssetRequest.hashCode() : 0);
      result = result * 37 + (restoreApplicationsRequest != null ? restoreApplicationsRequest.hashCode() : 0);
      result = result * 37 + (querySuggestionRequest != null ? querySuggestionRequest.hashCode() : 0);
      result = result * 37 + (billingEventRequest != null ? billingEventRequest.hashCode() : 0);
      result = result * 37 + (paypalPreapprovalRequest != null ? paypalPreapprovalRequest.hashCode() : 0);
      result = result * 37 + (paypalPreapprovalDetailsRequest != null ? paypalPreapprovalDetailsRequest.hashCode() : 0);
      result = result * 37 + (paypalCreateAccountRequest != null ? paypalCreateAccountRequest.hashCode() : 0);
      result = result * 37 + (paypalPreapprovalCredentialsRequest != null ? paypalPreapprovalCredentialsRequest.hashCode() : 0);
      result = result * 37 + (inAppRestoreTransactionsRequest != null ? inAppRestoreTransactionsRequest.hashCode() : 0);
      result = result * 37 + (inAppPurchaseInformationRequest != null ? inAppPurchaseInformationRequest.hashCode() : 0);
      result = result * 37 + (checkForNotificationsRequest != null ? checkForNotificationsRequest.hashCode() : 0);
      result = result * 37 + (ackNotificationsRequest != null ? ackNotificationsRequest.hashCode() : 0);
      result = result * 37 + (purchaseProductRequest != null ? purchaseProductRequest.hashCode() : 0);
      result = result * 37 + (reconstructDatabaseRequest != null ? reconstructDatabaseRequest.hashCode() : 0);
      result = result * 37 + (paypalMassageAddressRequest != null ? paypalMassageAddressRequest.hashCode() : 0);
      result = result * 37 + (getAddressSnippetRequest != null ? getAddressSnippetRequest.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<InnerRequestProto> {

    public RequestSpecificPropertiesProto requestSpecificProperties;
    public AssetsRequestProto assetRequest;
    public CommentsRequestProto commentsRequest;
    public ModifyCommentRequestProto modifyCommentRequest;
    public PurchasePostRequestProto purchasePostRequest;
    public PurchaseOrderRequestProto purchaseOrderRequest;
    public ContentSyncRequestProto contentSyncRequest;
    public GetAssetRequestProto getAssetRequest;
    public GetImageRequestProto getImageRequest;
    public RefundRequestProto refundRequest;
    public PurchaseMetadataRequestProto purchaseMetadataRequest;
    public GetSubCategoriesRequestProto subCategoriesRequest;
    public UninstallReasonRequestProto uninstallReasonRequest;
    public RateCommentRequestProto rateCommentRequest;
    public CheckLicenseRequestProto checkLicenseRequest;
    public GetMarketMetadataRequestProto getMarketMetadataRequest;
    public GetCategoriesRequestProto getCategoriesRequest;
    public GetCarrierInfoRequestProto getCarrierInfoRequest;
    public RemoveAssetRequestProto removeAssetRequest;
    public RestoreApplicationsRequestProto restoreApplicationsRequest;
    public QuerySuggestionRequestProto querySuggestionRequest;
    public BillingEventRequestProto billingEventRequest;
    public PaypalPreapprovalRequestProto paypalPreapprovalRequest;
    public PaypalPreapprovalDetailsRequestProto paypalPreapprovalDetailsRequest;
    public PaypalCreateAccountRequestProto paypalCreateAccountRequest;
    public PaypalPreapprovalCredentialsRequestProto paypalPreapprovalCredentialsRequest;
    public InAppRestoreTransactionsRequestProto inAppRestoreTransactionsRequest;
    public InAppPurchaseInformationRequestProto inAppPurchaseInformationRequest;
    public CheckForNotificationsRequestProto checkForNotificationsRequest;
    public AckNotificationsRequestProto ackNotificationsRequest;
    public PurchaseProductRequestProto purchaseProductRequest;
    public ReconstructDatabaseRequestProto reconstructDatabaseRequest;
    public PaypalMassageAddressRequestProto paypalMassageAddressRequest;
    public GetAddressSnippetRequestProto getAddressSnippetRequest;

    public Builder() {
    }

    public Builder(InnerRequestProto message) {
      super(message);
      if (message == null) return;
      this.requestSpecificProperties = message.requestSpecificProperties;
      this.assetRequest = message.assetRequest;
      this.commentsRequest = message.commentsRequest;
      this.modifyCommentRequest = message.modifyCommentRequest;
      this.purchasePostRequest = message.purchasePostRequest;
      this.purchaseOrderRequest = message.purchaseOrderRequest;
      this.contentSyncRequest = message.contentSyncRequest;
      this.getAssetRequest = message.getAssetRequest;
      this.getImageRequest = message.getImageRequest;
      this.refundRequest = message.refundRequest;
      this.purchaseMetadataRequest = message.purchaseMetadataRequest;
      this.subCategoriesRequest = message.subCategoriesRequest;
      this.uninstallReasonRequest = message.uninstallReasonRequest;
      this.rateCommentRequest = message.rateCommentRequest;
      this.checkLicenseRequest = message.checkLicenseRequest;
      this.getMarketMetadataRequest = message.getMarketMetadataRequest;
      this.getCategoriesRequest = message.getCategoriesRequest;
      this.getCarrierInfoRequest = message.getCarrierInfoRequest;
      this.removeAssetRequest = message.removeAssetRequest;
      this.restoreApplicationsRequest = message.restoreApplicationsRequest;
      this.querySuggestionRequest = message.querySuggestionRequest;
      this.billingEventRequest = message.billingEventRequest;
      this.paypalPreapprovalRequest = message.paypalPreapprovalRequest;
      this.paypalPreapprovalDetailsRequest = message.paypalPreapprovalDetailsRequest;
      this.paypalCreateAccountRequest = message.paypalCreateAccountRequest;
      this.paypalPreapprovalCredentialsRequest = message.paypalPreapprovalCredentialsRequest;
      this.inAppRestoreTransactionsRequest = message.inAppRestoreTransactionsRequest;
      this.inAppPurchaseInformationRequest = message.inAppPurchaseInformationRequest;
      this.checkForNotificationsRequest = message.checkForNotificationsRequest;
      this.ackNotificationsRequest = message.ackNotificationsRequest;
      this.purchaseProductRequest = message.purchaseProductRequest;
      this.reconstructDatabaseRequest = message.reconstructDatabaseRequest;
      this.paypalMassageAddressRequest = message.paypalMassageAddressRequest;
      this.getAddressSnippetRequest = message.getAddressSnippetRequest;
    }

    public Builder requestSpecificProperties(RequestSpecificPropertiesProto requestSpecificProperties) {
      this.requestSpecificProperties = requestSpecificProperties;
      return this;
    }

    public Builder assetRequest(AssetsRequestProto assetRequest) {
      this.assetRequest = assetRequest;
      return this;
    }

    public Builder commentsRequest(CommentsRequestProto commentsRequest) {
      this.commentsRequest = commentsRequest;
      return this;
    }

    public Builder modifyCommentRequest(ModifyCommentRequestProto modifyCommentRequest) {
      this.modifyCommentRequest = modifyCommentRequest;
      return this;
    }

    public Builder purchasePostRequest(PurchasePostRequestProto purchasePostRequest) {
      this.purchasePostRequest = purchasePostRequest;
      return this;
    }

    public Builder purchaseOrderRequest(PurchaseOrderRequestProto purchaseOrderRequest) {
      this.purchaseOrderRequest = purchaseOrderRequest;
      return this;
    }

    public Builder contentSyncRequest(ContentSyncRequestProto contentSyncRequest) {
      this.contentSyncRequest = contentSyncRequest;
      return this;
    }

    public Builder getAssetRequest(GetAssetRequestProto getAssetRequest) {
      this.getAssetRequest = getAssetRequest;
      return this;
    }

    public Builder getImageRequest(GetImageRequestProto getImageRequest) {
      this.getImageRequest = getImageRequest;
      return this;
    }

    public Builder refundRequest(RefundRequestProto refundRequest) {
      this.refundRequest = refundRequest;
      return this;
    }

    public Builder purchaseMetadataRequest(PurchaseMetadataRequestProto purchaseMetadataRequest) {
      this.purchaseMetadataRequest = purchaseMetadataRequest;
      return this;
    }

    public Builder subCategoriesRequest(GetSubCategoriesRequestProto subCategoriesRequest) {
      this.subCategoriesRequest = subCategoriesRequest;
      return this;
    }

    public Builder uninstallReasonRequest(UninstallReasonRequestProto uninstallReasonRequest) {
      this.uninstallReasonRequest = uninstallReasonRequest;
      return this;
    }

    public Builder rateCommentRequest(RateCommentRequestProto rateCommentRequest) {
      this.rateCommentRequest = rateCommentRequest;
      return this;
    }

    public Builder checkLicenseRequest(CheckLicenseRequestProto checkLicenseRequest) {
      this.checkLicenseRequest = checkLicenseRequest;
      return this;
    }

    public Builder getMarketMetadataRequest(GetMarketMetadataRequestProto getMarketMetadataRequest) {
      this.getMarketMetadataRequest = getMarketMetadataRequest;
      return this;
    }

    public Builder getCategoriesRequest(GetCategoriesRequestProto getCategoriesRequest) {
      this.getCategoriesRequest = getCategoriesRequest;
      return this;
    }

    public Builder getCarrierInfoRequest(GetCarrierInfoRequestProto getCarrierInfoRequest) {
      this.getCarrierInfoRequest = getCarrierInfoRequest;
      return this;
    }

    public Builder removeAssetRequest(RemoveAssetRequestProto removeAssetRequest) {
      this.removeAssetRequest = removeAssetRequest;
      return this;
    }

    public Builder restoreApplicationsRequest(RestoreApplicationsRequestProto restoreApplicationsRequest) {
      this.restoreApplicationsRequest = restoreApplicationsRequest;
      return this;
    }

    public Builder querySuggestionRequest(QuerySuggestionRequestProto querySuggestionRequest) {
      this.querySuggestionRequest = querySuggestionRequest;
      return this;
    }

    public Builder billingEventRequest(BillingEventRequestProto billingEventRequest) {
      this.billingEventRequest = billingEventRequest;
      return this;
    }

    public Builder paypalPreapprovalRequest(PaypalPreapprovalRequestProto paypalPreapprovalRequest) {
      this.paypalPreapprovalRequest = paypalPreapprovalRequest;
      return this;
    }

    public Builder paypalPreapprovalDetailsRequest(PaypalPreapprovalDetailsRequestProto paypalPreapprovalDetailsRequest) {
      this.paypalPreapprovalDetailsRequest = paypalPreapprovalDetailsRequest;
      return this;
    }

    public Builder paypalCreateAccountRequest(PaypalCreateAccountRequestProto paypalCreateAccountRequest) {
      this.paypalCreateAccountRequest = paypalCreateAccountRequest;
      return this;
    }

    public Builder paypalPreapprovalCredentialsRequest(PaypalPreapprovalCredentialsRequestProto paypalPreapprovalCredentialsRequest) {
      this.paypalPreapprovalCredentialsRequest = paypalPreapprovalCredentialsRequest;
      return this;
    }

    public Builder inAppRestoreTransactionsRequest(InAppRestoreTransactionsRequestProto inAppRestoreTransactionsRequest) {
      this.inAppRestoreTransactionsRequest = inAppRestoreTransactionsRequest;
      return this;
    }

    public Builder inAppPurchaseInformationRequest(InAppPurchaseInformationRequestProto inAppPurchaseInformationRequest) {
      this.inAppPurchaseInformationRequest = inAppPurchaseInformationRequest;
      return this;
    }

    public Builder checkForNotificationsRequest(CheckForNotificationsRequestProto checkForNotificationsRequest) {
      this.checkForNotificationsRequest = checkForNotificationsRequest;
      return this;
    }

    public Builder ackNotificationsRequest(AckNotificationsRequestProto ackNotificationsRequest) {
      this.ackNotificationsRequest = ackNotificationsRequest;
      return this;
    }

    public Builder purchaseProductRequest(PurchaseProductRequestProto purchaseProductRequest) {
      this.purchaseProductRequest = purchaseProductRequest;
      return this;
    }

    public Builder reconstructDatabaseRequest(ReconstructDatabaseRequestProto reconstructDatabaseRequest) {
      this.reconstructDatabaseRequest = reconstructDatabaseRequest;
      return this;
    }

    public Builder paypalMassageAddressRequest(PaypalMassageAddressRequestProto paypalMassageAddressRequest) {
      this.paypalMassageAddressRequest = paypalMassageAddressRequest;
      return this;
    }

    public Builder getAddressSnippetRequest(GetAddressSnippetRequestProto getAddressSnippetRequest) {
      this.getAddressSnippetRequest = getAddressSnippetRequest;
      return this;
    }

    @Override
    public InnerRequestProto build() {
      return new InnerRequestProto(this);
    }
  }
}
