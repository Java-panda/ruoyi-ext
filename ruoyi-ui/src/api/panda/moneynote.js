import request from '@/utils/request'

// 查询记账统计信息
export function getMoneyNoteStat() {
  return request({
    url: '/panda/moneynote/getMoneyNoteStat',
    method: 'get'
  })
}

// 查询熊猫记账列表
export function listMoneynote(query) {
  return request({
    url: '/panda/moneynote/list',
    method: 'get',
    params: query
  })
}

// 查询熊猫记账详细
export function getMoneynote(id) {
  return request({
    url: '/panda/moneynote/' + id,
    method: 'get'
  })
}

// 新增熊猫记账
export function addMoneynote(data) {
  return request({
    url: '/panda/moneynote',
    method: 'post',
    data: data
  })
}

// 修改熊猫记账
export function updateMoneynote(data) {
  return request({
    url: '/panda/moneynote',
    method: 'put',
    data: data
  })
}

// 删除熊猫记账
export function delMoneynote(id) {
  return request({
    url: '/panda/moneynote/' + id,
    method: 'delete'
  })
}
