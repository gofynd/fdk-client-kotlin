package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface CatalogDataManager : CatalogApiHelperFace

interface CartDataManager : CartApiHelperFace

interface LeadDataManager : LeadApiHelperFace

interface ThemeDataManager : ThemeApiHelperFace

interface ContentDataManager : ContentApiHelperFace

interface CommunicationDataManager : CommunicationApiHelperFace

interface ShareDataManager : ShareApiHelperFace

interface FileStorageDataManager : FileStorageApiHelperFace

interface PaymentDataManager : PaymentApiHelperFace

interface OrderDataManager : OrderApiHelperFace

interface RewardsDataManager : RewardsApiHelperFace

interface FeedbackDataManager : FeedbackApiHelperFace

interface PosCartDataManager : PosCartApiHelperFace

