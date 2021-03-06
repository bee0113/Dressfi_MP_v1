package com.jang.dressfi.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.jang.dressfi.model.AttFileVO;
import com.jang.dressfi.model.DesignVO;
import com.jang.dressfi.model.FactoryVO;
import com.jang.dressfi.model.FollowVO;
import com.jang.dressfi.model.KnowHowVO;
import com.jang.dressfi.model.PortFolioVO;
import com.jang.dressfi.model.PsalVO;
import com.jang.dressfi.model.SellerVO;
import com.jang.dressfi.model.UserVO;
import com.jang.dressfi.model.iReplyVO;
import com.jang.dressfi.model.khReplyVO;

@Mapper
public interface ProfileMapper {

	// List<ProfileVO> getProfileList(SearchVO searchVO); // 글 목록조회
	//
	// ProfileVO getProfile(String mno); // 글조회
	//
	// int insertProfile(ProfileVO Profile); // 글저장
	//
	// int updateProfile(ProfileVO Profile); // 글수정
	void incfl(FollowVO followVO);// 팔로우 추가

	void delfl(FollowVO followVO);// 팔로우 삭제

	void insertpsal(PsalVO psal);

//	List<PortFolioVO> getdmain();
//
//	List<PortFolioVO> getfmain();
//
//	List<PortFolioVO> getcmain();
	ArrayList<Map<String, Object>> getdmain();

	ArrayList<Map<String, Object>> getfmain();

	ArrayList<Map<String, Object>> getcmain();

	List<KnowHowVO> getkmain();

	List<PsalVO> getsend(String userId);

	List<PsalVO> getrec(String userId);

	PsalVO getpsal(int prno);

	List<UserVO> pgetuser();

	List<DesignVO> pgetdesign(int ano1);

	List<FactoryVO> pgetfactory(int ano1);

	List<SellerVO> pgetseller(int ano1);

	List<FollowVO> pgetfl(String follower);

	List<FollowVO> getflerlist(String following);// 내 팔로우 보기

	List<FollowVO> getflinglist(String follower);// 내 팔로잉 보기

	FollowVO getfl(FollowVO followVO);

	void ilikecnt(int ino); // 게시글 좋아요

	int iviewcnt(int ino); // 게시글 조회수 증가

	void idelknow(int ino); // 게시글 삭제

	void ideletereply(int rino); // 댓글 삭제

	void ilikereplycnt(int rino); // 댓글 좋아요 증가

	int iwritereply(iReplyVO ireply); // 댓글 작성

	List<iReplyVO> igetreply(int ino); // 댓글 보기

	void ireplycnt(int ino); // 댓글 수 증가

	int updateProfile(UserVO userVO);

	int updateMDProfile(DesignVO designVO);

	int updateMFProfile(FactoryVO factoryVO);

	int updateMCProfile(SellerVO sellerVO);

	int updatePwd(UserVO userVO);

	int updateMDPwd(DesignVO designVO);

	int updateMFPwd(FactoryVO factoryVO);

	int updateMCPwd(SellerVO sellerVO);

	int viewcnt(int hno);

	void likecnt(int hno);

	void likereplycnt(int rhno);

	void deletereply(int rhno);

	void delknow(int hno);

	UserVO getProfile(String mno);

	DesignVO getMDProfile(String mdno);

	FactoryVO getMFProfile(String mfno);

	SellerVO getMCProfile(String mcno);

	void deleteProfile(int mno); // 글삭제

	int kwritereply(khReplyVO khreply);// 노하우

	List<khReplyVO> kgetreply(int hno);

	void kreplycnt(int hno);

	List<AttFileVO> getFileList(int bno); // 첨부파일 목록 조회

	AttFileVO getFile(int pno); // 프로필 사진 가져오기

	String getFileName(int fno); // 첨부파일 이용 조회

	int insertFile(AttFileVO file); // 첨부파일 저장

	void deleteFile(int fno); // 첨부파일 삭제

	int insertPortFolio(PortFolioVO portfolioVO);

	ArrayList<PortFolioVO> getPortFolio(PortFolioVO portfolioItem);

	PortFolioVO getPortFolioDeteil(PortFolioVO portfolioVO);

	int insertKnowHow(KnowHowVO knowhowVO);

	KnowHowVO getKnowHowDeteil(KnowHowVO knowhowVO);

	ArrayList<KnowHowVO> getKnowHow(KnowHowVO knowhowVO);

	ArrayList<Map<String, Object>> selectDesign(Map<String, Object> item);

	ArrayList<Map<String, Object>> selectFactory(Map<String, Object> item);

	ArrayList<Map<String, Object>> selectSeller(Map<String, Object> item);
}
