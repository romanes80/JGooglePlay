// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Requests.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class InnerResponseProto extends Message {

  public static final List<PrefetchedBundleProto> DEFAULT_PREFETCHEDBUNDLE = Collections.emptyList();

  @ProtoField(tag = 2)
  public final ResponsePropertiesProto responseProperties;

  @ProtoField(tag = 3)
  public final AssetsResponseProto assetsResponse;

  @ProtoField(tag = 4)
  public final CommentsResponseProto commentsResponse;

  @ProtoField(tag = 5)
  public final ModifyCommentResponseProto modifyCommentResponse;

  @ProtoField(tag = 6)
  public final PurchasePostResponseProto purchasePostResponse;

  @ProtoField(tag = 7)
  public final PurchaseOrderResponseProto purchaseOrderResponse;

  @ProtoField(tag = 8)
  public final ContentSyncResponseProto contentSyncResponse;

  @ProtoField(tag = 9)
  public final GetAssetResponseProto getAssetResponse;

  @ProtoField(tag = 10)
  public final GetImageResponseProto getImageResponse;

  @ProtoField(tag = 11)
  public final RefundResponseProto refundResponse;

  @ProtoField(tag = 12)
  public final PurchaseMetadataResponseProto purchaseMetadataResponse;

  @ProtoField(tag = 13)
  public final GetSubCategoriesResponseProto subCategoriesResponse;

  @ProtoField(tag = 15)
  public final UninstallReasonResponseProto uninstallReasonResponse;

  @ProtoField(tag = 16)
  public final RateCommentResponseProto rateCommentResponse;

  @ProtoField(tag = 17)
  public final CheckLicenseResponseProto checkLicenseResponse;

  @ProtoField(tag = 18)
  public final GetMarketMetadataResponseProto getMarketMetadataResponse;

  @ProtoField(tag = 19, label = REPEATED)
  public final List<PrefetchedBundleProto> prefetchedBundle;

  @ProtoField(tag = 20)
  public final GetCategoriesResponseProto getCategoriesResponse;

  @ProtoField(tag = 21)
  public final GetCarrierInfoResponseProto getCarrierInfoResponse;

  @ProtoField(tag = 23)
  public final RestoreApplicationsResponseProto restoreApplicationResponse;

  @ProtoField(tag = 24)
  public final QuerySuggestionResponseProto querySuggestionResponse;

  @ProtoField(tag = 25)
  public final BillingEventResponseProto billingEventResponse;

  @ProtoField(tag = 26)
  public final PaypalPreapprovalResponseProto paypalPreapprovalResponse;

  @ProtoField(tag = 27)
  public final PaypalPreapprovalDetailsResponseProto paypalPreapprovalDetailsResponse;

  @ProtoField(tag = 28)
  public final PaypalCreateAccountResponseProto paypalCreateAccountResponse;

  @ProtoField(tag = 29)
  public final PaypalPreapprovalCredentialsResponseProto paypalPreapprovalCredentialsResponse;

  @ProtoField(tag = 30)
  public final InAppRestoreTransactionsResponseProto inAppRestoreTransactionsResponse;

  @ProtoField(tag = 31)
  public final InAppPurchaseInformationResponseProto inAppPurchaseInformationResponse;

  @ProtoField(tag = 32)
  public final CheckForNotificationsResponseProto checkForNotificationsResponse;

  @ProtoField(tag = 33)
  public final AckNotificationsResponseProto ackNotificationsResponse;

  @ProtoField(tag = 34)
  public final PurchaseProductResponseProto purchaseProductResponse;

  @ProtoField(tag = 35)
  public final ReconstructDatabaseResponseProto reconstructDatabaseResponse;

  @ProtoField(tag = 36)
  public final PaypalMassageAddressResponseProto paypalMassageAddressResponse;

  @ProtoField(tag = 37)
  public final GetAddressSnippetResponseProto getAddressSnippetResponse;

  public InnerResponseProto(ResponsePropertiesProto responseProperties, AssetsResponseProto assetsResponse, CommentsResponseProto commentsResponse, ModifyCommentResponseProto modifyCommentResponse, PurchasePostResponseProto purchasePostResponse, PurchaseOrderResponseProto purchaseOrderResponse, ContentSyncResponseProto contentSyncResponse, GetAssetResponseProto getAssetResponse, GetImageResponseProto getImageResponse, RefundResponseProto refundResponse, PurchaseMetadataResponseProto purchaseMetadataResponse, GetSubCategoriesResponseProto subCategoriesResponse, UninstallReasonResponseProto uninstallReasonResponse, RateCommentResponseProto rateCommentResponse, CheckLicenseResponseProto checkLicenseResponse, GetMarketMetadataResponseProto getMarketMetadataResponse, List<PrefetchedBundleProto> prefetchedBundle, GetCategoriesResponseProto getCategoriesResponse, GetCarrierInfoResponseProto getCarrierInfoResponse, RestoreApplicationsResponseProto restoreApplicationResponse, QuerySuggestionResponseProto querySuggestionResponse, BillingEventResponseProto billingEventResponse, PaypalPreapprovalResponseProto paypalPreapprovalResponse, PaypalPreapprovalDetailsResponseProto paypalPreapprovalDetailsResponse, PaypalCreateAccountResponseProto paypalCreateAccountResponse, PaypalPreapprovalCredentialsResponseProto paypalPreapprovalCredentialsResponse, InAppRestoreTransactionsResponseProto inAppRestoreTransactionsResponse, InAppPurchaseInformationResponseProto inAppPurchaseInformationResponse, CheckForNotificationsResponseProto checkForNotificationsResponse, AckNotificationsResponseProto ackNotificationsResponse, PurchaseProductResponseProto purchaseProductResponse, ReconstructDatabaseResponseProto reconstructDatabaseResponse, PaypalMassageAddressResponseProto paypalMassageAddressResponse, GetAddressSnippetResponseProto getAddressSnippetResponse) {
    this.responseProperties = responseProperties;
    this.assetsResponse = assetsResponse;
    this.commentsResponse = commentsResponse;
    this.modifyCommentResponse = modifyCommentResponse;
    this.purchasePostResponse = purchasePostResponse;
    this.purchaseOrderResponse = purchaseOrderResponse;
    this.contentSyncResponse = contentSyncResponse;
    this.getAssetResponse = getAssetResponse;
    this.getImageResponse = getImageResponse;
    this.refundResponse = refundResponse;
    this.purchaseMetadataResponse = purchaseMetadataResponse;
    this.subCategoriesResponse = subCategoriesResponse;
    this.uninstallReasonResponse = uninstallReasonResponse;
    this.rateCommentResponse = rateCommentResponse;
    this.checkLicenseResponse = checkLicenseResponse;
    this.getMarketMetadataResponse = getMarketMetadataResponse;
    this.prefetchedBundle = immutableCopyOf(prefetchedBundle);
    this.getCategoriesResponse = getCategoriesResponse;
    this.getCarrierInfoResponse = getCarrierInfoResponse;
    this.restoreApplicationResponse = restoreApplicationResponse;
    this.querySuggestionResponse = querySuggestionResponse;
    this.billingEventResponse = billingEventResponse;
    this.paypalPreapprovalResponse = paypalPreapprovalResponse;
    this.paypalPreapprovalDetailsResponse = paypalPreapprovalDetailsResponse;
    this.paypalCreateAccountResponse = paypalCreateAccountResponse;
    this.paypalPreapprovalCredentialsResponse = paypalPreapprovalCredentialsResponse;
    this.inAppRestoreTransactionsResponse = inAppRestoreTransactionsResponse;
    this.inAppPurchaseInformationResponse = inAppPurchaseInformationResponse;
    this.checkForNotificationsResponse = checkForNotificationsResponse;
    this.ackNotificationsResponse = ackNotificationsResponse;
    this.purchaseProductResponse = purchaseProductResponse;
    this.reconstructDatabaseResponse = reconstructDatabaseResponse;
    this.paypalMassageAddressResponse = paypalMassageAddressResponse;
    this.getAddressSnippetResponse = getAddressSnippetResponse;
  }

  private InnerResponseProto(Builder builder) {
    this(builder.responseProperties, builder.assetsResponse, builder.commentsResponse, builder.modifyCommentResponse, builder.purchasePostResponse, builder.purchaseOrderResponse, builder.contentSyncResponse, builder.getAssetResponse, builder.getImageResponse, builder.refundResponse, builder.purchaseMetadataResponse, builder.subCategoriesResponse, builder.uninstallReasonResponse, builder.rateCommentResponse, builder.checkLicenseResponse, builder.getMarketMetadataResponse, builder.prefetchedBundle, builder.getCategoriesResponse, builder.getCarrierInfoResponse, builder.restoreApplicationResponse, builder.querySuggestionResponse, builder.billingEventResponse, builder.paypalPreapprovalResponse, builder.paypalPreapprovalDetailsResponse, builder.paypalCreateAccountResponse, builder.paypalPreapprovalCredentialsResponse, builder.inAppRestoreTransactionsResponse, builder.inAppPurchaseInformationResponse, builder.checkForNotificationsResponse, builder.ackNotificationsResponse, builder.purchaseProductResponse, builder.reconstructDatabaseResponse, builder.paypalMassageAddressResponse, builder.getAddressSnippetResponse);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof InnerResponseProto)) return false;
    InnerResponseProto o = (InnerResponseProto) other;
    return equals(responseProperties, o.responseProperties)
        && equals(assetsResponse, o.assetsResponse)
        && equals(commentsResponse, o.commentsResponse)
        && equals(modifyCommentResponse, o.modifyCommentResponse)
        && equals(purchasePostResponse, o.purchasePostResponse)
        && equals(purchaseOrderResponse, o.purchaseOrderResponse)
        && equals(contentSyncResponse, o.contentSyncResponse)
        && equals(getAssetResponse, o.getAssetResponse)
        && equals(getImageResponse, o.getImageResponse)
        && equals(refundResponse, o.refundResponse)
        && equals(purchaseMetadataResponse, o.purchaseMetadataResponse)
        && equals(subCategoriesResponse, o.subCategoriesResponse)
        && equals(uninstallReasonResponse, o.uninstallReasonResponse)
        && equals(rateCommentResponse, o.rateCommentResponse)
        && equals(checkLicenseResponse, o.checkLicenseResponse)
        && equals(getMarketMetadataResponse, o.getMarketMetadataResponse)
        && equals(prefetchedBundle, o.prefetchedBundle)
        && equals(getCategoriesResponse, o.getCategoriesResponse)
        && equals(getCarrierInfoResponse, o.getCarrierInfoResponse)
        && equals(restoreApplicationResponse, o.restoreApplicationResponse)
        && equals(querySuggestionResponse, o.querySuggestionResponse)
        && equals(billingEventResponse, o.billingEventResponse)
        && equals(paypalPreapprovalResponse, o.paypalPreapprovalResponse)
        && equals(paypalPreapprovalDetailsResponse, o.paypalPreapprovalDetailsResponse)
        && equals(paypalCreateAccountResponse, o.paypalCreateAccountResponse)
        && equals(paypalPreapprovalCredentialsResponse, o.paypalPreapprovalCredentialsResponse)
        && equals(inAppRestoreTransactionsResponse, o.inAppRestoreTransactionsResponse)
        && equals(inAppPurchaseInformationResponse, o.inAppPurchaseInformationResponse)
        && equals(checkForNotificationsResponse, o.checkForNotificationsResponse)
        && equals(ackNotificationsResponse, o.ackNotificationsResponse)
        && equals(purchaseProductResponse, o.purchaseProductResponse)
        && equals(reconstructDatabaseResponse, o.reconstructDatabaseResponse)
        && equals(paypalMassageAddressResponse, o.paypalMassageAddressResponse)
        && equals(getAddressSnippetResponse, o.getAddressSnippetResponse);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = responseProperties != null ? responseProperties.hashCode() : 0;
      result = result * 37 + (assetsResponse != null ? assetsResponse.hashCode() : 0);
      result = result * 37 + (commentsResponse != null ? commentsResponse.hashCode() : 0);
      result = result * 37 + (modifyCommentResponse != null ? modifyCommentResponse.hashCode() : 0);
      result = result * 37 + (purchasePostResponse != null ? purchasePostResponse.hashCode() : 0);
      result = result * 37 + (purchaseOrderResponse != null ? purchaseOrderResponse.hashCode() : 0);
      result = result * 37 + (contentSyncResponse != null ? contentSyncResponse.hashCode() : 0);
      result = result * 37 + (getAssetResponse != null ? getAssetResponse.hashCode() : 0);
      result = result * 37 + (getImageResponse != null ? getImageResponse.hashCode() : 0);
      result = result * 37 + (refundResponse != null ? refundResponse.hashCode() : 0);
      result = result * 37 + (purchaseMetadataResponse != null ? purchaseMetadataResponse.hashCode() : 0);
      result = result * 37 + (subCategoriesResponse != null ? subCategoriesResponse.hashCode() : 0);
      result = result * 37 + (uninstallReasonResponse != null ? uninstallReasonResponse.hashCode() : 0);
      result = result * 37 + (rateCommentResponse != null ? rateCommentResponse.hashCode() : 0);
      result = result * 37 + (checkLicenseResponse != null ? checkLicenseResponse.hashCode() : 0);
      result = result * 37 + (getMarketMetadataResponse != null ? getMarketMetadataResponse.hashCode() : 0);
      result = result * 37 + (prefetchedBundle != null ? prefetchedBundle.hashCode() : 1);
      result = result * 37 + (getCategoriesResponse != null ? getCategoriesResponse.hashCode() : 0);
      result = result * 37 + (getCarrierInfoResponse != null ? getCarrierInfoResponse.hashCode() : 0);
      result = result * 37 + (restoreApplicationResponse != null ? restoreApplicationResponse.hashCode() : 0);
      result = result * 37 + (querySuggestionResponse != null ? querySuggestionResponse.hashCode() : 0);
      result = result * 37 + (billingEventResponse != null ? billingEventResponse.hashCode() : 0);
      result = result * 37 + (paypalPreapprovalResponse != null ? paypalPreapprovalResponse.hashCode() : 0);
      result = result * 37 + (paypalPreapprovalDetailsResponse != null ? paypalPreapprovalDetailsResponse.hashCode() : 0);
      result = result * 37 + (paypalCreateAccountResponse != null ? paypalCreateAccountResponse.hashCode() : 0);
      result = result * 37 + (paypalPreapprovalCredentialsResponse != null ? paypalPreapprovalCredentialsResponse.hashCode() : 0);
      result = result * 37 + (inAppRestoreTransactionsResponse != null ? inAppRestoreTransactionsResponse.hashCode() : 0);
      result = result * 37 + (inAppPurchaseInformationResponse != null ? inAppPurchaseInformationResponse.hashCode() : 0);
      result = result * 37 + (checkForNotificationsResponse != null ? checkForNotificationsResponse.hashCode() : 0);
      result = result * 37 + (ackNotificationsResponse != null ? ackNotificationsResponse.hashCode() : 0);
      result = result * 37 + (purchaseProductResponse != null ? purchaseProductResponse.hashCode() : 0);
      result = result * 37 + (reconstructDatabaseResponse != null ? reconstructDatabaseResponse.hashCode() : 0);
      result = result * 37 + (paypalMassageAddressResponse != null ? paypalMassageAddressResponse.hashCode() : 0);
      result = result * 37 + (getAddressSnippetResponse != null ? getAddressSnippetResponse.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<InnerResponseProto> {

    public ResponsePropertiesProto responseProperties;
    public AssetsResponseProto assetsResponse;
    public CommentsResponseProto commentsResponse;
    public ModifyCommentResponseProto modifyCommentResponse;
    public PurchasePostResponseProto purchasePostResponse;
    public PurchaseOrderResponseProto purchaseOrderResponse;
    public ContentSyncResponseProto contentSyncResponse;
    public GetAssetResponseProto getAssetResponse;
    public GetImageResponseProto getImageResponse;
    public RefundResponseProto refundResponse;
    public PurchaseMetadataResponseProto purchaseMetadataResponse;
    public GetSubCategoriesResponseProto subCategoriesResponse;
    public UninstallReasonResponseProto uninstallReasonResponse;
    public RateCommentResponseProto rateCommentResponse;
    public CheckLicenseResponseProto checkLicenseResponse;
    public GetMarketMetadataResponseProto getMarketMetadataResponse;
    public List<PrefetchedBundleProto> prefetchedBundle;
    public GetCategoriesResponseProto getCategoriesResponse;
    public GetCarrierInfoResponseProto getCarrierInfoResponse;
    public RestoreApplicationsResponseProto restoreApplicationResponse;
    public QuerySuggestionResponseProto querySuggestionResponse;
    public BillingEventResponseProto billingEventResponse;
    public PaypalPreapprovalResponseProto paypalPreapprovalResponse;
    public PaypalPreapprovalDetailsResponseProto paypalPreapprovalDetailsResponse;
    public PaypalCreateAccountResponseProto paypalCreateAccountResponse;
    public PaypalPreapprovalCredentialsResponseProto paypalPreapprovalCredentialsResponse;
    public InAppRestoreTransactionsResponseProto inAppRestoreTransactionsResponse;
    public InAppPurchaseInformationResponseProto inAppPurchaseInformationResponse;
    public CheckForNotificationsResponseProto checkForNotificationsResponse;
    public AckNotificationsResponseProto ackNotificationsResponse;
    public PurchaseProductResponseProto purchaseProductResponse;
    public ReconstructDatabaseResponseProto reconstructDatabaseResponse;
    public PaypalMassageAddressResponseProto paypalMassageAddressResponse;
    public GetAddressSnippetResponseProto getAddressSnippetResponse;

    public Builder() {
    }

    public Builder(InnerResponseProto message) {
      super(message);
      if (message == null) return;
      this.responseProperties = message.responseProperties;
      this.assetsResponse = message.assetsResponse;
      this.commentsResponse = message.commentsResponse;
      this.modifyCommentResponse = message.modifyCommentResponse;
      this.purchasePostResponse = message.purchasePostResponse;
      this.purchaseOrderResponse = message.purchaseOrderResponse;
      this.contentSyncResponse = message.contentSyncResponse;
      this.getAssetResponse = message.getAssetResponse;
      this.getImageResponse = message.getImageResponse;
      this.refundResponse = message.refundResponse;
      this.purchaseMetadataResponse = message.purchaseMetadataResponse;
      this.subCategoriesResponse = message.subCategoriesResponse;
      this.uninstallReasonResponse = message.uninstallReasonResponse;
      this.rateCommentResponse = message.rateCommentResponse;
      this.checkLicenseResponse = message.checkLicenseResponse;
      this.getMarketMetadataResponse = message.getMarketMetadataResponse;
      this.prefetchedBundle = copyOf(message.prefetchedBundle);
      this.getCategoriesResponse = message.getCategoriesResponse;
      this.getCarrierInfoResponse = message.getCarrierInfoResponse;
      this.restoreApplicationResponse = message.restoreApplicationResponse;
      this.querySuggestionResponse = message.querySuggestionResponse;
      this.billingEventResponse = message.billingEventResponse;
      this.paypalPreapprovalResponse = message.paypalPreapprovalResponse;
      this.paypalPreapprovalDetailsResponse = message.paypalPreapprovalDetailsResponse;
      this.paypalCreateAccountResponse = message.paypalCreateAccountResponse;
      this.paypalPreapprovalCredentialsResponse = message.paypalPreapprovalCredentialsResponse;
      this.inAppRestoreTransactionsResponse = message.inAppRestoreTransactionsResponse;
      this.inAppPurchaseInformationResponse = message.inAppPurchaseInformationResponse;
      this.checkForNotificationsResponse = message.checkForNotificationsResponse;
      this.ackNotificationsResponse = message.ackNotificationsResponse;
      this.purchaseProductResponse = message.purchaseProductResponse;
      this.reconstructDatabaseResponse = message.reconstructDatabaseResponse;
      this.paypalMassageAddressResponse = message.paypalMassageAddressResponse;
      this.getAddressSnippetResponse = message.getAddressSnippetResponse;
    }

    public Builder responseProperties(ResponsePropertiesProto responseProperties) {
      this.responseProperties = responseProperties;
      return this;
    }

    public Builder assetsResponse(AssetsResponseProto assetsResponse) {
      this.assetsResponse = assetsResponse;
      return this;
    }

    public Builder commentsResponse(CommentsResponseProto commentsResponse) {
      this.commentsResponse = commentsResponse;
      return this;
    }

    public Builder modifyCommentResponse(ModifyCommentResponseProto modifyCommentResponse) {
      this.modifyCommentResponse = modifyCommentResponse;
      return this;
    }

    public Builder purchasePostResponse(PurchasePostResponseProto purchasePostResponse) {
      this.purchasePostResponse = purchasePostResponse;
      return this;
    }

    public Builder purchaseOrderResponse(PurchaseOrderResponseProto purchaseOrderResponse) {
      this.purchaseOrderResponse = purchaseOrderResponse;
      return this;
    }

    public Builder contentSyncResponse(ContentSyncResponseProto contentSyncResponse) {
      this.contentSyncResponse = contentSyncResponse;
      return this;
    }

    public Builder getAssetResponse(GetAssetResponseProto getAssetResponse) {
      this.getAssetResponse = getAssetResponse;
      return this;
    }

    public Builder getImageResponse(GetImageResponseProto getImageResponse) {
      this.getImageResponse = getImageResponse;
      return this;
    }

    public Builder refundResponse(RefundResponseProto refundResponse) {
      this.refundResponse = refundResponse;
      return this;
    }

    public Builder purchaseMetadataResponse(PurchaseMetadataResponseProto purchaseMetadataResponse) {
      this.purchaseMetadataResponse = purchaseMetadataResponse;
      return this;
    }

    public Builder subCategoriesResponse(GetSubCategoriesResponseProto subCategoriesResponse) {
      this.subCategoriesResponse = subCategoriesResponse;
      return this;
    }

    public Builder uninstallReasonResponse(UninstallReasonResponseProto uninstallReasonResponse) {
      this.uninstallReasonResponse = uninstallReasonResponse;
      return this;
    }

    public Builder rateCommentResponse(RateCommentResponseProto rateCommentResponse) {
      this.rateCommentResponse = rateCommentResponse;
      return this;
    }

    public Builder checkLicenseResponse(CheckLicenseResponseProto checkLicenseResponse) {
      this.checkLicenseResponse = checkLicenseResponse;
      return this;
    }

    public Builder getMarketMetadataResponse(GetMarketMetadataResponseProto getMarketMetadataResponse) {
      this.getMarketMetadataResponse = getMarketMetadataResponse;
      return this;
    }

    public Builder prefetchedBundle(List<PrefetchedBundleProto> prefetchedBundle) {
      this.prefetchedBundle = checkForNulls(prefetchedBundle);
      return this;
    }

    public Builder getCategoriesResponse(GetCategoriesResponseProto getCategoriesResponse) {
      this.getCategoriesResponse = getCategoriesResponse;
      return this;
    }

    public Builder getCarrierInfoResponse(GetCarrierInfoResponseProto getCarrierInfoResponse) {
      this.getCarrierInfoResponse = getCarrierInfoResponse;
      return this;
    }

    public Builder restoreApplicationResponse(RestoreApplicationsResponseProto restoreApplicationResponse) {
      this.restoreApplicationResponse = restoreApplicationResponse;
      return this;
    }

    public Builder querySuggestionResponse(QuerySuggestionResponseProto querySuggestionResponse) {
      this.querySuggestionResponse = querySuggestionResponse;
      return this;
    }

    public Builder billingEventResponse(BillingEventResponseProto billingEventResponse) {
      this.billingEventResponse = billingEventResponse;
      return this;
    }

    public Builder paypalPreapprovalResponse(PaypalPreapprovalResponseProto paypalPreapprovalResponse) {
      this.paypalPreapprovalResponse = paypalPreapprovalResponse;
      return this;
    }

    public Builder paypalPreapprovalDetailsResponse(PaypalPreapprovalDetailsResponseProto paypalPreapprovalDetailsResponse) {
      this.paypalPreapprovalDetailsResponse = paypalPreapprovalDetailsResponse;
      return this;
    }

    public Builder paypalCreateAccountResponse(PaypalCreateAccountResponseProto paypalCreateAccountResponse) {
      this.paypalCreateAccountResponse = paypalCreateAccountResponse;
      return this;
    }

    public Builder paypalPreapprovalCredentialsResponse(PaypalPreapprovalCredentialsResponseProto paypalPreapprovalCredentialsResponse) {
      this.paypalPreapprovalCredentialsResponse = paypalPreapprovalCredentialsResponse;
      return this;
    }

    public Builder inAppRestoreTransactionsResponse(InAppRestoreTransactionsResponseProto inAppRestoreTransactionsResponse) {
      this.inAppRestoreTransactionsResponse = inAppRestoreTransactionsResponse;
      return this;
    }

    public Builder inAppPurchaseInformationResponse(InAppPurchaseInformationResponseProto inAppPurchaseInformationResponse) {
      this.inAppPurchaseInformationResponse = inAppPurchaseInformationResponse;
      return this;
    }

    public Builder checkForNotificationsResponse(CheckForNotificationsResponseProto checkForNotificationsResponse) {
      this.checkForNotificationsResponse = checkForNotificationsResponse;
      return this;
    }

    public Builder ackNotificationsResponse(AckNotificationsResponseProto ackNotificationsResponse) {
      this.ackNotificationsResponse = ackNotificationsResponse;
      return this;
    }

    public Builder purchaseProductResponse(PurchaseProductResponseProto purchaseProductResponse) {
      this.purchaseProductResponse = purchaseProductResponse;
      return this;
    }

    public Builder reconstructDatabaseResponse(ReconstructDatabaseResponseProto reconstructDatabaseResponse) {
      this.reconstructDatabaseResponse = reconstructDatabaseResponse;
      return this;
    }

    public Builder paypalMassageAddressResponse(PaypalMassageAddressResponseProto paypalMassageAddressResponse) {
      this.paypalMassageAddressResponse = paypalMassageAddressResponse;
      return this;
    }

    public Builder getAddressSnippetResponse(GetAddressSnippetResponseProto getAddressSnippetResponse) {
      this.getAddressSnippetResponse = getAddressSnippetResponse;
      return this;
    }

    @Override
    public InnerResponseProto build() {
      return new InnerResponseProto(this);
    }
  }
}