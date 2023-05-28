import request from '@/utils/request'

// 查询网页链接列表
export function listLink(query) {
  return request({
    url: '/panda/link/list',
    method: 'get',
    params: query
  })
}

// 查询网页链接详细
export function getLink(siteId) {
  return request({
    url: '/panda/link/' + siteId,
    method: 'get'
  })
}

// 新增网页链接
export function addLink(data) {
  return request({
    url: '/panda/link',
    method: 'post',
    data: data
  })
}

// 修改网页链接
export function updateLink(data) {
  return request({
    url: '/panda/link',
    method: 'put',
    data: data
  })
}

// 删除网页链接
export function delLink(siteId) {
  return request({
    url: '/panda/link/' + siteId,
    method: 'delete'
  })
}
