package com.ithaka.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CartModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("discounted_amount")
    @Expose
    private Double discountedAmount;
    @SerializedName("conversation_id")
    @Expose
    private String conversationId;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("departure_date")
    @Expose
    private String departureDate;
    @SerializedName("items_count")
    @Expose
    private Integer itemsCount;
    @SerializedName("pnr")
    @Expose
    private String pnr;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("sub_status")
    @Expose
    private String subStatus;
    @SerializedName("user_email")
    @Expose
    private String userEmail;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("user_pan")
    @Expose
    private String userPan;
    @SerializedName("user_phone_number")
    @Expose
    private String userPhoneNumber;
    @SerializedName("offer_text")
    @Expose
    private String offerText;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("currency_symbol")
    @Expose
    private String currencySymbol;
    @SerializedName("adults")
    @Expose
    private Integer adults;
    @SerializedName("child")
    @Expose
    private Integer child;
    @SerializedName("activity_transactions")
    @Expose
    private List<ActivityTransaction> activityTransactions = null;
    @SerializedName("flight_transactions")
    @Expose
    private List<Object> flightTransactions = null;
    @SerializedName("hotel_transactions")
    @Expose
    private List<Object> hotelTransactions = null;
    @SerializedName("transfer_transactions")
    @Expose
    private List<Object> transferTransactions = null;
    @SerializedName("other_transactions")
    @Expose
    private List<Object> otherTransactions = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(Integer itemsCount) {
        this.itemsCount = itemsCount;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPan() {
        return userPan;
    }

    public void setUserPan(String userPan) {
        this.userPan = userPan;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getOfferText() {
        return offerText;
    }

    public void setOfferText(String offerText) {
        this.offerText = offerText;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }

    public List<ActivityTransaction> getActivityTransactions() {
        return activityTransactions;
    }

    public void setActivityTransactions(List<ActivityTransaction> activityTransactions) {
        this.activityTransactions = activityTransactions;
    }

    public List<Object> getFlightTransactions() {
        return flightTransactions;
    }

    public void setFlightTransactions(List<Object> flightTransactions) {
        this.flightTransactions = flightTransactions;
    }

    public List<Object> getHotelTransactions() {
        return hotelTransactions;
    }

    public void setHotelTransactions(List<Object> hotelTransactions) {
        this.hotelTransactions = hotelTransactions;
    }

    public List<Object> getTransferTransactions() {
        return transferTransactions;
    }

    public void setTransferTransactions(List<Object> transferTransactions) {
        this.transferTransactions = transferTransactions;
    }

    public List<Object> getOtherTransactions() {
        return otherTransactions;
    }

    public void setOtherTransactions(List<Object> otherTransactions) {
        this.otherTransactions = otherTransactions;
    }


    public class Info {

        @SerializedName("user_info_id")
        @Expose
        private Integer userInfoId;
        @SerializedName("data_type")
        @Expose
        private String dataType;
        @SerializedName("display_text")
        @Expose
        private String displayText;
        @SerializedName("info_type")
        @Expose
        private String infoType;
        @SerializedName("min")
        @Expose
        private Integer min;
        @SerializedName("max")
        @Expose
        private Integer max;
        @SerializedName("values")
        @Expose
        private List<Object> values = null;
        @SerializedName("info")
        @Expose
        private String info;

        public Integer getUserInfoId() {
            return userInfoId;
        }

        public void setUserInfoId(Integer userInfoId) {
            this.userInfoId = userInfoId;
        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getDisplayText() {
            return displayText;
        }

        public void setDisplayText(String displayText) {
            this.displayText = displayText;
        }

        public String getInfoType() {
            return infoType;
        }

        public void setInfoType(String infoType) {
            this.infoType = infoType;
        }

        public Integer getMin() {
            return min;
        }

        public void setMin(Integer min) {
            this.min = min;
        }

        public Integer getMax() {
            return max;
        }

        public void setMax(Integer max) {
            this.max = max;
        }

        public List<Object> getValues() {
            return values;
        }

        public void setValues(List<Object> values) {
            this.values = values;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

    }

    public class TransactionUserInfo {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("amount")
        @Expose
        private Integer amount;
        @SerializedName("discounted_amount")
        @Expose
        private Integer discountedAmount;
        @SerializedName("cost_amount")
        @Expose
        private String costAmount;
        @SerializedName("domain_type")
        @Expose
        private String domainType;
        @SerializedName("domain_id")
        @Expose
        private Integer domainId;
        @SerializedName("individual_display_text")
        @Expose
        private String individualDisplayText;
        @SerializedName("individual_id")
        @Expose
        private Integer individualId;
        @SerializedName("infos")
        @Expose
        private List<List<Info>> infos = null;
        @SerializedName("pax")
        @Expose
        private Integer pax;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Integer getDiscountedAmount() {
            return discountedAmount;
        }

        public void setDiscountedAmount(Integer discountedAmount) {
            this.discountedAmount = discountedAmount;
        }

        public String getCostAmount() {
            return costAmount;
        }

        public void setCostAmount(String costAmount) {
            this.costAmount = costAmount;
        }

        public String getDomainType() {
            return domainType;
        }

        public void setDomainType(String domainType) {
            this.domainType = domainType;
        }

        public Integer getDomainId() {
            return domainId;
        }

        public void setDomainId(Integer domainId) {
            this.domainId = domainId;
        }

        public String getIndividualDisplayText() {
            return individualDisplayText;
        }

        public void setIndividualDisplayText(String individualDisplayText) {
            this.individualDisplayText = individualDisplayText;
        }

        public Integer getIndividualId() {
            return individualId;
        }

        public void setIndividualId(Integer individualId) {
            this.individualId = individualId;
        }

        public List<List<Info>> getInfos() {
            return infos;
        }

        public void setInfos(List<List<Info>> infos) {
            this.infos = infos;
        }

        public Integer getPax() {
            return pax;
        }

        public void setPax(Integer pax) {
            this.pax = pax;
        }

    }

    public class ActivityTransaction {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("booking_transaction_id")
        @Expose
        private Integer bookingTransactionId;
        @SerializedName("activity_id")
        @Expose
        private Integer activityId;
        @SerializedName("activity_title")
        @Expose
        private String activityTitle;
        @SerializedName("add_ons")
        @Expose
        private List<AddOn> addOns = null;
        @SerializedName("amount")
        @Expose
        private Double amount;
        @SerializedName("discounted_amount")
        @Expose
        private Double discountedAmount;
        @SerializedName("cost_amount")
        @Expose
        private String costAmount;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("start_time")
        @Expose
        private String startTime;
        @SerializedName("variant_id")
        @Expose
        private Integer variantId;
        @SerializedName("variant_title")
        @Expose
        private String variantTitle;
        @SerializedName("inclusions")
        @Expose
        private List<String> inclusions = null;
        @SerializedName("exclusions")
        @Expose
        private List<String> exclusions = null;
        @SerializedName("cancellation_policy")
        @Expose
        private List<String> cancellationPolicy = null;
        @SerializedName("cancellation_type")
        @Expose
        private String cancellationType;
        @SerializedName("free_cancellation_hours")
        @Expose
        private Integer freeCancellationHours;
        @SerializedName("voucher_url")
        @Expose
        private String voucherUrl;
        @SerializedName("voucher_availability_date")
        @Expose
        private String voucherAvailabilityDate;
        @SerializedName("vendor_contact")
        @Expose
        private String vendorContact;
        @SerializedName("vendor_contact_type")
        @Expose
        private String vendorContactType;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("image_url")
        @Expose
        private String imageUrl;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("transaction_user_infos")
        @Expose
        private List<TransactionUserInfo> transactionUserInfos = null;
        @SerializedName("pax")
        @Expose
        private Integer pax;
        @SerializedName("is_custom")
        @Expose
        private Boolean isCustom;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getBookingTransactionId() {
            return bookingTransactionId;
        }

        public void setBookingTransactionId(Integer bookingTransactionId) {
            this.bookingTransactionId = bookingTransactionId;
        }

        public Integer getActivityId() {
            return activityId;
        }

        public void setActivityId(Integer activityId) {
            this.activityId = activityId;
        }

        public String getActivityTitle() {
            return activityTitle;
        }

        public void setActivityTitle(String activityTitle) {
            this.activityTitle = activityTitle;
        }

        public List<AddOn> getAddOns() {
            return addOns;
        }

        public void setAddOns(List<AddOn> addOns) {
            this.addOns = addOns;
        }

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public Double getDiscountedAmount() {
            return discountedAmount;
        }

        public void setDiscountedAmount(Double discountedAmount) {
            this.discountedAmount = discountedAmount;
        }

        public String getCostAmount() {
            return costAmount;
        }

        public void setCostAmount(String costAmount) {
            this.costAmount = costAmount;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public Integer getVariantId() {
            return variantId;
        }

        public void setVariantId(Integer variantId) {
            this.variantId = variantId;
        }

        public String getVariantTitle() {
            return variantTitle;
        }

        public void setVariantTitle(String variantTitle) {
            this.variantTitle = variantTitle;
        }

        public List<String> getInclusions() {
            return inclusions;
        }

        public void setInclusions(List<String> inclusions) {
            this.inclusions = inclusions;
        }

        public List<String> getExclusions() {
            return exclusions;
        }

        public void setExclusions(List<String> exclusions) {
            this.exclusions = exclusions;
        }

        public List<String> getCancellationPolicy() {
            return cancellationPolicy;
        }

        public void setCancellationPolicy(List<String> cancellationPolicy) {
            this.cancellationPolicy = cancellationPolicy;
        }

        public String getCancellationType() {
            return cancellationType;
        }

        public void setCancellationType(String cancellationType) {
            this.cancellationType = cancellationType;
        }

        public Integer getFreeCancellationHours() {
            return freeCancellationHours;
        }

        public void setFreeCancellationHours(Integer freeCancellationHours) {
            this.freeCancellationHours = freeCancellationHours;
        }

        public String getVoucherUrl() {
            return voucherUrl;
        }

        public void setVoucherUrl(String voucherUrl) {
            this.voucherUrl = voucherUrl;
        }

        public String getVoucherAvailabilityDate() {
            return voucherAvailabilityDate;
        }

        public void setVoucherAvailabilityDate(String voucherAvailabilityDate) {
            this.voucherAvailabilityDate = voucherAvailabilityDate;
        }

        public String getVendorContact() {
            return vendorContact;
        }

        public void setVendorContact(String vendorContact) {
            this.vendorContact = vendorContact;
        }

        public String getVendorContactType() {
            return vendorContactType;
        }

        public void setVendorContactType(String vendorContactType) {
            this.vendorContactType = vendorContactType;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<TransactionUserInfo> getTransactionUserInfos() {
            return transactionUserInfos;
        }

        public void setTransactionUserInfos(List<TransactionUserInfo> transactionUserInfos) {
            this.transactionUserInfos = transactionUserInfos;
        }

        public Integer getPax() {
            return pax;
        }

        public void setPax(Integer pax) {
            this.pax = pax;
        }

        public Boolean getIsCustom() {
            return isCustom;
        }

        public void setIsCustom(Boolean isCustom) {
            this.isCustom = isCustom;
        }

    }

    public class AddOn {

        @SerializedName("add_on_id")
        @Expose
        private Integer addOnId;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("quantity")
        @Expose
        private Integer quantity;
        @SerializedName("amount")
        @Expose
        private Integer amount;
        @SerializedName("discounted_amount")
        @Expose
        private Integer discountedAmount;

        public Integer getAddOnId() {
            return addOnId;
        }

        public void setAddOnId(Integer addOnId) {
            this.addOnId = addOnId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Integer getDiscountedAmount() {
            return discountedAmount;
        }

        public void setDiscountedAmount(Integer discountedAmount) {
            this.discountedAmount = discountedAmount;
        }

    }

}
