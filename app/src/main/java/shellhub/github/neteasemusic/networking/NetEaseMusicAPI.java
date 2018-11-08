package shellhub.github.neteasemusic.networking;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import shellhub.github.neteasemusic.response.comment.CommentResponse;
import shellhub.github.neteasemusic.response.detail.DetailResponse;
import shellhub.github.neteasemusic.response.login.LoginResponse;
import shellhub.github.neteasemusic.response.search.SearchResponse;
import shellhub.github.neteasemusic.response.search.hot.HotResponse;
import shellhub.github.neteasemusic.util.ConstantUtils;

public interface NetEaseMusicAPI {
    @GET(ConstantUtils.CELLPHONE_API)
    Observable<LoginResponse> loginByPhone(@Query("phone") String phone, @Query("password") String password);

    @GET(ConstantUtils.USER_DETAIL_API)
    Observable<DetailResponse> detail(@Query("uid") String uid);

    @GET(ConstantUtils.SEARCH_API)
    Observable<SearchResponse> search(@Query("keywords") String keywords);

    @GET(ConstantUtils.COMMENT_API)
    Observable<CommentResponse> comment(@Query("id") int id);

    @GET(ConstantUtils.COMMENT_API)
    Observable<CommentResponse> comment(@Query("id") int id, @Query(value = "limit") int limit);

    @GET(ConstantUtils.SEARCH_HOT_API)
    Observable<HotResponse> searchHot();
}
